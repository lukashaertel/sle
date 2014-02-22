package sle.gbt.xtext.icc

import java.util.TreeSet

import static extension sle.gbt.index.Indices.*
import static extension sle.gbt.xtext.icc.SG.*
import static extension sle.gbt.utils.Maps.*

class Tests {

	def static void main(String... args) {
		val terminals = newArrayList("ID", ";", "->", "/", "{", "}", "STATE", "INITIAL")
		val grammar = newHashMap(
			"INITIAL" -> "initial ".single,
			"STATE" -> "state ".single,
			"{" -> "{".single,
			"}" -> "}".single,
			"/" -> "/".single,
			"->" -> "->".single,
			";" -> ";".single,
			"ID" -> ("a" .. "c"),
			"model" -> ("state".ref.star ),
			"state" -> ( "INITIAL".ref.opt > "STATE".ref > "ID".ref > "{".ref > "transition".ref.star > "}".ref ),
			"transition" -> ("ID".ref > ("/".ref > "ID".ref).opt > ("->".ref > "ID".ref).opt > ";".ref)
		).asFunction;
		val whitespaces = [newHashSet()]

		// Terminal order from lowest to highest
		val icc = new ICC(terminals, grammar, whitespaces)

		// Multiline comment
		val s = "model".ref
		val si = icc.iterate(s)

		var o = 0;
		val st = System.currentTimeMillis
		var lso = st / 1000;
		for (i : 0 .. 3000) {
			if(si.exists(i)) {
				println(si.get(i))
				o = o + 1
				val ct = System.currentTimeMillis
				var cso = ct / 1000;

				if(cso != lso) {
					lso = cso;
					val t = 1000.0 * (o as double / (ct - st))
					println
					println("> " + t + " per second")
					println
				}
			} else {
				println("NO:" + i)
			}
		}
	}

}
