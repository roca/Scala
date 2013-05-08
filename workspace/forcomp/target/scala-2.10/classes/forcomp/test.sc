
import forcomp.Anagrams._

object test {

val sentence = List("Linux", "rulez")             //> sentence  : List[String] = List(ab, ba)
sentence.foldRight("")((x,y) => x + y)            //> res0: String = abba

           val big_word = sentence.foldRight("")((x,y) => x + y)
                                                  //> big_word  : String = abba
    	   val occurrences = wordOccurrences(big_word)
                                                  //> occurrences  : forcomp.Anagrams.Occurrences = List((a,2), (b,2))
    	   val combin = combinations(occurrences) //> combin  : List[forcomp.Anagrams.Occurrences] = List(List((a,1)), List((a,2))
                                                  //| , List((b,1)), List((b,2)), List((a,1), (b,1)), List((a,1), (b,2)), List((a,
                                                  //| 2), (b,1)), List((a,2), (b,2)), List())
sentenceAnagrams(sentence)                        //> res1: List[forcomp.Anagrams.Sentence] = List(List(Abba))
}