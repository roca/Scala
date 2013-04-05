package week2

object rationals {
  val x = new Rational(1,3)                       //> x  : week2.Rational = 1/3
  
  x.numer                                         //> res0: Int = 1
  x.denom                                         //> res1: Int = 3
  
  val y = new Rational(5,7)                       //> y  : week2.Rational = 5/7
  
  val z = new Rational(3,2)                       //> z  : week2.Rational = 3/2
  
  x + y                                           //> res2: week2.Rational = 22/21
  x - y - z                                       //> res3: week2.Rational = -79/42
  y + y                                           //> res4: week2.Rational = 10/7
  x < y                                           //> res5: Boolean = true
  x max y                                         //> res6: week2.Rational = 5/7
  x min y                                         //> res7: week2.Rational = 1/3
  
  val t = new Rational(2)                         //> t  : week2.Rational = 2/1
 }

class Rational(x:Int, y:Int) {
    require( y != 0 , "denominator must be nonzero")
    private def gcd(a:Int, b:Int): Int = {if (b == 0) a else gcd(b, a % b)}
    private val g = gcd(x,y)
    def numer = x / g
    def denom = y / g
    
    def this(x:Int) = this(x,1)
    
    def < (that: Rational): Boolean = {this.numer * that.denom < that.numer * this.denom}
    
    def max(that: Rational): Rational =  {if (this < that) that else this}

    def min(that: Rational): Rational =  {if (this < that) this else that}
    
    def + (that: Rational) : Rational = {
      new Rational(this.numer * that.denom + that.numer * this.denom, this.denom * that.denom)
    }
    
    override def toString(): String = {
     this.numer  + "/" + this.denom
    }
    
    def unary_- : Rational = {
      new Rational(-this.numer,this.denom)
    }
    
    def - (that: Rational): Rational = {
      //new Rational(this.numer * that.denom - that.numer * this.denom, this.denom * that.denom)
      this + -that
    }
 }