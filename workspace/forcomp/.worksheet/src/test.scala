
import forcomp.Anagrams._

object test {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(75); 
val sentence = List("Yes", "man");System.out.println("""sentence  : List[String] = """ + $show(sentence ));$skip(48); 
val occurrences = sentenceOccurrences(sentence);System.out.println("""occurrences  : forcomp.Anagrams.Occurrences = """ + $show(occurrences ));$skip(39); 
val combin = combinations(occurrences);System.out.println("""combin  : List[forcomp.Anagrams.Occurrences] = """ + $show(combin ));$skip(57); val res$0 = 

 sentenceAnagrams(sentence).filter(x => (x.length > 1));System.out.println("""res0: List[forcomp.Anagrams.Sentence] = """ + $show(res$0))}

}
