
import forcomp.Anagrams._

object test {

val sentence1 = List("Linux", "rulez")            //> sentence1  : List[String] = List(Linux, rulez)
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
    )                                             //> anas1  : List[List[String]] = List(List(Rex, Lin, Zulu), List(nil, Zulu, Rex
                                                  //| ), List(Rex, nil, Zulu), List(Zulu, Rex, Lin), List(null, Uzi, Rex), List(Re
                                                  //| x, Zulu, Lin), List(Uzi, null, Rex), List(Rex, null, Uzi), List(null, Rex, U
                                                  //| zi), List(Lin, Rex, Zulu), List(nil, Rex, Zulu), List(Rex, Uzi, null), List(
                                                  //| Rex, Zulu, nil), List(Zulu, Rex, nil), List(Zulu, Lin, Rex), List(Lin, Zulu,
                                                  //|  Rex), List(Uzi, Rex, null), List(Zulu, nil, Rex), List(rulez, Linux), List(
                                                  //| Linux, rulez))
    
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
       )                                          //> anas2  : List[List[String]] = List(List(en, as, my), List(en, my, as), List
                                                  //| (man, yes), List(men, say), List(as, en, my), List(as, my, en), List(sane, 
                                                  //| my), List(Sean, my), List(my, en, as), List(my, as, en), List(my, sane), Li
                                                  //| st(my, Sean), List(say, men), List(yes, man))
val sentence2 = List("Yes", "man")                //> sentence2  : List[String] = List(Yes, man)




sentenceAnagrams(sentence2).toSet == anas2.toSet  //> res0: Boolean = true
sentenceAnagrams(sentence1).toSet == anas1.toSet  //> res1: Boolean = true

sentenceAnagrams(List())                          //> res2: List[forcomp.Anagrams.Sentence] = List(List())
                             

                      




 }