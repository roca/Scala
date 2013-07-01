val numbers = List(2, 5, 1, 7, 3, 4)

//functional style
println(numbers.foldLeft(0)(math.max))

println((0 /: numbers)(math.max))