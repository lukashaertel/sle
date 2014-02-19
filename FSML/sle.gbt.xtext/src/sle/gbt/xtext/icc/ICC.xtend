package sle.gbt.xtext.icc

import java.util.SortedSet
import java.util.Set
import sle.gbt.xtext.icc.index.Index

import static sle.gbt.xtext.icc.Commons.*
import static extension sle.gbt.xtext.icc.index.Pairing.*
import static extension sle.gbt.xtext.icc.index.Zipping.*
import static extension sle.gbt.xtext.icc.index.Indices.*

class ICC {

	val SortedSet<String> terminals

	val (String)=>SG grammar

	val (String)=>Set<String> whitespaces

	new(SortedSet<String> terminals, (String)=>SG grammar, (String)=>Set<String> whitespaces) {
		this.terminals = terminals
		this.grammar = grammar
		this.whitespaces = whitespaces
	}

	def dispatch Index<Index<String>> iterate(SG sg) {
		throw new UnsupportedOperationException("Cannot dispatch " + sg)
	}

	def dispatch Index<Index<String>> iterate(AnyCharacter sg) {
		rangeStrings(Character.MIN_VALUE, Character.MAX_VALUE).toSingletonIndex
	}

	def dispatch Index<Index<String>> iterate(CharacterRange sg) {
		rangeStrings(sg.min, sg.max).toSingletonIndex
	}

	def dispatch Index<Index<String>> iterate(SingleCharacterToken sg) {
		sg.token.toString.toSingletonIndex.toSingletonIndex
	}

	def dispatch Index<Index<String>> iterate(SingleStringToken sg) {
		sg.token.toSingletonIndex.toSingletonIndex
	}

	def dispatch Index<Index<String>> iterate(UntilCharacterToken sg) {
		compactUniversalIndex[n|combinations(SIGMA, n + 1).map[new String(it)].filter[endsWith(sg.token.toString)]]
	}

	def dispatch Index<Index<String>> iterate(UntilStringToken sg) {
		compactUniversalIndex[n|combinations(SIGMA, n + 1).map[new String(it)].filter[endsWith(sg.token)]]
	}

	def dispatch Index<Index<String>> iterate(Sequence sg) {
		(iterate(sg.first) * iterate(sg.second)).map[key + value]
	}

	def dispatch Index<Index<String>> iterate(Alternative sg) {
		iterate(sg.either) + iterate(sg.or)
	}

	def dispatch Index<Index<String>> iterate(Optional sg) {
		val inner = iterate(sg.of)

		index([it != 0L && inner.exceeds(it - 1)], [it == 0L || inner.exists(it - 1)],
			[
				switch (it) {
					case 0L: emptyIndex
					case it > 0L: inner.get(it - 1)
				}])
	}

	def dispatch Index<Index<String>> iterate(Plus sg) {
		val inner = iterate(sg.of)

		index([false], [inner.exists(it)],
			[
				combinationsUnion(inner.get(it), 1, it).filter[it != null].map[fold("", [a, b|a + b])]
			])
	}

	def dispatch Index<Index<String>> iterate(Star sg) {
		val inner = iterate(sg.of)

		index([false], [true],
			[
				combinationsUnion(inner.get(it), 0, it).filter[it != null].map[fold("", [a, b|a + b])]
			])
	}
}
