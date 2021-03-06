package week3

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