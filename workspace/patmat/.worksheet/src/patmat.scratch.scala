package patmat


object scratch {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(77); 
  println("Welcome to the Scala worksheet");$skip(60); 
  val list = Huffman.times(List('a', 'b', 'a','c','c','c'));System.out.println("""list  : List[(Char, Int)] = """ + $show(list ));$skip(44); 
  val m = Huffman.makeOrderedLeafList(list);System.out.println("""m  : List[patmat.Huffman.Leaf] = """ + $show(m ))}
}
