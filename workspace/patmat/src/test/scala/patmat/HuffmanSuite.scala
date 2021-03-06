package patmat

import org.scalatest.FunSuite

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

import patmat.Huffman._
import Stopwatch._
import scala.io._

@RunWith(classOf[JUnitRunner])
class HuffmanSuite extends FunSuite {
  trait TestTrees {
    val t1 = Fork(Leaf('a',2), Leaf('b',3), List('a','b'), 5)
    val t2 = Fork(Fork(Leaf('a',2), Leaf('b',3), List('a','b'), 5), Leaf('d',4), List('a','b','d'), 9)
  }

  test("weight of a larger tree") {
    new TestTrees {
      assert(weight(t1) === 5)
    }
  }

  test("chars of a larger tree") {
    new TestTrees {
      assert(chars(t2) === List('a','b','d'))
    }
  }

  test("string2chars(\"hello, world\")") {
    assert(string2Chars("hello, world") === List('h', 'e', 'l', 'l', 'o', ',', ' ', 'w', 'o', 'r', 'l', 'd'))
  }

  test("makeOrderedLeafList for some frequency table") {
    assert(makeOrderedLeafList(List(('t', 2), ('e', 1), ('x', 3))) === List(Leaf('e',1), Leaf('t',2), Leaf('x',3)))
  }

  test("combine of some leaf list") {
    val leaflist = List(Leaf('e', 1), Leaf('t', 2), Leaf('x', 4))
    assert(combine(leaflist) === List(Fork(Leaf('e',1),Leaf('t',2),List('e', 't'),3), Leaf('x',4)))
  }

  test("decode and encode a very short text should be identity") {
    new TestTrees {
      assert(decode(t1, encode(t1)("ab".toList)) === "ab".toList)
    }
  }
  
 
  test("quickEncode == encode") {
     assert(encode(frenchCode)(decodedSecret) == quickEncode(frenchCode)(decodedSecret))
    
  }
  
   test("mergeCodeTables should not have duplicates") {
     assert(mergeCodeTables(convert2(frenchCode), convert2(frenchCode)) == convert2(frenchCode))
     assert(mergeCodeTables(convert2(frenchCode), convert2(frenchCode)).length == (convert2(frenchCode) ::: convert2(frenchCode)).length/2)
    
  }
   
 test("encode is slower than quickEncode for large data sets") {
   
	 val file_source = Source.fromFile( "/Users/roca/Scala/workspace/patmat/src/main/scala/patmat/Huffman.scala")
	 val lines = file_source.getLines.toList
	 def charList(ls:List[String],acc:List[Char]): List[Char]={
	   if (ls.isEmpty) acc
	   else charList(ls.tail,string2Chars(ls.head) ::: acc)
	 }
	 val cl = charList(lines,List())
     val treeCode = createCodeTree(cl)
 
			 val quickEncode_sw = time("quickEncode elapsed time") {
		 		quickEncode(treeCode)(cl)
	 		}
	 			println(quickEncode_sw)
    
	 		val encode_sw = time("encode elapsed time") {
	 			encode(treeCode)(cl)
	 			}
	 			println(encode_sw)
    
	 			assert(encode_sw.elapsedTime > quickEncode_sw.elapsedTime)
  }


   
  
  test("encode is faster or equal to quickEncode for small data sets") {
    val quickEncode_sw = time("quickEncode elapsed time") {
      quickEncode(frenchCode)(decodedSecret)
    }
    println(quickEncode_sw)
    
    val encode_sw = time("encode elapsed time") {
      encode(frenchCode)(decodedSecret)
    }
    println(encode_sw)
    
    assert(encode_sw.elapsedTime <= quickEncode_sw.elapsedTime)
  }
  
  
  
}