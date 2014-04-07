package week6

object pairs {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(93); 

def isPrime(n:Int): Boolean = (2 until n) forall ( n % _ != 0);System.out.println("""isPrime: (n: Int)Boolean""");$skip(16); 
   
  val n = 7;System.out.println("""n  : Int = """ + $show(n ));$skip(106); val res$0 = 
  (1 until n) flatMap (i =>
   (1 until i) map (j => (i, j))) filter (pair => isPrime(pair._1 + pair._2));System.out.println("""res0: scala.collection.immutable.IndexedSeq[(Int, Int)] = """ + $show(res$0));$skip(85); val res$1 = 
  for {
   i <- 1 until n
   	j <- 1 until i
   		if isPrime( i + j)
  } yield (i,j);System.out.println("""res1: scala.collection.immutable.IndexedSeq[(Int, Int)] = """ + $show(res$1));$skip(34); 
   
   val xs = List(1.0,2.0,3.0);System.out.println("""xs  : List[Double] = """ + $show(xs ));$skip(124); 
   def scalarProduct(xs: List[Double], ys: List[Double]) : Double = {
     (xs zip ys).map{ case (x, y) => x * y }.sum
   };System.out.println("""scalarProduct: (xs: List[Double], ys: List[Double])Double""");$skip(155); 
   
   def scalarProduct2(xs: List[Double], ys: List[Double]) : Double = {
    {for {
         (x,y) <- (xs zip ys)
        } yield (x * y)
    }.sum
   };System.out.println("""scalarProduct2: (xs: List[Double], ys: List[Double])Double""");$skip(25); val res$2 = 
   scalarProduct2(xs,xs)
   
   
   type Occurrence = (Char, Int)
  type Occurrences = List[Occurrence];System.out.println("""res2: Double = """ + $show(res$2));$skip(209); 
  
def expand(in: Occurrences): List[(Char,Int)] =
    for {
        o <- in
        i <- 1 to o._2
        
    } yield (o._1,i);System.out.println("""expand: (in: week6.pairs.Occurrences)List[(Char, Int)]""");$skip(129); 
 
 def hasDuplicates(in: Occurrences): Boolean = {
   val ing = in.groupBy( x => x._1).keys.toList
   ing.length != in.length
 };System.out.println("""hasDuplicates: (in: week6.pairs.Occurrences)Boolean""");$skip(161); 
 
 def combine(in: Occurrences): Seq[Occurrences] =
    for {
        len <- 1 to in.length
        combinations <- in combinations len
    } yield combinations;System.out.println("""combine: (in: week6.pairs.Occurrences)Seq[week6.pairs.Occurrences]""");$skip(48); 
    
    val ol = List(('a',2),('b',2),('c',3));System.out.println("""ol  : List[(Char, Int)] = """ + $show(ol ));$skip(23); 
    val e = expand(ol);System.out.println("""e  : List[(Char, Int)] = """ + $show(e ));$skip(37); 
    val z = e.combinations(0).toList;System.out.println("""z  : List[List[(Char, Int)]] = """ + $show(z ));$skip(27); val res$3 = 
    
    hasDuplicates(ol);System.out.println("""res3: Boolean = """ + $show(res$3));$skip(43); val res$4 = 
    
    z.filter( x => !hasDuplicates(x));System.out.println("""res4: List[List[(Char, Int)]] = """ + $show(res$4));$skip(150); 
    
    def expandOccurrences(in: Occurrences): List[(Char,Int)] = {
	    for {
	        o <- in
	        i <- 1 to o._2
       } yield (o._1,i)
  };System.out.println("""expandOccurrences: (in: week6.pairs.Occurrences)List[(Char, Int)]""");$skip(149); 
  def hasDuplicateOccurrences(in: Occurrences): Boolean = {
	   val in_grpd = in.groupBy( x => x._1).keys.toList
	   in_grpd.length != in.length
  };System.out.println("""hasDuplicateOccurrences: (in: week6.pairs.Occurrences)Boolean""");$skip(375); 
  
  
  def combinations(occurrences: Occurrences): List[Occurrences] = {
    val expanded = expandOccurrences(occurrences)
    def f(n:Int, acc:List[Occurrences]): List[Occurrences] ={
      if (n == 0) acc
      else {
        f(n-1,expanded.combinations(n).toList.filter( x => !hasDuplicateOccurrences(x)) ::: acc)
      }
    }
    f(occurrences.length,List(List()))
  };System.out.println("""combinations: (occurrences: week6.pairs.Occurrences)List[week6.pairs.Occurrences]""");$skip(22); val res$5 = 
  
  combinations(ol);System.out.println("""res5: List[week6.pairs.Occurrences] = """ + $show(res$5));$skip(35); val res$6 = 
  
  (ol.toSet -- ol.toSet).toList;System.out.println("""res6: List[(Char, Int)] = """ + $show(res$6))}
    
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
