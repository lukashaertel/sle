package sle.gbt.xtext.icc

import java.util.List
import java.util.Map
import org.eclipse.xtext.AbstractElement
import org.eclipse.xtext.Alternatives
import org.eclipse.xtext.Assignment
import org.eclipse.xtext.CharacterRange
import org.eclipse.xtext.CrossReference
import org.eclipse.xtext.EOF
import org.eclipse.xtext.EnumLiteralDeclaration
import org.eclipse.xtext.EnumRule
import org.eclipse.xtext.Grammar
import org.eclipse.xtext.Group
import org.eclipse.xtext.Keyword
import org.eclipse.xtext.NegatedToken
import org.eclipse.xtext.ParserRule
import org.eclipse.xtext.RuleCall
import org.eclipse.xtext.TerminalRule
import org.eclipse.xtext.UnorderedGroup
import org.eclipse.xtext.UntilToken
import org.eclipse.xtext.Wildcard
import sle.gbt.sg.SG
import sle.gbt.sg.SgFactory

class XtextToSG {
	static extension SgFactory sgFactory = SgFactory.eINSTANCE

	public val static KEYWORD_HEADER = "keyword:"

	def static List<String> terminalsFrom(Grammar grammar) {
		val result = newLinkedList
		for (i : grammar.usedGrammars.size >.. 0) {
			result += terminalsFrom(grammar.usedGrammars.get(i))
		}

		for (i : grammar.rules.size >.. 0) {
			val rule = grammar.rules.get(i)

			switch (rule) {
				// For enum rules, map all declared literals
				EnumRule:
					result +=
						rule.eAllContents.filter(EnumLiteralDeclaration).map[KEYWORD_HEADER + literal.value].toIterable
				// For parser rules, map all inline keywords
				ParserRule:
					result += rule.eAllContents.filter(Keyword).map[KEYWORD_HEADER + value].toIterable
				// For terminal rules, map their name
				TerminalRule:
					result += rule.name
			}
		}

		result
	}

	def static Map<String, SG> grammarFrom(Grammar grammar) {
		val result = newHashMap

		// First put all rules from imported grammars
		for (i : grammar.usedGrammars.size >.. 0) {
			result.putAll(grammarFrom(grammar.usedGrammars.get(i)))
		}

		// Then transform my rules
		for (i : grammar.rules.size >.. 0) {
			val rule = grammar.rules.get(i)

			result.put(rule.name, xtextToSG(rule.alternatives))
		}

		// After that, create the keyword-rules
		for (keyword : terminalsFrom(grammar).filter[startsWith(KEYWORD_HEADER)]) {
			result.put(keyword, createSingle => [token = keyword.substring(KEYWORD_HEADER.length)])
		}

		result
	}

	def static xtextToSG(AbstractElement e) {
		xtextToSG_(e).applyCardinality(e.cardinality)
	}

	private def static applyCardinality(SG sg, String card) {
		switch (card) {
			case "?": createOptional => [of = sg]
			case "+": createPlus => [of = sg]
			case "*": createStar => [of = sg]
			default: sg
		}
	}

	private def static dispatch SG xtextToSG_(AbstractElement e) {
		throw new UnsupportedOperationException("Cannot dispatch " + e)
	}

	private def static dispatch SG xtextToSG_(NegatedToken e) {
		createNegation => [of = xtextToSG(e.terminal)]
	}

	private def static dispatch SG xtextToSG_(UntilToken e) {
		createUntil => [of = xtextToSG(e.terminal)]
	}

	private def static dispatch SG xtextToSG_(Assignment e) {
		xtextToSG(e.terminal)
	}

	private def static dispatch SG xtextToSG_(CharacterRange e) {
		createRange => [min = e.left.value max = e.right.value]
	}

	private def static dispatch SG xtextToSG_(Alternatives e) {
		calt(e.elements)
	}

	/**
	 * Constructs a balanced alternative tree
	 */
	private def static SG calt(List<AbstractElement> elements) {
		switch (elements.size) {
			case 0:
				throw new IllegalArgumentException
			case 1:
				xtextToSG(elements.get(0))
			case 2:
				createAlternative => [
					left = xtextToSG(elements.get(0))
					right = xtextToSG(elements.get(1))
				]
			default:
				createAlternative => [
					left = calt(elements.subList(0, elements.size / 2))
					right = calt(elements.subList(elements.size / 2, elements.size))
				]
		}
	}

	private def static dispatch SG xtextToSG_(Group e) {
		cseq(e.elements)
	}

	/**
	 * Constructs a balanced sequence tree
	 */
	private def static SG cseq(List<AbstractElement> elements) {
		switch (elements.size) {
			case 0:
				throw new IllegalArgumentException
			case 1:
				xtextToSG(elements.get(0))
			case 2:
				createSequence => [
					left = xtextToSG(elements.get(0))
					right = xtextToSG(elements.get(1))
				]
			default:
				createSequence => [
					left = cseq(elements.subList(0, elements.size / 2))
					right = cseq(elements.subList(elements.size / 2, elements.size))
				]
		}
	}

	private def static dispatch SG xtextToSG_(EnumLiteralDeclaration e) {
		xtextToSG(e.literal)
	}

	private def static dispatch SG xtextToSG_(UnorderedGroup e) {
		// TODO: Unordered Group
	}

	private def static dispatch SG xtextToSG_(CrossReference e) {
		xtextToSG(e.terminal)
	}

	private def static dispatch SG xtextToSG_(EOF e) {
		// TODO: EOF
	}

	private def static dispatch SG xtextToSG_(Keyword e) {
		createSingle => [token = e.value]
	}

	private def static dispatch SG xtextToSG_(RuleCall e) {
		createReference => [to = e.rule.name]
	}

	private def static dispatch SG xtextToSG_(Wildcard e) {
		createAny
	}
}
