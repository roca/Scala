
import forcomp.Anagrams._

object test {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(60); 


 val w = "badca";System.out.println("""w  : String = """ + $show(w ));$skip(28); 
  val x = w.sortBy( x => x);System.out.println("""x  : String = """ + $show(x ));$skip(36); 
  val ls = w groupBy(c => c) toList;System.out.println("""ls  : List[(Char, String)] = """ + $show(ls ));$skip(41); val res$0 = 
  
  ls map {case (x,y) => (x,y.length)};System.out.println("""res0: List[(Char, Int)] = """ + $show(res$0));$skip(25); val res$1 = 

  
  wordOccurrences(w);System.out.println("""res1: forcomp.Anagrams.Occurrences = """ + $show(res$1));$skip(77); val res$2 = 
  
  wordOccurrences("abcd") == List(('a', 1), ('b', 1), ('c', 1), ('d', 1));System.out.println("""res2: Boolean = """ + $show(res$2));$skip(87); val res$3 = 
   wordOccurrences("Robert") == List(('b', 1), ('e', 1), ('o', 1), ('r', 2), ('t', 1));System.out.println("""res3: Boolean = """ + $show(res$3));$skip(32); 
  val zs = List("AA","BB","CC");System.out.println("""zs  : List[String] = """ + $show(zs ));$skip(35); val res$4 = 
  zs.foldRight("")((x,y) => x + y);System.out.println("""res4: String = """ + $show(res$4));$skip(15); val res$5 = 
  
  "A" + "B";System.out.println("""res5: String("AB") = """ + $show(res$5));$skip(59); 
  
  val y =  dictionary.map( x => (wordOccurrences(x),x));System.out.println("""y  : List[(forcomp.Anagrams.Occurrences, forcomp.Anagrams.Word)] = """ + $show(y ));$skip(33); 
 val z = y.groupBy( (x) => x._1);System.out.println("""z  : scala.collection.immutable.Map[forcomp.Anagrams.Occurrences,List[(forcomp.Anagrams.Occurrences, forcomp.Anagrams.Word)]] = """ + $show(z ));$skip(55); 
   val t = z.map{ case (x,y) => (x,y.map(x => x._2) )};System.out.println("""t  : scala.collection.immutable.Map[forcomp.Anagrams.Occurrences,List[forcomp.Anagrams.Word]] = """ + $show(t ));$skip(42); val res$6 = 
   t.filter(  (X) => (X._2.length > 3)  );System.out.println("""res6: scala.collection.immutable.Map[forcomp.Anagrams.Occurrences,List[forcomp.Anagrams.Word]] = """ + $show(res$6));$skip(77); val res$7 = 
dictionaryByOccurrences.get(List(('a', 1), ('e', 1), ('t', 1))).map(_.toSet);System.out.println("""res7: Option[scala.collection.immutable.Set[forcomp.Anagrams.Word]] = """ + $show(res$7));$skip(29); val res$8 = 
wordAnagrams("player").toSet;System.out.println("""res8: scala.collection.immutable.Set[forcomp.Anagrams.Word] = """ + $show(res$8));$skip(37); val res$9 = 
wordAnagrams("player").toSet.flatten;System.out.println("""res9: scala.collection.immutable.Set[Char] = """ + $show(res$9))}
}
