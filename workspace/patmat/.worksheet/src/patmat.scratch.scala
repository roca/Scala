package patmat

import Huffman._


object scratch {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(95); 
  println("Welcome to the Scala worksheet");$skip(52); 
  val list = times(List('a', 'b', 'a','c','c','c'));System.out.println("""list  : List[(Char, Int)] = """ + $show(list ));$skip(36); 
  val m = makeOrderedLeafList(list);System.out.println("""m  : List[patmat.Huffman.Leaf] = """ + $show(m ));$skip(97); 
  
  val sampleTree = makeCodeTree(
  makeCodeTree(Leaf('x', 1), Leaf('e', 1)),
  Leaf('t', 2)
);System.out.println("""sampleTree  : patmat.Huffman.CodeTree = """ + $show(sampleTree ));$skip(70); 
      
 val leaflist = List(Leaf('e', 1), Leaf('t', 2), Leaf('x', 4));System.out.println("""leaflist  : List[patmat.Huffman.Leaf] = """ + $show(leaflist ));$skip(27); 
 val c = combine(leaflist);System.out.println("""c  : List[patmat.Huffman.CodeTree] = """ + $show(c ));$skip(76); val res$0 = 
                           
                                 
 
 combine(c);System.out.println("""res0: List[patmat.Huffman.CodeTree] = """ + $show(res$0));$skip(80); val res$1 = 
 
    
makeCodeTree(Fork(Leaf('e',1),Leaf('t',2),List('e', 't'),3),Leaf('x',4));System.out.println("""res1: patmat.Huffman.CodeTree = """ + $show(res$1));$skip(41); val res$2 = 
 
 
 until(singleton, combine)(leaflist);System.out.println("""res2: List[patmat.Huffman.CodeTree] = """ + $show(res$2));$skip(51); val res$3 = 
   createCodeTree(List('a', 'b', 'a','c','c','c'));System.out.println("""res3: patmat.Huffman.CodeTree = """ + $show(res$3))}
}
