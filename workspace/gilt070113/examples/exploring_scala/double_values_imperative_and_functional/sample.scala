val numbers = List(2, 5, 1, 7, 3, 4)
//imperative

var doubledValues : List[Int] = List()
for(e <- numbers) {
  doubledValues =  doubledValues ::: List(e * 2)
}

println(doubledValues)

//functional (and definitely better) way
println(numbers.map { e => e * 2 })

println(numbers.map { _ * 2 })

def doubleIt(number: Int) = number * 2

println(numbers map doubleIt)