package forcomp

object test {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(48); 


 val w = "badc";System.out.println("""w  : String = """ + $show(w ));$skip(28); 
  val x = w.sortBy( x => x);System.out.println("""x  : String = """ + $show(x ));$skip(36); 
  val ls = w groupBy(c => c) toList;System.out.println("""ls  : List[(Char, String)] = """ + $show(ls ));$skip(41); val res$0 = 
  
  ls map {case (x,y) => (x,y.length)}

 type Word = String
   type Occurrences = List[(Char, Int)];System.out.println("""res0: List[(Char, Int)] = """ + $show(res$0));$skip(305); 
   
   def wordOccurrences(w: Word): Occurrences = {
    val rw = w.toLowerCase.replaceAll("[^\\w]","")
    val ls = rw.groupBy(c => c).toList
    val unsorted_ls = ls.map{case (x,y) => (x,y.length)}
    unsorted_ls.sortBy{case (x,y) => x}
  };System.out.println("""wordOccurrences: (w: forcomp.test.Word)forcomp.test.Occurrences""");$skip(24); val res$1 = 
  
  wordOccurrences(w);System.out.println("""res1: forcomp.test.Occurrences = """ + $show(res$1));$skip(77); val res$2 = 
  
  wordOccurrences("abcd") == List(('a', 1), ('b', 1), ('c', 1), ('d', 1));System.out.println("""res2: Boolean = """ + $show(res$2));$skip(87); val res$3 = 
   wordOccurrences("Robert") == List(('b', 1), ('e', 1), ('o', 1), ('r', 2), ('t', 1));System.out.println("""res3: Boolean = """ + $show(res$3));$skip(32); 
  val zs = List("AA","BB","CC");System.out.println("""zs  : List[String] = """ + $show(zs ));$skip(35); val res$4 = 
  zs.foldRight("")((x,y) => x + y);System.out.println("""res4: String = """ + $show(res$4));$skip(15); val res$5 = 
  
  "A" + "B";System.out.println("""res5: String("AB") = """ + $show(res$5))}
}
