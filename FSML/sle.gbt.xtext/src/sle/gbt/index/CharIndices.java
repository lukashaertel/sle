package sle.gbt.index;

import static sle.gbt.index.Indices.*;
import static sle.gbt.utils.Ranges.*;

import java.util.Arrays;

public class CharIndices {
	public static final Index<Character> PAN = consolidate(
			concatAll(list(chars('A', 'Z')), list(chars('a', 'z')),
					list(chars('0', '9')), singleton('_')), Character.class);

	public static final Index<Character> WHITE = consolidate(
			list(Arrays.asList(' ', '\r', '\n', '\t')), Character.class);

	public static final Index<Character> NESTING = consolidate(
			list(Arrays.asList('{', '}', '(', ')', '<', '>', '[', ']')),
			Character.class);

	public static final Index<Character> OPERATOR = consolidate(
			list(Arrays.asList('+', '*', '~', '-', '!', '&', '|', '=', '?',
					'/', '%', '.', ':', '$', '@')), Character.class);

	public static final Index<Character> OMEGA = consolidate(
			list(Arrays.asList(',', ';')), Character.class);

	public static final Index<Character> SIGMA = consolidate(
			concatAll(PAN, WHITE, NESTING, OPERATOR, OMEGA), Character.class);
}
