object Guesser {
  val target = (math.random * 100).toInt
  
  @scala.annotation.tailrec
  def play(attempts : Int = 1) {
    print("Enter your guess:")
    val guess = Console.readInt
    val compare = guess compare target
    val (response, playAgain) = 
      compare match {
        case -1 => ("Aim higher", true)
        case 1 => ("Aim lower", true)
        case 0 => (s"You got it in $attempts attempts", false)
      }
    
    println(response)
    if(playAgain) play(attempts + 1)
  }
}

println("I've picked a number, can you guess?")
Guesser.play()