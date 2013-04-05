package week2

object rationals {
  val x = new Rational(1,3)                       //> x  : week2.Rational = 1/3
  
  x.numer                                         //> res0: Int = 1
  x.denom                                         //> res1: Int = 3
  
  val y = new Rational(5,7)                       //> y  : week2.Rational = 5/7
  
  val z = new Rational(3,2)                       //> z  : week2.Rational = 3/2
  
  x.add(y)                                        //> res2: week2.Rational = 22/21
  x.sub(y).sub(z)                                 //> res3: week2.Rational = -79/42
}

class Rational(x:Int, y:Int) {
    def numer = x
    def denom = y
    
    def add(r: Rational) : Rational = {
      new Rational(numer * r.denom + r.numer * denom, denom * r.denom)
    }
    
    override def toString(): String = {
     numer  + "/" + denom
    }
    
    def neg() : Rational = {
      new Rational(-numer,denom)
    }
    
    def sub(r: Rational): Rational = {
      //new Rational(numer * r.denom - r.numer * denom, denom * r.denom)
      add(r.neg)
    }
 }