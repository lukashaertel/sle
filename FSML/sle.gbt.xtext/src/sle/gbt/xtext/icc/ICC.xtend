package sle.gbt.xtext.icc

import sle.gbt.index.Index

import static extension sle.gbt.index.CharIndices.*
import static extension sle.gbt.utils.Ranges.*
import static extension sle.gbt.index.Indices.*
import static extension sle.gbt.utils.Iterables.*
import java.util.List
import java.util.HashMap

class ICC {

	/**
	 * Initial value for the length/breadth parameter
	 */
	static public val INITIAL_LBR = 782L

	/**
	 * Reduction factor for the length/breadth parameter
	 */
	static public val DEEPENING_LBR_FACTOR = 2L

	/**
	 * List of terminals in ascending precedence
	 */
	val List<String> terminals

	/**
	 * Grammar-function mapping identifiers to constructs
	 */
	val (String)=>SG grammar

	/**
	 * Cache that maps identical constructs to the same indices for sharing purposes
	 */
	val cache = new HashMap<SG, Index<String>>

	/**
	 * Creates a new ICC
	 * @param terminals List of terminals in ascending precedence
	 * @param grammar Grammar-function mapping identifiers to constructs
	 */
	new(List<String> terminals, (String)=>SG grammar) {
		this.terminals = terminals
		this.grammar = grammar
	}

	/**
	 * Tries to get a precalculated result; if none present calculates the
	 * result, wraps it inside a cache, stores and returns it
	 * @param sg The construct to iterate
	 * @param lbr The length/breadth ratio to use
	 */
	def iterate(SG sg, long lbr) {
		if(cache.containsKey(sg))
			cache.get(sg)
		else {
			val result = iterate_(sg, lbr).cache
			cache.put(sg, result)
			result
		}
	}

	/**
	 * Dispatcher for the iteration
	 */
	def dispatch Index<String> iterate_(SG sg, long lbr) {
		throw new UnsupportedOperationException("Cannot dispatch " + sg)
	}

	/**
	 * Iterates the any character construct by enumerating sigma
	 */
	def dispatch Index<String> iterate_(Any sg, long lbr) {
		SIGMA.mapToString
	}

	/**
	 * Iterates the range by enumerating the ranges characters
	 */
	def dispatch Index<String> iterate_(Range sg, long lbr) {
		chars(sg.min, sg.max).list.mapToString
	}

	/**
	 * Iterates the single token by just returning it
	 */
	def dispatch Index<String> iterate_(Single sg, long lbr) {
		sg.token.singleton
	}

	/**
	 * Iterates the until construct by appending its token to all strings not containing its token
	 */
	def dispatch Index<String> iterate_(Until sg, long lbr) {
		"".singleton.concatWith(
			combinations(SIGMA, lbr, null).mapFoldChars.filter[!contains(sg.token)].map[it + sg.token]
		)
	}

	/**
	 * Iterates the sequence by enumerating all pairs of the left-hand and the right-hand
	 */
	def dispatch Index<String> iterate_(Sequence sg, long lbr) {
		iterate(sg.first, lbr).pairWith(iterate(sg.second, lbr)).mapConcat
	}

	/**
	 * Iterates the alternative by interleaving enumeration
	 */
	def dispatch Index<String> iterate_(Alternative sg, long lbr) {
		iterate(sg.either, lbr).zipWith(iterate(sg.or, lbr))
	}

	/**
	 * Iterates the optional construct by iterating its inner construct and prepending the empty-length string
	 */
	def dispatch Index<String> iterate_(Optional sg, long lbr) {
		"".singleton.concatWith(iterate(sg.of, lbr))
	}

	/**
	 * Iterates the plus construct by enumerating all combinations of its inner construct
	 */
	def dispatch Index<String> iterate_(Plus sg, long lbr) {
		combinations(iterate(sg.of, lbr / DEEPENING_LBR_FACTOR), lbr, null).mapFoldString
	}

	/**
	 * Iterates the star construct just like the plus construct with the empty-length string prepended
	 */
	def dispatch Index<String> iterate_(Star sg, long lbr) {
		"".singleton.concatWith(
			combinations(iterate(sg.of, lbr / DEEPENING_LBR_FACTOR), lbr, null).mapFoldString
		)
	}

	/**
	 * Iterates the reference by checking if a terminal precedence is to be applied to
	 * the iteration of the inner construct
	 */
	def dispatch Index<String> iterate_(Reference sg, long lbr) {

		// Find all terminals that are of higher precedence, will return the
		// empty list if the reference is not on a terminal
		val higher = terminals.after(sg.to).map(grammar);

		// Iterate but leave out all productions of higher precedence terminals
		iterate(grammar.apply(sg.to), lbr).filter[s|!higher.fold(false, [a, t|a || doesAccept(t, s)])]
	}

	/**
	 * Returns all strings in the list that have a higher index
	 * than the reference string or the empty list if the string is not contained
	 */
	def static after(List<String> strings, String string) {
		val i = strings.indexOf(string)
		if(i == -1)
			emptyList
		else
			strings.subList(i + 1, strings.length)

	}

	/**
	 * Does accept returns true if the entire string is accepted by the construct
	 */
	def boolean doesAccept(SG sg, String string) {
		accept(sg, string).exists[it == string.length]
	}

	/**
	 * Accept returns zero or more amounts of characters it can accept with the 
	 * given syntactic construct
	 */
	def dispatch Iterable<Integer> accept(SG sg, String string) {
		throw new UnsupportedOperationException("Cannot dispatch " + sg)
	}

	/**
	 * Any accepts one character if the string is non-empty
	 */
	def dispatch Iterable<Integer> accept(Any sg, String string) {
		if(string.length > 0)
			one(1)
		else
			none
	}

	/**
	 * Range accepts one character if the string is non-empty and the first
	 * character is inside of the given range
	 */
	def dispatch Iterable<Integer> accept(Range sg, String string) {
		if(string.length > 0 && sg.min <= string.charAt(0) && string.charAt(0) <= sg.max)
			one(1)
		else
			none
	}

	/**
	 * Single accepts the length of its token if the string starts with the token
	 */
	def dispatch Iterable<Integer> accept(Single sg, String string) {
		if(string.startsWith(sg.token))
			one(sg.token.length)
		else
			none
	}

	/**
	 * Until accepts the first subsequence up to the given token or nothing if not found
	 */
	def dispatch Iterable<Integer> accept(Until sg, String string) {
		val fio = string.indexOf(sg.token)
		if(fio >= 0)
			one(fio + sg.token.length)
		else
			none
	}

	/**
	 * Sequence accepts the second construct from all of the first constructs accepted lengths
	 */
	def dispatch Iterable<Integer> accept(Sequence sg, String string) {
		accept(sg.first, string).map[l|accept(sg.second, string.substring(l)).map[it + l]].flatten
	}

	/**
	 * Alternative accepts the both alternatives individually and concatenates their results
	 */
	def dispatch Iterable<Integer> accept(Alternative sg, String string) {
		accept(sg.either, string) + accept(sg.or, string)
	}

	/**
	 * Optional accepts based on its inner construct and prepends the empty length
	 */
	def dispatch Iterable<Integer> accept(Optional sg, String string) {
		one(0) + accept(sg.of, string)
	}

	/**
	 * Plus recursively repeats itself into the string
	 */
	def dispatch Iterable<Integer> accept(Plus sg, String string) {
		val first = accept(sg.of, string)

		first + first.map[l|accept(sg, string.substring(l)).map[it + l]].flatten
	}

	/**
	 * Star uses the acceptor for plus and prepends the empty length
	 */
	def dispatch Iterable<Integer> accept(Star sg, String string) {
		one(0) + accept(new Plus(sg.of), string)
	}

	/**
	 * Reference resolves the reference and accepts the construct mapped
	 */
	def dispatch Iterable<Integer> accept(Reference sg, String string) {
		accept(grammar.apply(sg.to), string)
	}
}
