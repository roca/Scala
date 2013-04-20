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
   createCodeTree(List('a', 'b', 'a','c','c','c'))//> res3: patmat.Huffman.CodeTree = Fork(Fork(Leaf(b,1),Leaf(a,2),List(b, a),3),
                                                  //| Leaf(c,3),List(b, a, c),6)
}