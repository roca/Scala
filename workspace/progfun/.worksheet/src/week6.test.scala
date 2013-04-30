package week6

object test {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(55); 
  val xs = Array(1,2,3,44);System.out.println("""xs  : Array[Int] = """ + $show(xs ));$skip(23); val res$0 = 
  xs map ( x => x * 2);System.out.println("""res0: Array[Int] = """ + $show(res$0));$skip(12); val res$1 = 
  
  xs.sum;System.out.println("""res1: Int = """ + $show(res$1));$skip(9); val res$2 = 
  xs.max;System.out.println("""res2: Int = """ + $show(res$2));$skip(29); 
  
  val s = "Hello World.,";System.out.println("""s  : String = """ + $show(s ));$skip(28); val res$3 = 
  s.replaceAll("[^\\w]","");System.out.println("""res3: String = """ + $show(res$3));$skip(27); val res$4 = 
  s exists(c => c.isUpper);System.out.println("""res4: Boolean = """ + $show(res$4));$skip(27); val res$5 = 
  s forall(c => c.isUpper);System.out.println("""res5: Boolean = """ + $show(res$5));$skip(35); 
  
  val pairs = List(1,2,3) zip s;System.out.println("""pairs  : List[(Int, Char)] = """ + $show(pairs ));$skip(14); val res$6 = 
  pairs.unzip;System.out.println("""res6: (List[Int], List[Char]) = """ + $show(res$6));$skip(34); val res$7 = 
  
  s flatMap (c => List('.',c));System.out.println("""res7: String = """ + $show(res$7));$skip(30); val res$8 = 
  
  s filter(c => c.isUpper);System.out.println("""res8: String = """ + $show(res$8));$skip(20); 
  
  val w = "badc";System.out.println("""w  : String = """ + $show(w ));$skip(28); 
  val x = w.sortBy( x => x);System.out.println("""x  : String = """ + $show(x ));$skip(36); 
  val ls = w groupBy(c => c) toList;System.out.println("""ls  : List[(Char, String)] = """ + $show(ls ));$skip(41); val res$9 = 
  
  ls map {case (x,y) => (x,y.length)};System.out.println("""res9: List[(Char, Int)] = """ + $show(res$9));$skip(77); 
     
 def isPrime(n:Int): Boolean = (2 until n) forall ( d => (n % d) != 0);System.out.println("""isPrime: (n: Int)Boolean""");$skip(14); val res$10 = 
   isPrime(5);System.out.println("""res10: Boolean = """ + $show(res$10));$skip(14); val res$11 = 
   isPrime(6)
   
   type Word = String
   type Occurrences = List[(Char, Int)];System.out.println("""res11: Boolean = """ + $show(res$11));$skip(310); 
   
   def wordOccurrences(w: Word): Occurrences = {
    val rw = w.toLowerCase.replaceAll("[^\\w]","")
    val ls = rw.groupBy(c => c).toList
    val unsorted_ls = ls.map{case (x,y) => (x,y.length)}
    unsorted_ls.sortBy{case (x,y) => x}
  };System.out.println("""wordOccurrences: (w: week6.test.Word)week6.test.Occurrences""");$skip(24); val res$12 = 
  
  wordOccurrences(w);System.out.println("""res12: week6.test.Occurrences = """ + $show(res$12));$skip(77); val res$13 = 
  
  wordOccurrences("abcd") == List(('a', 1), ('b', 1), ('c', 1), ('d', 1));System.out.println("""res13: Boolean = """ + $show(res$13));$skip(87); val res$14 = 
   wordOccurrences("Robert") == List(('b', 1), ('e', 1), ('o', 1), ('r', 2), ('t', 1));System.out.println("""res14: Boolean = """ + $show(res$14))}
}
