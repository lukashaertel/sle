package sle.gbt.xtext.icc

import java.util.HashMap
import java.util.List
import java.util.Map
import sle.gbt.index.Index
import sle.gbt.sg.Alternative
import sle.gbt.sg.Any
import sle.gbt.sg.Negation
import sle.gbt.sg.Optional
import sle.gbt.sg.Plus
import sle.gbt.sg.Range
import sle.gbt.sg.Reference
import sle.gbt.sg.SG
import sle.gbt.sg.Sequence
import sle.gbt.sg.Single
import sle.gbt.sg.Star
import sle.gbt.sg.Until

import static sle.gbt.index.CharIndices.*
import static sle.gbt.utils.Iterables.*
import static sle.gbt.utils.Ranges.*

import static extension sle.gbt.index.Indices.*
import sle.gbt.sg.SgFactory

class ICC {
	static extension SgFactory sgFactory = SgFactory.eINSTANCE

	/**
	 * Initial value for the length/breadth parameter
	 */
	static public val INITIAL_LBR = 782L

	/**
	 * Initial value for the length/breadth parameter
	 */
	static public val DEEPENING_LBR_DEFAULT = 3L

	/**
	 * Reduction factor for the length/breadth parameter
	 */
	val long deepeningLBR

	/**
	 * List of terminals in ascending precedence
	 */
	val List<String> terminals

	/**
	 * Grammar mapping identifiers to constructs
	 */
	val Map<String, SG> grammar

	/**
	 * Cache that maps identical constructs to the same indices for sharing purposes
	 */
	val cache = new HashMap<SG, Index<String>>

	/**
	 * Creates a new ICC
	 * @param terminals List of terminals in ascending precedence
	 * @param grammar Grammar-function mapping identifiers to constructs
	 */
	new(long deepeningLBR, List<String> terminals, Map<String, SG> grammar) {
		this.deepeningLBR = deepeningLBR
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
	private def dispatch Index<String> iterate_(SG sg, long lbr) {
		throw new UnsupportedOperationException("Cannot dispatch " + sg)
	}

	/**
	 * Iterates the any character construct by enumerating sigma
	 */
	private def dispatch Index<String> iterate_(Any sg, long lbr) {
		SIGMA.mapToString
	}

	/**
	 * Iterates the range by enumerating the ranges characters
	 */
	private def dispatch Index<String> iterate_(Range sg, long lbr) {
		chars(sg.min.charAt(0), sg.max.charAt(0)).list.mapToString
	}

	/**
	 * Iterates the single token by just returning it
	 */
	private def dispatch Index<String> iterate_(Single sg, long lbr) {
		sg.token.singleton
	}

	/**
	 * Iterates the until construct by appending its token to all strings not containing its token
	 */
	private def dispatch Index<String> iterate_(Until sg, long lbr) {
		("".singleton.concatWith(combinations(SIGMA, lbr, null).mapFoldChars)).filter[s|!doesAcceptAny(sg.of, s)].
			pairWith(iterate(sg.of, lbr)).mapConcat
	}

	/**
	 * Iterates the sequence by enumerating all pairs of the left-hand and the right-hand
	 */
	private def dispatch Index<String> iterate_(Sequence sg, long lbr) {
		iterate(sg.left, lbr).pairWith(iterate(sg.right, lbr)).mapConcat
	}

	/**
	 * Iterates the alternative by interleaving enumeration
	 */
	private def dispatch Index<String> iterate_(Alternative sg, long lbr) {
		iterate(sg.left, lbr).zipWith(iterate(sg.right, lbr))
	}

	/**
	 * Iterates the optional construct by iterating its inner construct and prepending the empty-length string
	 */
	private def dispatch Index<String> iterate_(Optional sg, long lbr) {
		"".singleton.concatWith(iterate(sg.of, lbr))
	}

	/**
	 * Iterates the plus construct by enumerating all combinations of its inner construct
	 */
	private def dispatch Index<String> iterate_(Plus sg, long lbr) {
		combinations(iterate(sg.of, lbr / deepeningLBR), lbr, null).mapFoldString
	}

	/**
	 * Iterates the star construct just like the plus construct with the empty-length string prepended
	 */
	private def dispatch Index<String> iterate_(Star sg, long lbr) {
		"".singleton.concatWith(
			combinations(iterate(sg.of, lbr / deepeningLBR), lbr, null).mapFoldString
		)
	}

	/**
	 * ?????????????????
	 */
	private def dispatch Index<String> iterate_(Negation sg, long lbr) {
		("".singleton.concatWith(combinations(SIGMA, lbr, null).mapFoldChars)).filter[s|!doesAcceptAny(sg.of, s)]
	}

	/**
	 * Iterates the reference by checking if a terminal precedence is to be applied to
	 * the iteration of the inner construct
	 */
	private def dispatch Index<String> iterate_(Reference sg, long lbr) {

		// Find all terminals that are of higher precedence, will return the
		// empty list if the reference is not on a terminal
		val higher = terminals.after(sg.to).map[id|grammar.get(id)];

		// Iterate but leave out all productions of higher precedence terminals
		iterate(grammar.get(sg.to), lbr).filter[s|!higher.exists[t|doesAccept(t, s)]]
	}

	/**
	 * Returns all strings in the list that have a higher index
	 * than the reference string or the empty list if the string is not contained
	 */
	private def static after(List<String> strings, String string) {
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
	 * Does accept any returns true if the any substring string is accepted by the construct
	 */
	def boolean doesAcceptAny(SG sg, String string) {
		(0 .. string.length).exists[l|doesAccept(sg, string.substring(l))]
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
		if(string.length > 0 && sg.min.charAt(0) <= string.charAt(0) && string.charAt(0) <= sg.max.charAt(0))
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
	 * Accept all strings that end with the accepted until composee
	 */
	def dispatch Iterable<Integer> accept(Until sg, String string) {
		(0 ..< string.length).filter[i|!doesAcceptAny(sg.of, string.substring(0, i))].map[i|
			accept(sg.of, string.substring(i)).map[j|i + j]].flatten
	}

	/**
	 * Sequence accepts the second construct from all of the first constructs accepted lengths
	 */
	def dispatch Iterable<Integer> accept(Sequence sg, String string) {
		accept(sg.left, string).map[l|accept(sg.right, string.substring(l)).map[it + l]].flatten
	}

	/**
	 * Alternative accepts the both alternatives individually and concatenates their results
	 */
	def dispatch Iterable<Integer> accept(Alternative sg, String string) {
		accept(sg.left, string) + accept(sg.right, string)
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
		one(0) + accept(createPlus => [of = sg.of], string)
	}

	/**
	 * Negation rejects all indexes that are accepted by the composee
	 */
	def dispatch Iterable<Integer> accept(Negation sg, String string) {
		(0 ..< string.length).filter[i|!doesAcceptAny(sg.of, string.substring(0, i))]
	}

	/**
	 * Reference resolves the reference and accepts the construct mapped
	 */
	def dispatch Iterable<Integer> accept(Reference sg, String string) {
		accept(grammar.get(sg.to), string)
	}
}
