package week7

import scala.math.BigDecimal.RoundingMode


object test {
  val problem = new Pouring(Vector(4,9,19))       //> problem  : week7.Pouring = week7.Pouring@15a62c31
  problem.moves                                   //> res0: scala.collection.immutable.IndexedSeq[Product with Serializable with w
                                                  //| eek7.test.problem.Move] = Vector(Empty(0), Empty(1), Empty(2), Fill(0), Fill
                                                  //| (1), Fill(2), Pour(0,1), Pour(0,2), Pour(1,0), Pour(1,2), Pour(2,0), Pour(2,
                                                  //| 1))
 problem.solutions(17)                            //> res1: Stream[week7.test.problem.Path] = Stream(Fill(0) Fill(1) Pour(1,2) Pou
                                                  //| r(0,2) Fill(0) Pour(0,2)--> Vector(0, 0, 17), ?)
  
  val dnaSequence = "AAAAAAA"                     //> dnaSequence  : String = AAAAAAA
  val codes = "ACGT"                              //> codes  : String = ACGT

  	val answer = for {
  		c <- codes
  		count = dnaSequence.count(n => n.toUpper == c)
  	} yield count                             //> answer  : scala.collection.immutable.IndexedSeq[Int] = Vector(7, 0, 0, 0)
  
  answer.toList                                   //> res2: List[Int] = List(7, 0, 0, 0)
  
  
  def chanceOfDominantPhenotype(dominant:Int, mixed:Int, recessive:Int):BigDecimal = {
		val total = Double.box(dominant + mixed + recessive)
		val side1 = dominant/total
		val side2 = (mixed/total)*(1/2d)*(1 + (dominant/(total-1)) + (1/2d)*((mixed-1)/(total-1)))
		val side3 = (recessive/total)*(dominant/(total-1)) + (recessive/total)*(mixed/(total-1))*(1/2d)
		BigDecimal.apply(side1 + side2 + side3 ).setScale(5, RoundingMode.HALF_UP)
	}                                         //> chanceOfDominantPhenotype: (dominant: Int, mixed: Int, recessive: Int)BigDec
                                                  //| imal
     
     chanceOfDominantPhenotype(2,2,2)             //> res3: BigDecimal = 0.78333
     
}