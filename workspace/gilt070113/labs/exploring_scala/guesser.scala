// import scala.util.control.Breaks._

// println("I've selected a number, can you guess it!")
// val number = 75

// breakable {

// 	while (true) {
// 		val input : Int = Console.readInt
// 		if (input < number)
// 		    println("Aim higher")
// 		if (input > number)
// 		    println("Aim lowwer")
// 		 if (input == number) {
// 		    println("You guest it")
// 	        break
// 	      }
//   }
// }

println("I've selected a number, can you guess it!")
val myNumber = (math.random * 100).toInt

def guess(count: Int = 0)
{
        println("Enter your guess")
        val input = Console.readInt
        if(input==myNumber){
        println("Correct ")
        println(count)

        }

        if (input < myNumber){
        println("Aim higher")
        guess(count+1)
        }
        if (input > myNumber){
        println("Aim lower")
        guess(count+1)
        }
}

guess()