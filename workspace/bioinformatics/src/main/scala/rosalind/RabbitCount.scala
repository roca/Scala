package main.scala.rosalind


import scala.io.Source._

object RabbitCount {
  def main(args: Array[String]): Unit = {

   val dna_seq = fromFile(args(0), "utf-8").getLines.mkString
    println(fibonacciNumbersUpTo(5).mkString(" "))
  }

  def fibonacciNumbersUpTo(n: Int): List[Int] = {

  	lazy val fib: Stream[Int] = Stream.cons(0, Stream.cons(1, fib.zip(fib.tail) map { case (c1,c2) => c1 + c2 } ))

  	  fib.take(n).toList

  }

}