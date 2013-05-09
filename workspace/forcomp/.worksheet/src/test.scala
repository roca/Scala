
import forcomp.Anagrams._

object test {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(80); 

val sentence = List("Linux", "rulez");System.out.println("""sentence  : List[String] = """ + $show(sentence ));$skip(27); val res$0 = 
sentenceAnagrams(sentence);System.out.println("""res0: List[forcomp.Anagrams.Sentence] = """ + $show(res$0));$skip(67); val res$1 = 
                      
                      
wordAnagrams("live");System.out.println("""res1: List[forcomp.Anagrams.Word] = """ + $show(res$1));$skip(48); val res$2 = 

dictionaryByOccurrences(wordOccurrences("Io"));System.out.println("""res2: List[forcomp.Anagrams.Word] = """ + $show(res$2))}







 }
