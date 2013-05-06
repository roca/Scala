package week6

object pairs {

def isPrime(n:Int): Boolean = (2 until n) forall ( n % _ != 0)
                                                  //> isPrime: (n: Int)Boolean
   
  val n = 7                                       //> n  : Int = 7
  (1 until n) flatMap (i =>
   (1 until i) map (j => (i, j))) filter (pair => isPrime(pair._1 + pair._2))
                                                  //> res0: scala.collection.immutable.IndexedSeq[(Int, Int)] = Vector((2,1), (3,2
                                                  //| ), (4,1), (4,3), (5,2), (6,1), (6,5))
  for {
   i <- 1 until n
   	j <- 1 until i
   		if isPrime( i + j)
  } yield (i,j)                                   //> res1: scala.collection.immutable.IndexedSeq[(Int, Int)] = Vector((2,1), (3,2
                                                  //| ), (4,1), (4,3), (5,2), (6,1), (6,5))
   
   val xs = List(1.0,2.0,3.0)                     //> xs  : List[Double] = List(1.0, 2.0, 3.0)
   def scalarProduct(xs: List[Double], ys: List[Double]) : Double = {
     (xs zip ys).map{ case (x, y) => x * y }.sum
   }                                              //> scalarProduct: (xs: List[Double], ys: List[Double])Double
   
   def scalarProduct2(xs: List[Double], ys: List[Double]) : Double = {
    {for {
         (x,y) <- (xs zip ys)
        } yield (x * y)
    }.sum
   }                                              //> scalarProduct2: (xs: List[Double], ys: List[Double])Double
   scalarProduct2(xs,xs)                          //> res2: Double = 14.0
   
   
   type Occurrence = (Char, Int)
  type Occurrences = List[Occurrence]
  
def expand(in: Occurrences): List[(Char,Int)] =
    for {
        o <- in
        i <- 1 to o._2
        
    } yield (o._1,i)                              //> expand: (in: week6.pairs.Occurrences)List[(Char, Int)]
 
 
 def combine(in: Occurrences): Seq[Occurrences] =
    for {
        len <- 1 to in.length
        combinations <- in combinations len
    } yield combinations                          //> combine: (in: week6.pairs.Occurrences)Seq[week6.pairs.Occurrences]
    
    val ol = List(('a',2),('b',2),('c',3))        //> ol  : List[(Char, Int)] = List((a,2), (b,2), (c,3))
    val e = expand(ol)                            //> e  : List[(Char, Int)] = List((a,1), (a,2), (b,1), (b,2), (c,1), (c,2), (c,
                                                  //| 3))
   e.groupBy( x => x._1 ).values.toList           //> res3: List[List[(Char, Int)]] = List(List((b,1), (b,2)), List((a,1), (a,2))
                                                  //| , List((c,1), (c,2), (c,3)))
   
   val z = e.combinations(ol.length).toList.filter(x => x.groupBy( y => y._1).toList.length <  3) ::: e.map( x => List(x)) ::: List(List())
                                                  //> z  : List[List[(Char, Int)]] = List(List((a,1), (a,2), (b,1)), List((a,1), 
                                                  //| (a,2), (b,2)), List((a,1), (a,2), (c,1)), List((a,1), (a,2), (c,2)), List((
                                                  //| a,1), (a,2), (c,3)), List((a,1), (b,1), (b,2)), List((a,1), (c,1), (c,2)), 
                                                  //| List((a,1), (c,1), (c,3)), List((a,1), (c,2), (c,3)), List((a,2), (b,1), (b
                                                  //| ,2)), List((a,2), (c,1), (c,2)), List((a,2), (c,1), (c,3)), List((a,2), (c,
                                                  //| 2), (c,3)), List((b,1), (b,2), (c,1)), List((b,1), (b,2), (c,2)), List((b,1
                                                  //| ), (b,2), (c,3)), List((b,1), (c,1), (c,2)), List((b,1), (c,1), (c,3)), Lis
                                                  //| t((b,1), (c,2), (c,3)), List((b,2), (c,1), (c,2)), List((b,2), (c,1), (c,3)
                                                  //| ), List((b,2), (c,2), (c,3)), List((c,1), (c,2), (c,3)), List((a,1)), List(
                                                  //| (a,2)), List((b,1)), List((b,2)), List((c,1)), List((c,2)), List((c,3)), Li
                                                  //| st())
  z.length                                        //> res4: Int = 31
}