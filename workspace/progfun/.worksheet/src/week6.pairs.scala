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
        
    } yield (o._1,i);System.out.println("""expand: (in: week6.pairs.Occurrences)List[(Char, Int)]""");$skip(163); 
 
 
 def combine(in: Occurrences): Seq[Occurrences] =
    for {
        len <- 1 to in.length
        combinations <- in combinations len
    } yield combinations;System.out.println("""combine: (in: week6.pairs.Occurrences)Seq[week6.pairs.Occurrences]""");$skip(48); 
    
    val ol = List(('a',2),('b',2),('c',3));System.out.println("""ol  : List[(Char, Int)] = """ + $show(ol ));$skip(23); 
    val e = expand(ol);System.out.println("""e  : List[(Char, Int)] = """ + $show(e ));$skip(40); val res$3 = 
   e.groupBy( x => x._1 ).values.toList;System.out.println("""res3: List[List[(Char, Int)]] = """ + $show(res$3));$skip(144); 
   
   val z = e.combinations(ol.length).toList.filter(x => x.groupBy( y => y._1).toList.length <  3) ::: e.map( x => List(x)) ::: List(List());System.out.println("""z  : List[List[(Char, Int)]] = """ + $show(z ));$skip(11); val res$4 = 
  z.length;System.out.println("""res4: Int = """ + $show(res$4))}
}
