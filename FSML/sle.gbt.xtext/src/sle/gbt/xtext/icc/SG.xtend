package sle.gbt.xtext.icc

interface SG {
}

/**
 * (1.2a)
 */
@Data class AnyCharacter implements SG {
}

/**
 * (1.2b)
 */
@Data class CharacterRange implements SG {
	char min

	char max
}

/**
 * (1.2c)
 */
@Data class SingleCharacterToken implements SG {
	char token
}

/**
 * (1.2d)
 */
@Data class SingleStringToken implements SG {
	String token
}

/**
 * (1.2e)
 */
@Data class UntilCharacterToken implements SG {
	char token
}

/**
 * (1.2f)
 */
@Data class UntilStringToken implements SG {
	String token
}

/**
 * (1.3a)
 */
@Data class Sequence implements SG {
	SG first
	SG second
}

/**
 * (1.3b)
 */
@Data class Alternative implements SG {
	SG either
	SG or
}

/**
 * (1.3c)
 */
@Data class Optional implements SG {
	SG of
}

/**
 * (1.3d)
 */
@Data class Plus implements SG {
	SG of
}

/**
 * (1.3e)
 */
@Data class Star implements SG {
	SG of
}

/**
 * (1.3f)
 */
@Data class Negation implements SG {
	SG of
}

/**
 * (2.2)
 */
@Data class Reference implements SG {
	String to
}
