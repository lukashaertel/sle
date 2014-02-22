package sle.gbt.xtext.icc

import java.util.Set
import sle.gbt.index.Index

import static extension sle.gbt.index.CharIndices.*
import static extension sle.gbt.utils.Ranges.*
import static extension sle.gbt.index.Indices.*
import static extension sle.gbt.utils.Iterables.*
import java.util.List
import java.util.HashMap

class ICC {
	static public val INITIAL_LBR = 782L

	static public val DEEPENING_LBR_FACTOR = 2L

	val List<String> terminals

	val (String)=>SG grammar

	val (String)=>Set<String> whitespaces

	val cache = new HashMap<SG, Index<String>>

	new(List<String> terminals, (String)=>SG grammar, (String)=>Set<String> whitespaces) {
		this.terminals = terminals
		this.grammar = grammar
		this.whitespaces = whitespaces
	}

	def iterate(SG sg, long lbr) {
		if(cache.containsKey(sg))
			cache.get(sg)
		else {
			val result = iterate_(sg, lbr).cache
			cache.put(sg, result)
			result
		}
	}

	def dispatch Index<String> iterate_(SG sg, long lbr) {
		throw new UnsupportedOperationException("Cannot dispatch " + sg)
	}

	def dispatch Index<String> iterate_(Any sg, long lbr) {
		SIGMA.mapToString
	}

	def dispatch Index<String> iterate_(Range sg, long lbr) {
		chars(sg.min, sg.max).list.mapToString
	}

	def dispatch Index<String> iterate_(Single sg, long lbr) {
		sg.token.singleton
	}

	def dispatch Index<String> iterate_(Until sg, long lbr) {
		"".singleton.concatWith(
			combinations(SIGMA, lbr, null).mapFoldChars.filter[!contains(sg.token)].map[it + sg.token]
		)
	}

	def dispatch Index<String> iterate_(Sequence sg, long lbr) {
		iterate(sg.first, lbr).pairWith(iterate(sg.second, lbr)).mapConcat
	}

	def dispatch Index<String> iterate_(Alternative sg, long lbr) {
		iterate(sg.either, lbr).zipWith(iterate(sg.or, lbr))
	}

	def dispatch Index<String> iterate_(Optional sg, long lbr) {
		"".singleton.concatWith(iterate(sg.of, lbr))
	}

	def dispatch Index<String> iterate_(Plus sg, long lbr) {
		combinations(iterate(sg.of, lbr / DEEPENING_LBR_FACTOR), lbr, null).mapFoldString
	}

	def dispatch Index<String> iterate_(Star sg, long lbr) {
		"".singleton.concatWith(
			combinations(iterate(sg.of, lbr / DEEPENING_LBR_FACTOR), lbr, null).mapFoldString
		)
	}

	val resolve = true

	def dispatch Index<String> iterate_(Reference sg, long lbr) {

		if(terminals.contains(sg.to)) {
			if(resolve) {

				val higher = terminals.tailSet(sg.to).map(grammar);

				// Iterate but leave out all productions of other terminals
				iterate(grammar.apply(sg.to), lbr).filter[s|!higher.fold(false, [a, t|a || doesAccept(t, s)])]
			} else
				("[" + sg.to + "]").singleton

		} else {
			iterate(grammar.apply(sg.to), lbr)
		}
	}

	def tailSet(List<String> strings, String string) {
		val i = strings.indexOf(string)
		if(i == -1)
			strings
		else
			strings.subList(i + 1, strings.length)

	}

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

	def dispatch Iterable<Integer> accept(Any sg, String string) {
		if(string.length > 0)
			one(1)
		else
			none
	}

	def dispatch Iterable<Integer> accept(Range sg, String string) {
		if(string.length > 0 && sg.min <= string.charAt(0) && string.charAt(0) <= sg.max)
			one(1)
		else
			none
	}

	def dispatch Iterable<Integer> accept(Single sg, String string) {
		if(string.startsWith(sg.token))
			one(sg.token.length)
		else
			none
	}

	def dispatch Iterable<Integer> accept(Until sg, String string) {
		val fio = string.indexOf(sg.token)
		if(fio >= 0)
			one(fio + sg.token.length)
		else
			none
	}

	def dispatch Iterable<Integer> accept(Sequence sg, String string) {
		accept(sg.first, string).map[l|accept(sg.second, string.substring(l)).map[it + l]].flatten
	}

	def dispatch Iterable<Integer> accept(Alternative sg, String string) {
		accept(sg.either, string) + accept(sg.or, string)
	}

	def dispatch Iterable<Integer> accept(Optional sg, String string) {
		one(0) + accept(sg.of, string)
	}

	def dispatch Iterable<Integer> accept(Plus sg, String string) {
		val first = accept(sg.of, string)

		first + first.map[l|accept(sg, string.substring(l)).map[it + l]].flatten
	}

	def dispatch Iterable<Integer> accept(Star sg, String string) {
		one(0) + accept(new Plus(sg.of), string)
	}

	def dispatch Iterable<Integer> accept(Reference sg, String string) {
		accept(grammar.apply(sg.to), string)
	}
}
