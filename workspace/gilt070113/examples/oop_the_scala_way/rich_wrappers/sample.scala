println(1.toString)
println(-1.abs)
//Uses rich wrappers

println(-1.abs.getClass)
//scala -save sample.scala 
//jar xf sample.jar
//The use javap -c to examine the bytecode
//to see RichInt being used.