
//import forcomp.Anagrams._

object test {

 List(('a',1),('b',2)).map(x => x._1).mkString("").replace('a','x') //> res0: String = ab
}