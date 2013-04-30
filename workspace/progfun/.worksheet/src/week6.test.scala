package week6

object test {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(55); 
  val xs = Array(1,2,3,44);System.out.println("""xs  : Array[Int] = """ + $show(xs ));$skip(23); val res$0 = 
  xs map ( x => x * 2);System.out.println("""res0: Array[Int] = """ + $show(res$0));$skip(12); val res$1 = 
  
  xs.sum;System.out.println("""res1: Int = """ + $show(res$1));$skip(9); val res$2 = 
  xs.max;System.out.println("""res2: Int = """ + $show(res$2));$skip(27); 
  
  val s = "Hello World";System.out.println("""s  : String = """ + $show(s ));$skip(27); val res$3 = 
  s exists(c => c.isUpper);System.out.println("""res3: Boolean = """ + $show(res$3));$skip(27); val res$4 = 
  s forall(c => c.isUpper);System.out.println("""res4: Boolean = """ + $show(res$4));$skip(35); 
  
  val pairs = List(1,2,3) zip s;System.out.println("""pairs  : List[(Int, Char)] = """ + $show(pairs ));$skip(14); val res$5 = 
  pairs.unzip;System.out.println("""res5: (List[Int], List[Char]) = """ + $show(res$5));$skip(34); val res$6 = 
  
  s flatMap (c => List('.',c));System.out.println("""res6: String = """ + $show(res$6));$skip(30); val res$7 = 
  
  s filter(c => c.isUpper);System.out.println("""res7: String = """ + $show(res$7));$skip(36); 
  val ls = s groupBy(c => c) toList;System.out.println("""ls  : List[(Char, String)] = """ + $show(ls ));$skip(41); val res$8 = 
  
  ls map {case (x,y) => (x,y.length)};System.out.println("""res8: List[(Char, Int)] = """ + $show(res$8));$skip(77); 
     
 def isPrime(n:Int): Boolean = (2 until n) forall ( d => (n % d) != 0);System.out.println("""isPrime: (n: Int)Boolean""");$skip(14); val res$9 = 
   isPrime(5);System.out.println("""res9: Boolean = """ + $show(res$9));$skip(14); val res$10 = 
   isPrime(6);System.out.println("""res10: Boolean = """ + $show(res$10))}
}
