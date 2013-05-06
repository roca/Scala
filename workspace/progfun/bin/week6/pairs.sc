package week6

object pairs {

def isPrime(n:Int): Boolean = (2 until n) forall ( n % _ != 0)
   
  val n = 7
  (1 until n) flatMap (i =>
   (1 until i) map (j => (i, j))) filter (pair => isPrime(pair._1 + pair._2))
  for {
   i <- 1 until n
   	j <- 1 until i
   		if isPrime( i + j)
  } yield (i,j)
   
   val xs = List(1.0,2.0,3.0)
   def scalarProduct(xs: List[Double], ys: List[Double]) : Double = {
     (xs zip ys).map{ case (x, y) => x * y }.sum
   }
   
   def scalarProduct2(xs: List[Double], ys: List[Double]) : Double = {
    {for {
         (x,y) <- (xs zip ys)
        } yield (x * y)
    }.sum
   }
   scalarProduct2(xs,xs)
   
def combinate(n: Int) = {
		def comb(k: Int): List[(Int,Int)] = {
			if (k == 0) List()
			else
				for {
				   i <- comb(k - 1)
				   	j <- 1 until i
				  } yield (i,j)
		}
		comb(n)
	}
 
 
 combinate(3)
 
}