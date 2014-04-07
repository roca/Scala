val names = List("Brad", "Bob", "Jill",
  "Jane", "Jack", "Sara", "Bruce")

def len(name :String) = {
  println(s"len called on $name")
  name.length
}

println(
  names.map { name => (name, len(name)) }
    .filter { nameLength => nameLength._2 == 3 }  
)

println("let's be lazy")
println(
  names.view.map { name => (name, len(name)) }
    .find { nameLength => nameLength._2 == 3 }
)



