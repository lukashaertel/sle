package sle.gbt.xtext.icc

import java.util.TreeSet

import static extension sle.gbt.index.CharIndices.*
import static extension sle.gbt.index.Indices.*
import static extension sle.gbt.xtext.icc.SG.*
import static extension sle.gbt.utils.Maps.*

class Tests {

	def static void main(String... args) {
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
			"model" -> ("state".ref.star ),
			// Fookin importante, balance the trees
			"state" -> ( ("INITIAL".ref.opt > "STATE".ref) > ("ID".ref > "{".ref) > ("transition".ref.star > "}".ref) ),
			"transition" -> ("\t".single > "ID".ref > ("/".ref > "ID".ref).opt > ("->".ref > "ID".ref).opt > ";".ref)
		).asFunction;
		val whitespaces = [newHashSet()]

		// Terminal order from lowest to highest
		val icc = new ICC(terminals, grammar, whitespaces)

		// Multiline comment
		val s = "model".ref
		val si = icc.iterate(s)

		var o = 0L;
		while(true) {
			o = o + 1L
			if(si.exists(o)) {
				val i = si.get(o);

				println(String.format("< %8d >", o))
				println(i)
				println
			}
		}
	}
}
