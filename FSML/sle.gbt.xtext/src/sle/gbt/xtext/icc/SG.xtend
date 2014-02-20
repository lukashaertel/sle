package sle.gbt.xtext.icc

class SG {
	def static any() {
		new AnyCharacter
	}

	def static operator_upTo(String l, String r) {
		new CharacterRange(l.charAt(0), r.charAt(0))
	}

	def static single(String token) {
		new SingleStringToken(token)
	}

	def static until(String token) {
		new UntilStringToken(token)
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
}

/**
 * (1.2a)
 */
@Data class AnyCharacter extends SG {
}

/**
 * (1.2b)
 */
@Data class CharacterRange extends SG {
	char min

	char max
}

/**
 * (1.2c)
 */
@Data class SingleCharacterToken extends SG {
	char token
}

/**
 * (1.2d)
 */
@Data class SingleStringToken extends SG {
	String token
}

/**
 * (1.2e)
 */
@Data class UntilCharacterToken extends SG {
	char token
}

/**
 * (1.2f)
 */
@Data class UntilStringToken extends SG {
	String token
}

/**
 * (1.3a)
 */
@Data class Sequence extends SG {
	SG first
	SG second
}

/**
 * (1.3b)
 */
@Data class Alternative extends SG {
	SG either
	SG or
}

/**
 * (1.3c)
 */
@Data class Optional extends SG {
	SG of
}

/**
 * (1.3d)
 */
@Data class Plus extends SG {
	SG of
}

/**
 * (1.3e)
 */
@Data class Star extends SG {
	SG of
}

/**
 * (1.3f)
 */
@Data class Negation extends SG {
	SG of
}

/**
 * (2.2)
 */
@Data class Reference extends SG {
	String to
}
