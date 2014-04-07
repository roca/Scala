def process(value : Any) = {
  value match {
    case 2 => println("you sent 2")
    case x : Int => println("Got an int " + x)
    case <greet>{msg}</greet> => println(msg)
    case (a, b) => println(a + " and " + b)
    case _ => println("received something " + value)
  }
}

process(2)
process(3)
process(2.2)
process(("salt", "pepper"))
process("hello")
process(<greet>hello</greet>)