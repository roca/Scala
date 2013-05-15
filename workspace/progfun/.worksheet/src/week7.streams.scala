package week7

object streams {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(79); 
  def from(n:Int): Stream[Int]= n #:: from(n+1);System.out.println("""from: (n: Int)Stream[Int]""");$skip(20); 

val nats = from(0);System.out.println("""nats  : Stream[Int] = """ + $show(nats ));$skip(26); 
val m4s = nats map(_ * 4);System.out.println("""m4s  : scala.collection.immutable.Stream[Int] = """ + $show(m4s ));$skip(23); val res$0 = 

(m4s take 100).toList;System.out.println("""res0: List[Int] = """ + $show(res$0));$skip(96); 


def sieve(s: Stream[Int]) : Stream[Int] =
  s.head #:: sieve(s.tail filter (_ % s.head != 0));System.out.println("""sieve: (s: Stream[Int])Stream[Int]""");$skip(32); 
   
val primes = sieve(from(2));System.out.println("""primes  : Stream[Int] = """ + $show(primes ));$skip(26); val res$1 = 


primes.take(100).toList;System.out.println("""res1: List[Int] = """ + $show(res$1));$skip(202); 
   
   def sqrtStream(x:Double): Stream[Double] = {
       def improve(guess: Double) = ( guess + x / guess) /2
       lazy val guesses: Stream[Double] = 1 #:: (guesses map improve)
       guesses
   };System.out.println("""sqrtStream: (x: Double)Stream[Double]""");$skip(99); 
   
   def isGoodEnough(guess: Double, x: Double) =
   	math.abs((guess * guess - x) / x) < 0.0001;System.out.println("""isGoodEnough: (guess: Double, x: Double)Boolean""");$skip(41); val res$2 = 
   
   
   sqrtStream(4).take(10).toList;System.out.println("""res2: List[Double] = """ + $show(res$2));$skip(63); val res$3 = 
   
   sqrtStream(4).filter(isGoodEnough(_,4)).take(10).toList;System.out.println("""res3: List[Double] = """ + $show(res$3))}
}
