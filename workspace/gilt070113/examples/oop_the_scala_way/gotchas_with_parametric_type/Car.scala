class Pair[T](val value1 : T, val value2 : T)

val pair1 = new Pair(1, "test")
println(pair1.value1.getClass)
println(pair1.value2.getClass)

//The above is sad, it becomes a Pair of Any

//val pair2 : Pair[Int] = new Pair(1, "test")
//This is not allowed!