package sle.gbt.xtext.icc

import java.util.TreeSet

//import static extension sle.gbt.index.Indices.*
import static extension sle.gbt.xtext.icc.SG.*

class Tests {
	def static void main(String... args) {
		val icc = new ICC(new TreeSet, [null], [newHashSet("")])

		val s = 'void ' > ("a" .. "z").plus > ' {' > '}'

		val v = icc.iterate(s)

		val max = 100;
		var i = 0
		for (vi : v) {
			println(vi)
			i = i + 1
			if(i > max) return
		}
	}

}
