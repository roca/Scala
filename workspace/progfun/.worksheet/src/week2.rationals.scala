package week2

object rationals {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(61); 
  val x = new Rational(1,3);System.out.println("""x  : week2.Rational = """ + $show(x ));$skip(13); val res$0 = 
  
  x.numer;System.out.println("""res0: Int = """ + $show(res$0));$skip(10); val res$1 = 
  x.denom;System.out.println("""res1: Int = """ + $show(res$1));$skip(31); 
  
  val y = new Rational(5,7);System.out.println("""y  : week2.Rational = """ + $show(y ));$skip(31); 
  
  val z = new Rational(3,2);System.out.println("""z  : week2.Rational = """ + $show(z ));$skip(11); val res$2 = 
  
  x + y;System.out.println("""res2: week2.Rational = """ + $show(res$2));$skip(12); val res$3 = 
  x - y - z;System.out.println("""res3: week2.Rational = """ + $show(res$3));$skip(8); val res$4 = 
  y + y;System.out.println("""res4: week2.Rational = """ + $show(res$4));$skip(8); val res$5 = 
  x < y;System.out.println("""res5: Boolean = """ + $show(res$5));$skip(10); val res$6 = 
  x max y;System.out.println("""res6: week2.Rational = """ + $show(res$6));$skip(10); val res$7 = 
  x min y;System.out.println("""res7: week2.Rational = """ + $show(res$7));$skip(29); 
  
  val t = new Rational(2);System.out.println("""t  : week2.Rational = """ + $show(t ))}
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
