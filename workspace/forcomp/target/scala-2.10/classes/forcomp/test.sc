
import forcomp.Anagrams._

object test {

val sentence = List("Linux", "rulez")             //> sentence  : List[String] = List(Linux, rulez)
sentenceAnagrams(sentence)                        //> res0: List[forcomp.Anagrams.Sentence] = List(List(re, rue, lure, rule, rulez
                                                  //| ), List(re, ex, rue, Rex, lure, rule, rulez), List(re, ex, rue, Rex, Zulu, l
                                                  //| ure, rule, rulez), List(en, re, ex, nu, Len, Zen, rue, Rex, Zulu, run, urn, 
                                                  //| lure, rule, rulez), List(en, re, ex, in, nu, Eli, lie, ire, Len, Zen, rue, R
                                                  //| ex, Lin, nil, Liz, Uri, Uzi, Zulu, run, urn, lien, line, Neil, Nile, lieu, r
                      
                      
                                                  //| ein, lure, rule, ruin, Unix, liner, urine, rulez, Linux), List(en, re, ex, i
                                                  //| ll, in, nu, Eli, lie, ire, Len, Nell, Zen, rue, Rex, Lin, nil, Liz, rill, Ur
                                                  //| i, Uzi, Zulu, null, run, urn, lien, line, Neil, Nile, lieu, rein, lure, rule
                                                  //| , ruin, Unix, liner, urine, rulez, Linux))
wordAnagrams("live")                              //> res1: List[forcomp.Anagrams.Word] = List(evil, Levi, live, veil, vile)

dictionaryByOccurrences(wordOccurrences("Io"))    //> res2: List[forcomp.Anagrams.Word] = List(Io)







 }