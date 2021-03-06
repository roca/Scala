package week2

import week3.Rational

object rationals {
  val x = new Rational(1,3)                       //> x  : week3.Rational = 1/3
  
  x.numer                                         //> res0: Int = 1
  x.denom                                         //> res1: Int = 3
  
  val y = new Rational(5,7)                       //> y  : week3.Rational = 5/7
  
  val z = new Rational(3,2)                       //> z  : week3.Rational = 3/2
  
  x + y                                           //> res2: week3.Rational = 22/21
  x - y - z                                       //> res3: week3.Rational = -79/42
  y + y                                           //> res4: week3.Rational = 10/7
  x < y                                           //> res5: Boolean = true
  x max y                                         //> res6: week3.Rational = 5/7
  x min y                                         //> res7: week3.Rational = 1/3
  
  val t = new Rational(2)                         //> t  : week3.Rational = 2/1
 


 }