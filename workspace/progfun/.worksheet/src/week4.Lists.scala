package week4

object Lists {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(73); 
  println("Welcome to the Scala worksheet")}
}


def singleton[T](elem: T) = new Cons[T](elem, new Nil[T])

def nth(n:Int,xs:List[T]): T = {
}
