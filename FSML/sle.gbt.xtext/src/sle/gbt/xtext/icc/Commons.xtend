package sle.gbt.xtext.icc

import sle.gbt.xtext.icc.index.Index
import static extension sle.gbt.xtext.icc.index.Indices.*

class Commons {

	/**
	 * Pseudoalphanumeric, contains the underscore that may be used in identifiers
	 */
	public val static PAN = range('A', 'Z') + chars('_') + range('a', 'z') + range('0', '9')

	/**
	 * White spaces
	 */
	public val static WHITE = chars(' ', '\r', '\n', '\t')

	/**
	 * Nesting operators
	 */
	public val static NESTING = chars('{', '}', '(', ')', '<', '>', '[', ']')

	/**
	 * Operators
	 */
	public val static OPERATOR = chars('+', '*', '~', '-', '!', '&', '|', '=', '?', '/', '%', '.', ':', '$', '@')

	/**
	 * Terminators
	 */
	public val static OMEGA = chars(',', ';');

	/**
	 * Simplified sigma, we don't want all charcters
	 */
	public val static SIGMA = PAN + WHITE + NESTING + OPERATOR + OMEGA

	/**
	 * Interpretation of sigma as strings
	 */
	public val static SIGMA_STRINGS = SIGMA.map[toString]

	def static Index<Character> chars(char... cs) {
		cs.toIndex
	}

	def static Index<String> charsStrings(char... cs) {
		chars(cs).map[toString]
	}

	def static Index<Character> range(char min, char max) {
		index([it > max - min], [it <= max - min], [(it + min) as long as char])
	}

	def static Index<String> rangeStrings(char min, char max) {
		range(min, max).map[toString]
	}
}
