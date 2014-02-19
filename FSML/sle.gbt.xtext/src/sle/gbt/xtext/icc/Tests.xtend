package sle.gbt.xtext.icc

import static sle.gbt.xtext.icc.index.Zipping.*
import static sle.gbt.xtext.icc.index.Pairing.*
import static sle.gbt.xtext.icc.Commons.*

import static extension sle.gbt.xtext.icc.index.Indices.*
import java.util.TreeSet

class Tests {
	def static void main(String... args) {
		val icc = new ICC(new TreeSet, [null], [newHashSet("")])

		val v = icc.iterate(new Plus(new CharacterRange('a', 'c')))

		for (vi : v.toIterable) {
			for (vii : vi.toIterable) {
				println(vii)
			}

			println
		}

	//		val i = #["a", "b", "c"]
	//		val j = #["1", "2", "3", "4"]
	//
	//		val x = zip(i.toIndex, j.toIndex)
	//		val y = pairs(i.toIndex, j.toIndex)
	//
	//		for (xi : x.toIterable) {
	//			println(xi)
	//		}
	//		println("==============")
	//		for (yi : y.toIterable) {
	//			println(yi)
	//		}
	//		println("==============")
	//
	//		val distinctPairings = pairs(j.toIndex, j.toIndex).filter[key != value]
	//
	//		for (dp : distinctPairings.toIterable) {
	//			println(dp)
	//		}
	//		println("==============")
	//		val ku = combinationsUnion(chars('a','b','c'), 1, 1)
	//		for(kui : ku.toIterable){
	//			println(kui)
	//		}
	//
	//		val cca = stringsOfLength(3)
	//		for (cci : cca.toIterable) {
	//			println(cci)
	//		}
	//		println("==============")
	//		val ccb = combinations(Commons.PAN, 3)
	//		for (cci : ccb.toIterable) {
	//			println(cci)
	//		}
	}

}
