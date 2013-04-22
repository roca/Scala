package patmat

import Huffman._


object scratch {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  val list = times(List('a', 'b', 'a','c','c','c'))
                                                  //> list  : List[(Char, Int)] = List((a,2), (b,1), (c,3))
  val m = makeOrderedLeafList(list)               //> m  : List[patmat.Huffman.Leaf] = List(Leaf(b,1), Leaf(a,2), Leaf(c,3))
  
  val sampleTree = makeCodeTree(
  makeCodeTree(Leaf('x', 1), Leaf('e', 1)),
  Leaf('t', 2)
)                                                 //> sampleTree  : patmat.Huffman.CodeTree = Fork(Fork(Leaf(x,1),Leaf(e,1),List(x
                                                  //| , e),2),Leaf(t,2),List(x, e, t),4)
      
 val leaflist = List(Leaf('e', 1), Leaf('t', 2), Leaf('x', 4))
                                                  //> leaflist  : List[patmat.Huffman.Leaf] = List(Leaf(e,1), Leaf(t,2), Leaf(x,4)
                                                  //| )
 val c = combine(leaflist)                        //> c  : List[patmat.Huffman.CodeTree] = List(Fork(Leaf(e,1),Leaf(t,2),List(e, t
                                                  //| ),3), Leaf(x,4))
                           
                                 
 
 combine(c)                                       //> res0: List[patmat.Huffman.CodeTree] = List(Fork(Fork(Leaf(e,1),Leaf(t,2),Lis
                                                  //| t(e, t),3),Leaf(x,4),List(e, t, x),7))
 
    
makeCodeTree(Fork(Leaf('e',1),Leaf('t',2),List('e', 't'),3),Leaf('x',4))
                                                  //> res1: patmat.Huffman.CodeTree = Fork(Fork(Leaf(e,1),Leaf(t,2),List(e, t),3),
                                                  //| Leaf(x,4),List(e, t, x),7)
 
 until(singleton, combine)(leaflist)              //> res2: List[patmat.Huffman.CodeTree] = List(Fork(Fork(Leaf(e,1),Leaf(t,2),Lis
                                                  //| t(e, t),3),Leaf(x,4),List(e, t, x),7))
 createCodeTree(List('a', 'b', 'a','c','c','c'))  //> res3: patmat.Huffman.CodeTree = Fork(Fork(Leaf(b,1),Leaf(a,2),List(b, a),3),
                                                  //| Leaf(c,3),List(b, a, c),6)
   
 val t1 = Fork(Leaf('a',2), Leaf('b',3), List('a','b'), 5)
                                                  //> t1  : patmat.Huffman.Fork = Fork(Leaf(a,2),Leaf(b,3),List(a, b),5)
decode(t1,List(0,1,1))                            //> res4: List[Char] = List(a, b, b)
 
decodedSecret                                     //> res5: List[Char] = List(h, u, f, f, m, a, n, e, s, t, c, o, o, l)

encode(frenchCode) (decodedSecret)  == secret     //> res6: Boolean = true
 
 
 val table = createCodeTable(frenchCode,decodedSecret)
                                                  //> table  : patmat.Huffman.CodeTable = List((l,List(0, 1, 0, 1)), (o,List(0, 1,
                                                  //|  0, 0)), (c,List(1, 0, 0, 1, 0)), (t,List(1, 0, 1, 1)), (s,List(0, 0, 0)), (
                                                  //| e,List(1, 1, 0)), (n,List(1, 0, 1, 0)), (a,List(1, 1, 1, 1)), (m,List(0, 1, 
                                                  //| 1, 0, 0)), (f,List(0, 0, 1, 1, 0, 1)), (u,List(0, 1, 1, 1)), (h,List(0, 0, 1
                                                  //| , 1, 1, 0, 1)))
  
convert(frenchCode)                               //> res7: patmat.Huffman.CodeTable = List((a,List(1, 1, 1, 1)), (i,List(1, 1, 1,
                                                  //|  0)), (e,List(1, 1, 0)), (t,List(1, 0, 1, 1)), (n,List(1, 0, 1, 0)), (b,List
                                                  //| (1, 0, 0, 1, 1, 1, 1)), (g,List(1, 0, 0, 1, 1, 1, 0)), (v,List(1, 0, 0, 1, 1
                                                  //| , 0)), (c,List(1, 0, 0, 1, 0)), (r,List(1, 0, 0, 0)), (u,List(0, 1, 1, 1)), 
                                                  //| (p,List(0, 1, 1, 0, 1)), (m,List(0, 1, 1, 0, 0)), (l,List(0, 1, 0, 1)), (o,L
                                                  //| ist(0, 1, 0, 0)), (q,List(0, 0, 1, 1, 1, 1)), (h,List(0, 0, 1, 1, 1, 0, 1)),
                                                  //|  (y,List(0, 0, 1, 1, 1, 0, 0, 1)), (w,List(0, 0, 1, 1, 1, 0, 0, 0, 1, 1)), (
                                                  //| k,List(0, 0, 1, 1, 1, 0, 0, 0, 1, 0)), (z,List(0, 0, 1, 1, 1, 0, 0, 0, 0)), 
                                                  //| (f,List(0, 0, 1, 1, 0, 1)), (j,List(0, 0, 1, 1, 0, 0, 1)), (x,List(0, 0, 1, 
                                                  //| 1, 0, 0, 0)), (d,List(0, 0, 1, 0)), (s,List(0, 0, 0)))
 
 codeBits(convert(frenchCode))('h')               //> res8: List[patmat.Huffman.Bit] = List(0, 0, 1, 1, 1, 0, 1)
 
 getBits('h', frenchCode)                         //> res9: List[patmat.Huffman.Bit] = List(0, 0, 1, 1, 1, 0, 1)
 
 
 quickEncode(frenchCode)(decodedSecret)  == encode(frenchCode) (decodedSecret)
                                                  //> res10: Boolean = true
}