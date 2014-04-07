class Pair[T](val value1: T, val value2 : T)

val pair1 = new Pair(1, 2)
println(pair1.value1)
println(pair1.value2)

val pair2 = new Pair("hi", "howdy")
println(pair2.value1)
println(pair2.value2)

val pair3 = new Pair(1, "hi")
println(pair3.value1.getClass)
println(pair3.value2.getClass)

def printPair(pair: Pair[_]) = {
  println(pair.value1)
  println(pair.value2)
}
  
printPair(pair1)
printPair(pair2)
  
  
  
  
  
  

