import patmat.Huffman._


object scratch {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(86); 
  println("Welcome to the Scala worksheet");$skip(52); 
  val list = times(List('a', 'b', 'a','c','c','c'));System.out.println("""list  : List[(Char, Int)] = """ + $show(list ));$skip(36); 
  val m = makeOrderedLeafList(list);System.out.println("""m  : List[patmat.Huffman.Leaf] = """ + $show(m ));$skip(97); 
  
  val sampleTree = makeCodeTree(
  makeCodeTree(Leaf('x', 1), Leaf('e', 1)),
  Leaf('t', 2)
);System.out.println("""sampleTree  : patmat.Huffman.Fork = """ + $show(sampleTree ))}
}
