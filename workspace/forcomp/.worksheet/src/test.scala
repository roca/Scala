
import forcomp.Anagrams._

object test {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(80); 

val sentence = List("Linux", "rulez");System.out.println("""sentence  : List[String] = """ + $show(sentence ));$skip(40); val res$0 = 

sentence.foldRight("")((x,y) => x + y);System.out.println("""res0: String = """ + $show(res$0));$skip(27); val res$1 = 
sentenceAnagrams(sentence);System.out.println("""res1: List[forcomp.Anagrams.Sentence] = """ + $show(res$1))}
                     
                      
                      




 }
