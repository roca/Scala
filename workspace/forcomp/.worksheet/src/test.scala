
import forcomp.Anagrams._

object test {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(81); 

val sentence1 = List("Linux", "rulez");System.out.println("""sentence1  : List[String] = """ + $show(sentence1 ));$skip(699); 
    val anas1 = List(
      List("Rex", "Lin", "Zulu"),
      List("nil", "Zulu", "Rex"),
      List("Rex", "nil", "Zulu"),
      List("Zulu", "Rex", "Lin"),
      List("null", "Uzi", "Rex"),
      List("Rex", "Zulu", "Lin"),
      List("Uzi", "null", "Rex"),
      List("Rex", "null", "Uzi"),
      List("null", "Rex", "Uzi"),
      List("Lin", "Rex", "Zulu"),
      List("nil", "Rex", "Zulu"),
      List("Rex", "Uzi", "null"),
      List("Rex", "Zulu", "nil"),
      List("Zulu", "Rex", "nil"),
      List("Zulu", "Lin", "Rex"),
      List("Lin", "Zulu", "Rex"),
      List("Uzi", "Rex", "null"),
      List("Zulu", "nil", "Rex"),
      List("rulez", "Linux"),
      List("Linux", "rulez")
    );System.out.println("""anas1  : List[List[String]] = """ + $show(anas1 ));$skip(464); 
    
    val anas2 = List(
         List("en", "as", "my"),
         List("en", "my", "as"),
         List("man", "yes"),
         List("men", "say"),
         List("as", "en", "my"),
         List("as", "my", "en"),
         List("sane", "my"),
         List("Sean", "my"),
         List("my", "en", "as"),
         List("my", "as", "en"),
         List("my", "sane"),
         List("my", "Sean"),
         List("say", "men"),
         List("yes","man")
       );System.out.println("""anas2  : List[List[String]] = """ + $show(anas2 ));$skip(35); 
val sentence2 = List("Yes", "man");System.out.println("""sentence2  : List[String] = """ + $show(sentence2 ));$skip(53); val res$0 = 




sentenceAnagrams(sentence2).toSet == anas2.toSet;System.out.println("""res0: Boolean = """ + $show(res$0));$skip(49); val res$1 = 
sentenceAnagrams(sentence1).toSet == anas1.toSet;System.out.println("""res1: Boolean = """ + $show(res$1));$skip(26); val res$2 = 

sentenceAnagrams(List());System.out.println("""res2: List[forcomp.Anagrams.Sentence] = """ + $show(res$2))}
                             

                      




 }
