package sle.gbt.xtext.icc

import java.util.List

class SG {
	def static any() {
		new Any
	}

	def static operator_upTo(String l, String r) {
		new Range(l.charAt(0), r.charAt(0))
	}

	def static single(String token) {
		new Single(token)
	}

	def static until(String token) {
		new Until(token)
	}

	def static operator_greaterThan(SG l, SG r) {
		new Sequence(l, r)
	}

	def static operator_greaterThan(String l, SG r) {
		new Sequence(single(l), r)
	}

	def static operator_greaterThan(SG l, String r) {
		new Sequence(l, single(r))
	}

	def static SG seq(SG... sgs) {
		seq(newArrayList(sgs))
	}

	def static SG seq(List<SG> sgs) {
		switch (sgs.length) {
			case 0: throw new IllegalArgumentException
			case 1: sgs.get(0)
			case 2: sgs.get(0) > sgs.get(1)
			default: seq(sgs.subList(0, sgs.length / 2)) > seq(sgs.subList(sgs.length / 2, sgs.length))
		}
	}

	def static operator_diamond(SG l, SG r) {
		new Alternative(l, r)
	}

	def static operator_diamond(String l, SG r) {
		new Alternative(single(l), r)
	}

	def static operator_diamond(SG l, String r) {
		new Alternative(l, single(r))
	}

	def static opt(SG sg) {
		new Optional(sg)
	}

	def static plus(SG sg) {
		new Plus(sg)
	}

	def static star(SG sg) {
		new Star(sg)
	}

	def static operator_not(SG sg) {
		new Negation(sg)
	}

	def static ref(String to) {
		new Reference(to)
	}
}

/**
 * Any character construct<br/>
 * (1.2a)
 */
@Data class Any extends SG {
}

/**
 * Character range construct<br/>
 * (1.2b)
 */
@Data class Range extends SG {
	char min

	char max
}

/**
 * Single character and single token construct<br/>
 * (1.2d) including (1.2c)
 */
@Data class Single extends SG {
	String token
}

/**
 * Until token construct<br/>
 * (1.2f) including (1.2e)
 */
@Data class Until extends SG {
	String token
}

/**
 * Sequence combinator<br/>
 * (1.3a)
 */
@Data class Sequence extends SG {

	/**
	 * Left-hand construct
	 */
	SG first

	/**
	 * Right-hand construct
	 */
	SG second
}

/**
 * Alternative combinator<br/>
 * (1.3b)
 */
@Data class Alternative extends SG {

	/**
	 * Left-hand construct
	 */
	SG either

	/**
	 * Right-hand construct
	 */
	SG or
}

/**
 * Optional combinator<br/>
 * (1.3c)
 */
@Data class Optional extends SG {

	/**
	 * Inner construct
	 */
	SG of
}

/**
 * Plus combinator<br/>
 * (1.3d)
 */
@Data class Plus extends SG {

	/**
	 * Inner construct
	 */
	SG of
}

/**
 * Star combinator<br/>
 * (1.3e)
 */
@Data class Star extends SG {

	/**
	 * Inner construct
	 */
	SG of
}

/**
 * Negation combinator</br>
 * (1.3f)
 */
@Data class Negation extends SG {

	/**
	 * Inner construct
	 */
	SG of
}

/**
 * Reference construct<br/>
 * (2.2)
 */
@Data class Reference extends SG {

	/**
	 * Identifier in grammar
	 */
	String to
}
