val numbers = List(1, 2, 3, 4, 5, 6, 7)

//Total all even values greater than 3
var total = 0
for(i <- numbers) {
  if(i > 3 && i % 2 == 0)
    total +=i
}
println(total)

println(
  numbers
  .filter(_ > 3)
  .filter(_ % 2 == 0)
  .sum
)


