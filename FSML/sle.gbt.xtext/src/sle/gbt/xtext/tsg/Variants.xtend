package sle.gbt.xtext.tsg

import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.AbstractElement
import org.eclipse.xtext.AbstractNegatedToken
import org.eclipse.xtext.Action
import org.eclipse.xtext.Assignment
import org.eclipse.xtext.CrossReference
import org.eclipse.xtext.EcoreUtil2
import org.eclipse.xtext.Grammar
import org.eclipse.xtext.Keyword
import org.eclipse.xtext.RuleCall
import org.eclipse.xtext.TerminalRule

import static java.util.Collections.*
import org.eclipse.xtext.NegatedToken
import org.eclipse.xtext.UntilToken
import java.lang.reflect.WildcardType
import org.eclipse.xtext.Wildcard
import org.eclipse.xtext.EnumLiteralDeclaration
import org.eclipse.xtext.Alternatives
import org.eclipse.xtext.UnorderedGroup
import com.google.common.collect.Collections2
import org.eclipse.xtext.Group
import java.util.List
import com.google.common.collect.ImmutableList
import java.util.Set
import com.google.common.collect.Sets
import com.google.common.collect.Ranges
import com.google.common.collect.DiscreteDomains
import com.google.common.collect.Iterables
import com.google.common.base.Strings
import org.eclipse.xtext.CharacterRange

class Variants
{
	val allPositiveIntegers = Ranges.greaterThan(0).asSet(DiscreteDomains.integers)

	/**
	 * Set of all input characters
	 */
	var Set<String> characters

	/**
	 * Generator for all string, dummy implementation with just a's
	 */
	var Iterable<String> strings = allPositiveIntegers.map[c|Strings::repeat("a", c)];

	def static <E> repeat(E e)
	{
		Iterables.cycle(e);
	}

	def static <E> repeat(E e, int times)
	{
		Iterables.cycle(e).take(times);
	}

	def static grammarOf(EObject e)
	{

		EcoreUtil2.getContainerOfType(e, Grammar)
	}

	def static recursiveContent(EObject e)
	{
		e.eAllContents.toIterable
	}

	def static <E> Iterable<E> operator_minus(Iterable<E> a, Iterable<E> without)
	{
		val t = newHashSet

		for (E e : without)
		{
			t += e;
		}

		return a.filter[x|!t.contains(x)];
	}

	def Iterable<String> universeOf(Grammar grammar)
	{

		// Keyword/s.value ∪ variants(TerminalRule/s.alternative)
		grammar.recursiveContent.filter(Keyword).map[value] +
			grammar.recursiveContent.filter(TerminalRule).map[basicVariantsOf(alternatives)].flatten
	}

	def Iterable<String> variantsOf(AbstractElement e)
	{
		val main = basicVariantsOf(e)

		switch (e.cardinality)
		{
			case null: main
			case "?": singleton("") + main
		}
	}

	def dispatch Iterable<String> basicVariantsOf(AbstractElement e)
	{
		singleton("<CANNOT HANDLE " + e + ">")
	}

	def dispatch Iterable<String> basicVariantsOf(Action e)
	{
		emptySet
	}

	def dispatch Iterable<String> basicVariantsOf(Keyword e)
	{
		singleton(e.value)
	}

	def dispatch Iterable<String> basicVariantsOf(RuleCall e)
	{
		variantsOf(e.rule.alternatives)
	}

	def dispatch Iterable<String> basicVariantsOf(Assignment e)
	{
		variantsOf(e.terminal)
	}

	def dispatch Iterable<String> basicVariantsOf(CrossReference e)
	{

		// TODO: can this be null? [X] and [X|ID]
		variantsOf(e.terminal)
	}

	def dispatch Iterable<String> basicVariantsOf(NegatedToken e)
	{
		characters - (universeOf(grammarOf(e)) + variantsOf(e.terminal))
	}

	def dispatch Iterable<String> basicVariantsOf(UntilToken e)
	{
		strings - (universeOf(grammarOf(e)) + variantsOf(e.terminal))
	}

	def dispatch Iterable<String> basicVariantsOf(Wildcard e)
	{
		characters
	}

	def dispatch Iterable<String> basicVariantsOf(EnumLiteralDeclaration e)
	{
		variantsOf(e.literal)
	}

	def dispatch Iterable<String> basicVariantsOf(Alternatives e)
	{
		e.elements.map[basicVariantsOf].flatten.toSet
	}

	def dispatch Iterable<String> basicVariantsOf(UnorderedGroup e)
	{

		// TODO: permutations -> variatons -> concatenation
		singleton("CANNOT HANDLE UNORDERED GROUP")
	}

	def dispatch Iterable<String> basicVariantsOf(Group e)
	{
		Sets::cartesianProduct(e.elements.map[variantsOf].map[toSet]).map[c|c.fold("", [p1, p2|p1 + " " + p2])]
	}

	def dispatch Iterable<String> basicVariantsOf(CharacterRange e)
	{
		val f = e.left.value.charAt(0)
		val l = e.right.value.charAt(0)

		Ranges.closed(f as int, l as int).asSet(DiscreteDomains.integers).map[i|i as int as char].map[toString]
	}

}
