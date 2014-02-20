package sle.gbt.xtext.icc

import java.util.SortedSet
import java.util.Set
import sle.gbt.index.Index

import static extension sle.gbt.index.Indices.*
import static extension sle.gbt.index.CharIndices.*
import static extension sle.gbt.utils.Ranges.*

class ICC {
	val SortedSet<String> terminals

	val (String)=>SG grammar

	val (String)=>Set<String> whitespaces

	new(SortedSet<String> terminals, (String)=>SG grammar, (String)=>Set<String> whitespaces) {
		this.terminals = terminals
		this.grammar = grammar
		this.whitespaces = whitespaces
	}

	def dispatch Index<String> iterate(SG sg) {
		throw new UnsupportedOperationException("Cannot dispatch " + sg)
	}

	def dispatch Index<String> iterate(AnyCharacter sg) {
		SIGMA.map[toString]
	}

	def dispatch Index<String> iterate(CharacterRange sg) {
		chars(sg.min, sg.max).list.map[toString]
	}

	def dispatch Index<String> iterate(SingleCharacterToken sg) {
		sg.token.toString.singleton
	}

	def dispatch Index<String> iterate(SingleStringToken sg) {
		sg.token.singleton
	}

	def dispatch Index<String> iterate(UntilCharacterToken sg) {
		allCombinations(SIGMA, null).map[new String(it)].filter[endsWith(sg.token.toString)]
	}

	def dispatch Index<String> iterate(UntilStringToken sg) {
		allCombinations(SIGMA, null).map[new String(it)].filter[endsWith(sg.token)]
	}

	def dispatch Index<String> iterate(Sequence sg) {
		iterate(sg.first).pairWith(iterate(sg.second)).map[left + right]
	}

	def dispatch Index<String> iterate(Alternative sg) {
		iterate(sg.either).zipWith(iterate(sg.or))
	}

	def dispatch Index<String> iterate(Optional sg) {
		"".singleton.concatWith(iterate(sg.of))
	}

	def dispatch Index<String> iterate(Plus sg) {
		allCombinations(iterate(sg.of), null).map[fold("", [a, b|a + b])]
	}

	def dispatch Index<String> iterate(Star sg) {
		"".singleton.concatWith(allCombinations(iterate(sg.of), null).map[fold("", [a, b|a + b])])
	}
}
