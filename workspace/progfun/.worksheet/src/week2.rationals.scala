package week2

object rationals {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(61); 
  val x = new Rational(1,3);System.out.println("""x  : week2.Rational = """ + $show(x ));$skip(13); val res$0 = 
  
  x.numer;System.out.println("""res0: Int = """ + $show(res$0));$skip(10); val res$1 = 
  x.denom;System.out.println("""res1: Int = """ + $show(res$1));$skip(31); 
  
  val y = new Rational(5,7);System.out.println("""y  : week2.Rational = """ + $show(y ));$skip(31); 
  
  val z = new Rational(3,2);System.out.println("""z  : week2.Rational = """ + $show(z ));$skip(14); val res$2 = 
  
  x.add(y);System.out.println("""res2: week2.Rational = """ + $show(res$2));$skip(18); val res$3 = 
  x.sub(y).sub(z);System.out.println("""res3: week2.Rational = """ + $show(res$3))}
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
