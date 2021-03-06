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
 
 def hasDuplicates(in: Occurrences): Boolean = {
   val ing = in.groupBy( x => x._1).keys.toList
   ing.length != in.length
 }                                                //> hasDuplicates: (in: week6.pairs.Occurrences)Boolean
 
 def combine(in: Occurrences): Seq[Occurrences] =
    for {
        len <- 1 to in.length
        combinations <- in combinations len
    } yield combinations                          //> combine: (in: week6.pairs.Occurrences)Seq[week6.pairs.Occurrences]
    
    val ol = List(('a',2),('b',2),('c',3))        //> ol  : List[(Char, Int)] = List((a,2), (b,2), (c,3))
    val e = expand(ol)                            //> e  : List[(Char, Int)] = List((a,1), (a,2), (b,1), (b,2), (c,1), (c,2), (c,
                                                  //| 3))
    val z = e.combinations(0).toList              //> z  : List[List[(Char, Int)]] = List(List())
    
    hasDuplicates(ol)                             //> res3: Boolean = false
    
    z.filter( x => !hasDuplicates(x))             //> res4: List[List[(Char, Int)]] = List(List())
    
    def expandOccurrences(in: Occurrences): List[(Char,Int)] = {
	    for {
	        o <- in
	        i <- 1 to o._2
       } yield (o._1,i)
  }                                               //> expandOccurrences: (in: week6.pairs.Occurrences)List[(Char, Int)]
  def hasDuplicateOccurrences(in: Occurrences): Boolean = {
	   val in_grpd = in.groupBy( x => x._1).keys.toList
	   in_grpd.length != in.length
  }                                               //> hasDuplicateOccurrences: (in: week6.pairs.Occurrences)Boolean
  
  
  def combinations(occurrences: Occurrences): List[Occurrences] = {
    val expanded = expandOccurrences(occurrences)
    def f(n:Int, acc:List[Occurrences]): List[Occurrences] ={
      if (n == 0) acc
      else {
        f(n-1,expanded.combinations(n).toList.filter( x => !hasDuplicateOccurrences(x)) ::: acc)
      }
    }
    f(occurrences.length,List(List()))
  }                                               //> combinations: (occurrences: week6.pairs.Occurrences)List[week6.pairs.Occurr
                                                  //| ences]
  
  combinations(ol)                                //> res5: List[week6.pairs.Occurrences] = List(List((a,1)), List((a,2)), List((
                                                  //| b,1)), List((b,2)), List((c,1)), List((c,2)), List((c,3)), List((a,1), (b,1
                                                  //| )), List((a,1), (b,2)), List((a,1), (c,1)), List((a,1), (c,2)), List((a,1),
                                                  //|  (c,3)), List((a,2), (b,1)), List((a,2), (b,2)), List((a,2), (c,1)), List((
                                                  //| a,2), (c,2)), List((a,2), (c,3)), List((b,1), (c,1)), List((b,1), (c,2)), L
                                                  //| ist((b,1), (c,3)), List((b,2), (c,1)), List((b,2), (c,2)), List((b,2), (c,3
                                                  //| )), List((a,1), (b,1), (c,1)), List((a,1), (b,1), (c,2)), List((a,1), (b,1)
                                                  //| , (c,3)), List((a,1), (b,2), (c,1)), List((a,1), (b,2), (c,2)), List((a,1),
                                                  //|  (b,2), (c,3)), List((a,2), (b,1), (c,1)), List((a,2), (b,1), (c,2)), List(
                                                  //| (a,2), (b,1), (c,3)), List((a,2), (b,2), (c,1)), List((a,2), (b,2), (c,2)),
                                                  //|  List((a,2), (b,2), (c,3)), List())
  
  (ol.toSet -- ol.toSet).toList                   //> res6: List[(Char, Int)] = List()
    
    /*
   e.groupBy( x => x._1 ).values.toList
   
   
  e.combinations(2).toList
  for {
   x <- e.combinations(2).toList
  }yield x
   val z = e.combinations(ol.length).toList.filter(x => x.groupBy( y => y._1).toList.length <  2) ::: e.map( x => List(x)) ::: List(List())
  z.length
  
  */
}