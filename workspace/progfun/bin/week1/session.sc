package week1

object session {
   1+3                                            //> res0: Int(4) = 4
	def abs(x:Double) = if (x < 0) -x else x  //> abs: (x: Double)Double
	
	def sqrt(x: Double) = {
	
	def sqrtIter(guess: Double): Double =
	   if (isGoodEnough(guess)) guess
	   else sqrtIter(improve(guess))
	
	def isGoodEnough(guess: Double): Boolean =
    abs(guess * guess -x) / x  < 0.001
	
	def improve(guess: Double): Double =
	   (guess + x / guess) / 2
	
	   sqrtIter(1.0)
	}                                         //> sqrt: (x: Double)Double
	
	sqrt(2)                                   //> res1: Double = 1.4142156862745097
	sqrt(4)                                   //> res2: Double = 2.000609756097561
	sqrt(1e-6)                                //> res3: Double = 0.0010000001533016628
	sqrt(1e60)                                //> res4: Double = 1.0000788456669446E30
  sqrt(5)                                         //> res5: Double = 2.2360688956433634
}