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
 val c = combine(leaflist);System.out.println("""c  : List[patmat.Huffman.CodeTree] = """ + $show(c ));$skip(110); val res$0 = 
                           
                                 
                                 
 
 combine(c);System.out.println("""res0: List[patmat.Huffman.CodeTree] = """ + $show(res$0));$skip(80); val res$1 = 
 
    
makeCodeTree(Fork(Leaf('e',1),Leaf('t',2),List('e', 't'),3),Leaf('x',4));System.out.println("""res1: patmat.Huffman.CodeTree = """ + $show(res$1));$skip(39); val res$2 = 
 
 until(singleton, combine)(leaflist);System.out.println("""res2: List[patmat.Huffman.CodeTree] = """ + $show(res$2));$skip(49); val res$3 = 
 createCodeTree(List('a', 'b', 'a','c','c','c'));System.out.println("""res3: patmat.Huffman.CodeTree = """ + $show(res$3));$skip(63); 
   
 val t1 = Fork(Leaf('a',2), Leaf('b',3), List('a','b'), 5);System.out.println("""t1  : patmat.Huffman.Fork = """ + $show(t1 ));$skip(23); val res$4 = 
decode(t1,List(0,1,1));System.out.println("""res4: List[Char] = """ + $show(res$4));$skip(16); val res$5 = 
 
decodedSecret;System.out.println("""res5: List[Char] = """ + $show(res$5));$skip(47); val res$6 = 

encode(frenchCode) (decodedSecret)  == secret;System.out.println("""res6: Boolean = """ + $show(res$6));$skip(59); 
 
 
 val table = createCodeTable(frenchCode,decodedSecret);System.out.println("""table  : patmat.Huffman.CodeTable = """ + $show(table ));$skip(23); val res$7 = 
  
convert(frenchCode);System.out.println("""res7: patmat.Huffman.CodeTable = """ + $show(res$7));$skip(38); val res$8 = 
 
 codeBits(convert(frenchCode))('h');System.out.println("""res8: List[patmat.Huffman.Bit] = """ + $show(res$8));$skip(28); val res$9 = 
 
 getBits('h', frenchCode);System.out.println("""res9: List[patmat.Huffman.Bit] = """ + $show(res$9));$skip(81); val res$10 = 
 
 quickEncode(frenchCode)(decodedSecret)  == encode(frenchCode) (decodedSecret);System.out.println("""res10: Boolean = """ + $show(res$10))}
}
