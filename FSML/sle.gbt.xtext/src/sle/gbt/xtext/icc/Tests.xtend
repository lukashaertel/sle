package sle.gbt.xtext.icc

import java.util.TreeSet

import static extension sle.gbt.index.Indices.*
import static extension sle.gbt.xtext.icc.SG.*
import static extension sle.gbt.utils.Maps.*

class Tests {

	def static void main(String... args) {
		val terminals = newArrayList("ID", "TERM", "TO", "ACTION", "CCB", "OCB", "STATE", "INITIAL")
		val grammar = newHashMap(
			"INITIAL" -> "initial ".single,
			"STATE" -> "state ".single,
			"OCB" -> "{".single,
			"CCB" -> "}".single,
			"ACTION" -> "/".single,
			"TO" -> "->".single,
			"TERM" -> ";".single,
			"ID" -> ("a" .. "c"),
			"model" -> "state".ref.star,
			"state" -> ("INITIAL".ref.opt > "STATE".ref > "ID".ref > "OCB".ref > "transition".ref.star > "CCB".ref ),
			"transition" -> ("ID".ref > ("ACTION".ref > "ID".ref).opt > ("TO".ref > "ID".ref).opt > "TERM".ref)
		).asFunction;
		val whitespaces = [newHashSet()]

		// Terminal order from lowest to highest
		val icc = new ICC(terminals, grammar, whitespaces)

		// Multiline comment
		val s = "model".ref
		val si = icc.iterate(s)

		for (i : 30000 .. 50000) {
			if(si.exists(i))
				println(si.get(i))
			else {
				println("NO:" + i)
			}
		}
	}

}
