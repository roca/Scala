
import forcomp.Anagrams._

object test {

val sentence = List("Linux", "rulez")             //> sentence  : List[String] = List(Linux, rulez)
sentence.foldRight("")((x,y) => x + y)            //> res0: String = Linuxrulez

           val big_word = sentence.foldRight("")((x,y) => x + y)
                                                  //> big_word  : String = Linuxrulez
    	   val occurrences = wordOccurrences(big_word)
                                                  //> occurrences  : forcomp.Anagrams.Occurrences = List((e,1), (i,1), (l,2), (n,1
                                                  //| ), (r,1), (u,2), (x,1), (z,1))
    	   val combin = combinations(occurrences) //> combin  : List[forcomp.Anagrams.Occurrences] = List(List((e,1)), List((i,1))
                                                  //| , List((l,1)), List((l,2)), List((n,1)), List((r,1)), List((u,1)), List((u,2
                                                  //| )), List((x,1)), List((z,1)), List((e,1), (i,1)), List((e,1), (l,1)), List((
                                                  //| e,1), (l,2)), List((e,1), (n,1)), List((e,1), (r,1)), List((e,1), (u,1)), Li
                                                  //| st((e,1), (u,2)), List((e,1), (x,1)), List((e,1), (z,1)), List((i,1), (l,1))
                                                  //| , List((i,1), (l,2)), List((i,1), (n,1)), List((i,1), (r,1)), List((i,1), (u
                                                  //| ,1)), List((i,1), (u,2)), List((i,1), (x,1)), List((i,1), (z,1)), List((l,1)
                                                  //| , (n,1)), List((l,1), (r,1)), List((l,1), (u,1)), List((l,1), (u,2)), List((
                                                  //| l,1), (x,1)), List((l,1), (z,1)), List((l,2), (n,1)), List((l,2), (r,1)), Li
                                                  //| st((l,2), (u,1)), List((l,2), (u,2)), List((l,2), (x,1)), List((l,2), (z,1))
                                                  //| , List((n,1), (r,1)), List((n,1), (u,1)), List((n,1), (u,2)), List((n,1), (x
                                                  //| ,1)), List((n,1), (z,1)), List((r,1), (u,1)), List((r,1), (u,2)), List((r,1)
                                                  //| , (x,1)), List((r,1), (z
                                                  //| Output exceeds cutoff limit.
sentenceAnagrams(sentence)                        //> res1: List[forcomp.Anagrams.Sentence] = List(List(Linux), List(rulez), List(
                                                  //| urine), List(liner), List(Unix), List(ruin), List(lure, rule), List(rein), L
                                                  //| ist(lieu), List(lien, line, Neil, Nile), List(run, urn), List(null), List(Zu
                                                  //| lu), List(Uzi), List(Uri), List(rill), List(Liz), List(Lin, nil), List(Rex),
                                                  //|  List(rue), List(Zen), List(Nell), List(Len), List(ire), List(Eli, lie), Lis
                                                  //| t(nu), List(in), List(ill), List(ex), List(re), List(en))
}