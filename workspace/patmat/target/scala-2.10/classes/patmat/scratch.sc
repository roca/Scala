package patmat

import Huffman._
import scala.io._
import Stopwatch._
import sys.process._

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
 
 
 frenchCode                                       //> res7: patmat.Huffman.CodeTree = Fork(Fork(Fork(Leaf(s,121895),Fork(Leaf(d,56
                                                  //| 269),Fork(Fork(Fork(Leaf(x,5928),Leaf(j,8351),List(x, j),14279),Leaf(f,16351
                                                  //| ),List(x, j, f),30630),Fork(Fork(Fork(Fork(Leaf(z,2093),Fork(Leaf(k,745),Lea
                                                  //| f(w,1747),List(k, w),2492),List(z, k, w),4585),Leaf(y,4725),List(z, k, w, y)
                                                  //| ,9310),Leaf(h,11298),List(z, k, w, y, h),20608),Leaf(q,20889),List(z, k, w, 
                                                  //| y, h, q),41497),List(x, j, f, z, k, w, y, h, q),72127),List(d, x, j, f, z, k
                                                  //| , w, y, h, q),128396),List(s, d, x, j, f, z, k, w, y, h, q),250291),Fork(For
                                                  //| k(Leaf(o,82762),Leaf(l,83668),List(o, l),166430),Fork(Fork(Leaf(m,45521),Lea
                                                  //| f(p,46335),List(m, p),91856),Leaf(u,96785),List(m, p, u),188641),List(o, l, 
                                                  //| m, p, u),355071),List(s, d, x, j, f, z, k, w, y, h, q, o, l, m, p, u),605362
                                                  //| ),Fork(Fork(Fork(Leaf(r,100500),Fork(Leaf(c,50003),Fork(Leaf(v,24975),Fork(L
                                                  //| eaf(g,13288),Leaf(b,13822),List(g, b),27110),List(v, g, b),52085),List(c, v,
                                                  //|  g, b),102088),List(r, c
                                                  //| Output exceeds cutoff limit.
 
 val table = createCodeTable(frenchCode,decodedSecret)
                                                  //> table  : patmat.Huffman.CodeTable = List((l,List(0, 1, 0, 1)), (o,List(0, 1,
                                                  //|  0, 0)), (c,List(1, 0, 0, 1, 0)), (t,List(1, 0, 1, 1)), (s,List(0, 0, 0)), (
                                                  //| e,List(1, 1, 0)), (n,List(1, 0, 1, 0)), (a,List(1, 1, 1, 1)), (m,List(0, 1, 
                                                  //| 1, 0, 0)), (f,List(0, 0, 1, 1, 0, 1)), (u,List(0, 1, 1, 1)), (h,List(0, 0, 1
                                                  //| , 1, 1, 0, 1)))
  
convert(frenchCode)                               //> res8: patmat.Huffman.CodeTable = List((a,List(1, 1, 1, 1)), (i,List(1, 1, 1,
                                                  //|  0)), (e,List(1, 1, 0)), (t,List(1, 0, 1, 1)), (n,List(1, 0, 1, 0)), (b,List
                                                  //| (1, 0, 0, 1, 1, 1, 1)), (g,List(1, 0, 0, 1, 1, 1, 0)), (v,List(1, 0, 0, 1, 1
                                                  //| , 0)), (c,List(1, 0, 0, 1, 0)), (r,List(1, 0, 0, 0)), (u,List(0, 1, 1, 1)), 
                                                  //| (p,List(0, 1, 1, 0, 1)), (m,List(0, 1, 1, 0, 0)), (l,List(0, 1, 0, 1)), (o,L
                                                  //| ist(0, 1, 0, 0)), (q,List(0, 0, 1, 1, 1, 1)), (h,List(0, 0, 1, 1, 1, 0, 1)),
                                                  //|  (y,List(0, 0, 1, 1, 1, 0, 0, 1)), (w,List(0, 0, 1, 1, 1, 0, 0, 0, 1, 1)), (
                                                  //| k,List(0, 0, 1, 1, 1, 0, 0, 0, 1, 0)), (z,List(0, 0, 1, 1, 1, 0, 0, 0, 0)), 
                                                  //| (f,List(0, 0, 1, 1, 0, 1)), (j,List(0, 0, 1, 1, 0, 0, 1)), (x,List(0, 0, 1, 
                                                  //| 1, 0, 0, 0)), (d,List(0, 0, 1, 0)), (s,List(0, 0, 0)))

convert2(frenchCode)                              //> res9: patmat.Huffman.CodeTable = List((a,List(1, 1, 1, 1)), (i,List(1, 1, 1,
                                                  //|  0)), (e,List(1, 1, 0)), (t,List(1, 0, 1, 1)), (n,List(1, 0, 1, 0)), (b,List
                                                  //| (1, 0, 0, 1, 1, 1, 1)), (g,List(1, 0, 0, 1, 1, 1, 0)), (v,List(1, 0, 0, 1, 1
                                                  //| , 0)), (c,List(1, 0, 0, 1, 0)), (r,List(1, 0, 0, 0)), (u,List(0, 1, 1, 1)), 
                                                  //| (p,List(0, 1, 1, 0, 1)), (m,List(0, 1, 1, 0, 0)), (l,List(0, 1, 0, 1)), (o,L
                                                  //| ist(0, 1, 0, 0)), (q,List(0, 0, 1, 1, 1, 1)), (h,List(0, 0, 1, 1, 1, 0, 1)),
                                                  //|  (y,List(0, 0, 1, 1, 1, 0, 0, 1)), (w,List(0, 0, 1, 1, 1, 0, 0, 0, 1, 1)), (
                                                  //| k,List(0, 0, 1, 1, 1, 0, 0, 0, 1, 0)), (z,List(0, 0, 1, 1, 1, 0, 0, 0, 0)), 
                                                  //| (f,List(0, 0, 1, 1, 0, 1)), (j,List(0, 0, 1, 1, 0, 0, 1)), (x,List(0, 0, 1, 
                                                  //| 1, 0, 0, 0)), (d,List(0, 0, 1, 0)), (s,List(0, 0, 0)))




 
 codeBits(convert(frenchCode))('h')               //> res10: List[patmat.Huffman.Bit] = List(0, 0, 1, 1, 1, 0, 1)
 codeBits(convert2(frenchCode))('h')              //> res11: List[patmat.Huffman.Bit] = List(0, 0, 1, 1, 1, 0, 1)
 
 getBits('h', frenchCode)                         //> res12: List[patmat.Huffman.Bit] = List(0, 0, 1, 1, 1, 0, 1)
 
 quickEncode(frenchCode)(decodedSecret)           //> res13: List[patmat.Huffman.Bit] = List(0, 0, 1, 1, 1, 0, 1, 0, 1, 1, 1, 0, 
                                                  //| 0, 1, 1, 0, 1, 0, 0, 1, 1, 0, 1, 0, 1, 1, 0, 0, 1, 1, 1, 1, 1, 0, 1, 0, 1, 
                                                  //| 1, 0, 0, 0, 0, 1, 0, 1, 1, 1, 0, 0, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 1, 0, 
                                                  //| 1)
 
 quickEncode(frenchCode)(decodedSecret)  == encode(frenchCode) (decodedSecret)
                                                  //> res14: Boolean = true

 mergeCodeTables(convert(frenchCode), convert(frenchCode)) == convert2(frenchCode)
                                                  //> res15: Boolean = true
                                                  
convert2(frenchCode) == convert(frenchCode)       //> res16: Boolean = true


}