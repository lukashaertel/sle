package sle.gbt.xtext.icc

import java.util.Set
import sle.gbt.index.Index

import static extension sle.gbt.index.CharIndices.*
import static extension sle.gbt.utils.Ranges.*
import static extension sle.gbt.index.Indices.*
import java.util.List
import java.util.HashMap

class ICC {
	val List<String> terminals

	val (String)=>SG grammar

	val (String)=>Set<String> whitespaces

	val cache = new HashMap<SG, Index<String>>

	new(List<String> terminals, (String)=>SG grammar, (String)=>Set<String> whitespaces) {
		this.terminals = terminals
		this.grammar = grammar
		this.whitespaces = whitespaces
	}

	def iterate(SG sg) {
		if(cache.containsKey(sg))
			cache.get(sg)
		else {
			val result = iterate_(sg).cache
			cache.put(sg, result)
			result
		}
	}

	def dispatch Index<String> iterate_(SG sg) {
		throw new UnsupportedOperationException("Cannot dispatch " + sg)
	}

	def dispatch Index<String> iterate_(Any sg) {
		SIGMA.mapToString
	}

	def dispatch Index<String> iterate_(Range sg) {
		chars(sg.min, sg.max).list.mapToString
	}

	def dispatch Index<String> iterate_(Single sg) {
		sg.token.singleton
	}

	def dispatch Index<String> iterate_(Until sg) {
		"".singleton.concatWith(
			combinations(SIGMA, null).mapFoldChars.filter[!contains(sg.token)].map[it + sg.token]
		)
	}

	def dispatch Index<String> iterate_(Sequence sg) {
		iterate(sg.first).pairWith(iterate(sg.second)).mapConcat
	}

	def dispatch Index<String> iterate_(Alternative sg) {
		iterate(sg.either).zipWith(iterate(sg.or))
	}

	def dispatch Index<String> iterate_(Optional sg) {
		"".singleton.concatWith(iterate(sg.of))
	}

	def dispatch Index<String> iterate_(Plus sg) {
		combinations(iterate(sg.of), null).mapFoldString
	}

	def dispatch Index<String> iterate_(Star sg) {
		"".singleton.concatWith(
			combinations(iterate(sg.of), null).mapFoldString
		)
	}

	val resolve = true

	def dispatch Index<String> iterate_(Reference sg) {

		if(terminals.contains(sg.to)) {
			if(resolve) {

				val higher = terminals.tailSet(sg.to).map(grammar);

				// Iterate but leave out all productions of other terminals
				iterate(grammar.apply(sg.to)).filter[s|!higher.fold(false, [a, t|a || accept(t, s)])]
			} else
				("[" + sg.to + "]").singleton

		} else {
			iterate(grammar.apply(sg.to))
		}
	}

	def tailSet(List<String> strings, String string) {
		val i = strings.indexOf(string)
		if(i == -1)
			strings
		else
			strings.subList(i + 1, strings.length)

	}

	def dispatch boolean accept(SG sg, String string) {

		//throw new UnsupportedOperationException("Cannot dispatch " + sg)
		false
	}

	def dispatch boolean accept(Any sg, String string) {
		string.length == 1
	}

	def dispatch boolean accept(Range sg, String string) {
		string.length == 1 && sg.min <= string.charAt(0) && string.charAt(0) <= sg.max
	}

	def dispatch boolean accept(Single sg, String string) {
		string == sg.token
	}

	def dispatch boolean accept(Until sg, String string) {
		string.endsWith(sg.token)
	}
}
