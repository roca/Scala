
import forcomp.Anagrams._

object test {
val sentence = List("Yes", "man")                 //> sentence  : List[String] = List(Yes, man)
val occurrences = sentenceOccurrences(sentence)   //> occurrences  : forcomp.Anagrams.Occurrences = List((a,1), (e,1), (m,1), (n,1
                                                  //| ), (s,1), (y,1))
val combin = combinations(occurrences)            //> combin  : List[forcomp.Anagrams.Occurrences] = List(List((a,1)), List((e,1))
                                                  //| , List((m,1)), List((n,1)), List((s,1)), List((y,1)), List((a,1), (e,1)), Li
                                                  //| st((a,1), (m,1)), List((a,1), (n,1)), List((a,1), (s,1)), List((a,1), (y,1))
                                                  //| , List((e,1), (m,1)), List((e,1), (n,1)), List((e,1), (s,1)), List((e,1), (y
                                                  //| ,1)), List((m,1), (n,1)), List((m,1), (s,1)), List((m,1), (y,1)), List((n,1)
                                                  //| , (s,1)), List((n,1), (y,1)), List((s,1), (y,1)), List((a,1), (e,1), (m,1)),
                                                  //|  List((a,1), (e,1), (n,1)), List((a,1), (e,1), (s,1)), List((a,1), (e,1), (y
                                                  //| ,1)), List((a,1), (m,1), (n,1)), List((a,1), (m,1), (s,1)), List((a,1), (m,1
                                                  //| ), (y,1)), List((a,1), (n,1), (s,1)), List((a,1), (n,1), (y,1)), List((a,1),
                                                  //|  (s,1), (y,1)), List((e,1), (m,1), (n,1)), List((e,1), (m,1), (s,1)), List((
                                                  //| e,1), (m,1), (y,1)), List((e,1), (n,1), (s,1)), List((e,1), (n,1), (y,1)), L
                                                  //| ist((e,1), (s,1), (y,1)), List((m,1), (n,1), (s,1)), List((m,1), (n,1), (y,1
                                                  //| )), List((m,1), (s,1), (
                                                  //| Output exceeds cutoff limit.

 sentenceAnagrams(sentence).filter(x => (x.length > 1))
                                                  //> res0: List[forcomp.Anagrams.Sentence] = List(List(manes, means, names), List
                                                  //| (ayes, easy, yeas), List(sane, Sean), List(Ames, same, seam), List(amen, man
                                                  //| e, mean, name), List(any, nay), List(Amy, May), List(aye, yea), List(em, me)
                                                  //| )

}