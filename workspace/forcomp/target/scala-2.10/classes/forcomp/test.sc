
import forcomp.Anagrams._

object test {

val sentence = List("You", "olive")               //> sentence  : List[String] = List(You, olive)
sentence.foldRight("")((x,y) => x + y)            //> res0: String = Youolive
val big_word = sentence.foldRight("")((x,y) => x + y)
                                                  //> big_word  : String = Youolive
val occurrences = wordOccurrences(big_word)       //> occurrences  : forcomp.Anagrams.Occurrences = List((e,1), (i,1), (l,1), (o,2
                                                  //| ), (u,1), (v,1), (y,1))
val combin = combinations(occurrences)            //> combin  : List[forcomp.Anagrams.Occurrences] = List(List((e,1)), List((i,1))
                                                  //| , List((l,1)), List((o,1)), List((o,2)), List((u,1)), List((v,1)), List((y,1
                                                  //| )), List((e,1), (i,1)), List((e,1), (l,1)), List((e,1), (o,1)), List((e,1), 
                                                  //| (o,2)), List((e,1), (u,1)), List((e,1), (v,1)), List((e,1), (y,1)), List((i,
                                                  //| 1), (l,1)), List((i,1), (o,1)), List((i,1), (o,2)), List((i,1), (u,1)), List
                                                  //| ((i,1), (v,1)), List((i,1), (y,1)), List((l,1), (o,1)), List((l,1), (o,2)), 
                                                  //| List((l,1), (u,1)), List((l,1), (v,1)), List((l,1), (y,1)), List((o,1), (u,1
                                                  //| )), List((o,1), (v,1)), List((o,1), (y,1)), List((o,2), (u,1)), List((o,2), 
                                                  //| (v,1)), List((o,2), (y,1)), List((u,1), (v,1)), List((u,1), (y,1)), List((v,
                                                  //| 1), (y,1)), List((e,1), (i,1), (l,1)), List((e,1), (i,1), (o,1)), List((e,1)
                                                  //| , (i,1), (o,2)), List((e,1), (i,1), (u,1)), List((e,1), (i,1), (v,1)), List(
                                                  //| (e,1), (i,1), (y,1)), List((e,1), (l,1), (o,1)), List((e,1), (l,1), (o,2)), 
                                                  //| List((e,1), (l,1), (u,1)
                                                  //| Output exceeds cutoff limit.
wordAnagrams("You")                               //> res1: List[forcomp.Anagrams.Word] = List(you)
sentenceAnagrams(sentence)
}