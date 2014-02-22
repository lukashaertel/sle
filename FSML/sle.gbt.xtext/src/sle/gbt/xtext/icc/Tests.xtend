package sle.gbt.xtext.icc

import java.util.TreeSet

import static extension sle.gbt.index.CharIndices.*
import static extension sle.gbt.index.Indices.*
import static extension sle.gbt.utils.Maps.*
import static extension sle.gbt.xtext.icc.SG.*

class Tests {

	def static void main(String... args) {
		testAcceptor
	}

	def static testAcceptor() {

		// ID has lower precedence than keyword, therefore "it" will not be yield in model
		val terminals = newArrayList("ID", "KW")
		val grammar = newHashMap(
			"KW" -> "it".single,
			"ID" -> ("a" .. "z").plus,
			"model" -> "ID".ref.star
		).asFunction;
		val whitespaces = [newHashSet()]

		val icc = new ICC(terminals, grammar, whitespaces)

		val s = "model".ref
		val si = icc.iterate(s, ICC.INITIAL_LBR)

		// "it" would be #529, output omits that
		for (o : 527 .. 531) {
			if(si.exists(o)) {
				val i = si.get(o);

				println(String.format("< %8d >", o))
				println(i)
				println
			}
		}
	}

	def static testFSMLICC() {
		val terminals = newArrayList("ID", ";", "->", "/", "{", "}", "STATE", "INITIAL")
		val grammar = newHashMap(
			"INITIAL" -> "initial ".single,
			"STATE" -> "state ".single,
			"{" -> " {\r\n".single,
			"}" -> "\r\n}\r\n".single,
			"/" -> "/".single,
			"->" -> " -> ".single,
			";" -> ";".single,
			"ID" -> ("a" .. "z").plus,
			"model" -> "state".ref.star,
			"state" -> seq("INITIAL".ref.opt, "STATE".ref, "ID".ref, "{".ref, "transition".ref.star, "}".ref),
			"transition" -> seq("\t".single, "ID".ref, ("/".ref > "ID".ref).opt, ("->".ref > "ID".ref).opt, ";".ref)
		).asFunction;
		val whitespaces = [newHashSet()]

		val icc = new ICC(terminals, grammar, whitespaces)

		val s = "model".ref
		val si = icc.iterate(s, ICC.INITIAL_LBR)

		var o = 0L;
		while(true) {
			o = o + 100L
			if(si.exists(o)) {
				val i = si.get(o);

				println(String.format("< %8d >", o))
				println(i)
				println
			}
		}
	}
}
