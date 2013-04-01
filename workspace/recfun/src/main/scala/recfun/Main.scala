package recfun
import common._

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
  }

  /**
   * Exercise 1
   * Used this as a reference : http://www.mathsisfun.com/pascals-triangle.html
   */
  def abs(x:Int) = if (x < 0) -x else x
  def pascal(c: Int, r: Int): Int = {
   def factorial(n: Int): Int = {
	   def loop(acc: Int,n: Int): Int = {
	     if (n == 0) acc
	     else loop( acc * n , n - 1)
	   }
	 loop(1,n)
	}
   factorial(r) / ( factorial(c) * factorial(abs(r-c)) )
  }

  /**
   * Exercise 2
   */
  def balance(chars: List[Char]): Boolean = {
    def f(s: List[Char],acc: List[Char]): List[Char]= {
      if (s.isEmpty) acc
      else if (s.head == '(') f(s.tail, s.head :: acc )
      else if (s.head == ')') {
                    if (acc.isEmpty) f(s.tail, '(' :: acc)
      				else f(s.tail, acc.tail)
      		}
      else f(s.tail, acc)
    }
    f(chars,List()).isEmpty
  }

  /**
   * Exercise 3
   * Used this as a reference : https://subjoin.net/misc/m496pres1.nb.pdf
   */
   def countChange(money: Int, coins: List[Int]): Int = {
		def f(money: Int, remain_ing_coins: List[Int], acc: Int): Int = {
		  if ( remain_ing_coins.isEmpty || money < 0) 0
		  else{
		    if (money == 0 ) acc + 1   
		    else
		      f(money, remain_ing_coins.tail,acc) + f(money - remain_ing_coins.head,remain_ing_coins, acc)
		  }
		}
		
		f(money, coins, 0)
	}
}
