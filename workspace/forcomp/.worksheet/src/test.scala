
import forcomp.Anagrams._

object test {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(80); 

val sentence = List("Linux", "rulez");System.out.println("""sentence  : List[String] = """ + $show(sentence ));$skip(39); val res$0 = 
sentence.foldRight("")((x,y) => x + y);System.out.println("""res0: String = """ + $show(res$0));$skip(66); 

           val big_word = sentence.foldRight("")((x,y) => x + y);System.out.println("""big_word  : String = """ + $show(big_word ));$skip(52); 
    	   val occurrences = wordOccurrences(big_word);System.out.println("""occurrences  : forcomp.Anagrams.Occurrences = """ + $show(occurrences ));$skip(47); 
    	   val combin = combinations(occurrences);System.out.println("""combin  : List[forcomp.Anagrams.Occurrences] = """ + $show(combin ));$skip(27); val res$1 = 
sentenceAnagrams(sentence);System.out.println("""res1: List[forcomp.Anagrams.Sentence] = """ + $show(res$1))}
}
