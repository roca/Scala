package patmat

import Huffman._
import scala.io._
import Stopwatch._
import sys.process._

object scratch {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(152); 
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

encode(frenchCode) (decodedSecret)  == secret;System.out.println("""res6: Boolean = """ + $show(res$6));$skip(16); val res$7 = 
 
 
 frenchCode;System.out.println("""res7: patmat.Huffman.CodeTree = """ + $show(res$7));$skip(57); 
 
 val table = createCodeTable(frenchCode,decodedSecret);System.out.println("""table  : patmat.Huffman.CodeTable = """ + $show(table ));$skip(23); val res$8 = 
  
convert(frenchCode);System.out.println("""res8: patmat.Huffman.CodeTable = """ + $show(res$8));$skip(22); val res$9 = 

convert2(frenchCode);System.out.println("""res9: patmat.Huffman.CodeTable = """ + $show(res$9));$skip(42); val res$10 = 




 
 codeBits(convert(frenchCode))('h');System.out.println("""res10: List[patmat.Huffman.Bit] = """ + $show(res$10));$skip(37); val res$11 = 
 codeBits(convert2(frenchCode))('h');System.out.println("""res11: List[patmat.Huffman.Bit] = """ + $show(res$11));$skip(28); val res$12 = 
 
 getBits('h', frenchCode);System.out.println("""res12: List[patmat.Huffman.Bit] = """ + $show(res$12));$skip(42); val res$13 = 
 
 quickEncode(frenchCode)(decodedSecret);System.out.println("""res13: List[patmat.Huffman.Bit] = """ + $show(res$13));$skip(81); val res$14 = 
 
 quickEncode(frenchCode)(decodedSecret)  == encode(frenchCode) (decodedSecret);System.out.println("""res14: Boolean = """ + $show(res$14));$skip(84); val res$15 = 

 mergeCodeTables(convert(frenchCode), convert(frenchCode)) == convert2(frenchCode);System.out.println("""res15: Boolean = """ + $show(res$15));$skip(95); val res$16 = 
                                                  
convert2(frenchCode) == convert(frenchCode);System.out.println("""res16: Boolean = """ + $show(res$16))}

/*
val vimLocation: String = "pwd".!!


def getCurrentDirectory = new java.io.File( "." ).getAbsolutePath
         
getCurrentDirectory

val s = Source.fromFile("/Users/romel.campbell/Scala/workspace/patmat/src/main/scala/patmat/Huffman.scala")
 var cl: List[Char] = List()

 s.getLines.foreach( (line) => {
    cl = string2Chars(line) ::: cl
 })

val treeCode = createCodeTree(cl)
   
 val quickEncode_sw = time("quickEncode elapsed time") {
   quickEncode(treeCode)(cl)
  }
  
  
  
  
  val encode_sw = time("quickEncode elapsed time") {
   encode(treeCode)(cl)
  }
  
   
   
  quickEncode(treeCode)(cl)
                                                  */
}
