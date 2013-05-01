
import forcomp.Anagrams._

object test {


 val w = "badca"                                  //> w  : String = badca
  val x = w.sortBy( x => x)                       //> x  : String = aabcd
  val ls = w groupBy(c => c) toList               //> ls  : List[(Char, String)] = List((b,b), (d,d), (a,aa), (c,c))
  
  ls map {case (x,y) => (x,y.length)}             //> res0: List[(Char, Int)] = List((b,1), (d,1), (a,2), (c,1))

  
  wordOccurrences(w)                              //> res1: forcomp.Anagrams.Occurrences = List((a,2), (b,1), (c,1), (d,1))
  
  wordOccurrences("abcd") == List(('a', 1), ('b', 1), ('c', 1), ('d', 1))
                                                  //> res2: Boolean = true
   wordOccurrences("Robert") == List(('b', 1), ('e', 1), ('o', 1), ('r', 2), ('t', 1))
                                                  //> res3: Boolean = true
  val zs = List("AA","BB","CC")                   //> zs  : List[String] = List(AA, BB, CC)
  zs.foldRight("")((x,y) => x + y)                //> res4: String = AABBCC
  
  "A" + "B"                                       //> res5: String("AB") = AB
  
  val y =  dictionary.map( x => (wordOccurrences(x),x))
                                                  //> y  : List[(forcomp.Anagrams.Occurrences, forcomp.Anagrams.Word)] = List((Lis
                                                  //| t((a,2), (h,1), (r,1), (s,1), (u,1)),Aarhus), (List((a,2), (n,1), (o,1), (r,
                                                  //| 1)),Aaron), (List((a,3), (b,2)),Ababa), (List((a,2), (b,1), (c,1), (k,1)),ab
                                                  //| ack), (List((a,2), (b,1), (f,1), (t,1)),abaft), (List((a,2), (b,1), (d,1), (
                                                  //| n,2), (o,1)),abandon), (List((a,2), (b,1), (d,2), (e,1), (n,2), (o,1)),aband
                                                  //| oned), (List((a,2), (b,1), (d,1), (g,1), (i,1), (n,3), (o,1)),abandoning), (
                                                  //| List((a,2), (b,1), (d,1), (e,1), (m,1), (n,3), (o,1), (t,1)),abandonment), (
                                                  //| List((a,2), (b,1), (d,1), (n,2), (o,1), (s,1)),abandons), (List((a,2), (b,1)
                                                  //| , (e,1), (s,1)),abase), (List((a,2), (b,1), (d,1), (e,1), (s,1)),abased), (L
                                                  //| ist((a,2), (b,1), (e,2), (m,1), (n,1), (s,1), (t,1)),abasement), (List((a,2)
                                                  //| , (b,1), (e,2), (m,1), (n,1), (s,2), (t,1)),abasements), (List((a,2), (b,1),
                                                  //|  (e,1), (s,2)),abases), (List((a,2), (b,1), (h,1), (s,1)),abash), (List((a,2
                                                  //| ), (b,1), (d,1), (e,1), 
                                                  //| Output exceeds cutoff limit.
 val z = y.groupBy( (x) => x._1)                  //> z  : scala.collection.immutable.Map[forcomp.Anagrams.Occurrences,List[(forco
                                                  //| mp.Anagrams.Occurrences, forcomp.Anagrams.Word)]] = Map(List((e,1), (i,1), (
                                                  //| l,1), (r,1), (t,2)) -> List((List((e,1), (i,1), (l,1), (r,1), (t,2)),litter)
                                                  //| ), List((a,1), (d,1), (e,1), (g,2), (l,1), (r,1)) -> List((List((a,1), (d,1)
                                                  //| , (e,1), (g,2), (l,1), (r,1)),gargled)), List((a,1), (e,1), (h,1), (i,1), (k
                                                  //| ,1), (n,1), (s,3)) -> List((List((a,1), (e,1), (h,1), (i,1), (k,1), (n,1), (
                                                  //| s,3)),shakiness)), List((e,2), (g,1), (n,1)) -> List((List((e,2), (g,1), (n,
                                                  //| 1)),gene)), List((a,2), (n,1), (t,1), (y,1)) -> List((List((a,2), (n,1), (t,
                                                  //| 1), (y,1)),Tanya)), List((a,1), (d,1), (e,2), (h,1), (m,1), (n,2), (o,1), (s
                                                  //| ,3)) -> List((List((a,1), (d,1), (e,2), (h,1), (m,1), (n,2), (o,1), (s,3)),h
                                                  //| andsomeness)), List((a,2), (c,1), (e,2), (k,1), (l,1), (m,1), (p,1), (r,1), 
                                                  //| (t,1)) -> List((List((a,2), (c,1), (e,2), (k,1), (l,1), (m,1), (p,1), (r,1),
                                                  //|  (t,1)),marketplace)), L
                                                  //| Output exceeds cutoff limit.
   val t = z.map{ case (x,y) => (x,y.map(x => x._2) )}
                                                  //> t  : scala.collection.immutable.Map[forcomp.Anagrams.Occurrences,List[forcom
                                                  //| p.Anagrams.Word]] = Map(List((e,1), (i,1), (l,1), (r,1), (t,2)) -> List(litt
                                                  //| er), List((a,1), (d,1), (e,1), (g,2), (l,1), (r,1)) -> List(gargled), List((
                                                  //| a,1), (e,1), (h,1), (i,1), (k,1), (n,1), (s,3)) -> List(shakiness), List((e,
                                                  //| 2), (g,1), (n,1)) -> List(gene), List((a,2), (n,1), (t,1), (y,1)) -> List(Ta
                                                  //| nya), List((a,1), (d,1), (e,2), (h,1), (m,1), (n,2), (o,1), (s,3)) -> List(h
                                                  //| andsomeness), List((a,2), (c,1), (e,2), (k,1), (l,1), (m,1), (p,1), (r,1), (
                                                  //| t,1)) -> List(marketplace), List((a,1), (i,1), (l,2), (s,1), (v,1)) -> List(
                                                  //| villas), List((d,2), (e,1), (h,2), (n,1), (r,1), (t,1), (u,1)) -> List(hundr
                                                  //| edth), List((a,3), (b,1), (c,1), (h,1), (i,2), (l,1), (o,1), (p,2), (r,1), (
                                                  //| t,1), (y,1)) -> List(approachability), List((d,1), (e,2), (l,1), (s,1), (t,2
                                                  //| )) -> List(settled), List((a,1), (g,1), (i,3), (l,1), (n,2), (t,1), (z,1)) -
                                                  //| > List(Latinizing), List
                                                  //| Output exceeds cutoff limit.
   t.filter(  (X) => (X._2.length > 3)  )         //> res6: scala.collection.immutable.Map[forcomp.Anagrams.Occurrences,List[forco
                                                  //| mp.Anagrams.Word]] = Map(List((a,1), (b,1), (e,1), (l,1), (m,1), (r,1)) -> L
                                                  //| ist(ambler, blamer, marble, ramble), List((a,1), (e,1), (h,1), (r,1)) -> Lis
                                                  //| t(hare, hear, Hera, Rhea), List((e,1), (l,1), (r,1), (s,1), (t,1), (u,1)) ->
                                                  //|  List(luster, result, rustle, Ulster), List((a,1), (d,1), (e,2), (r,2)) -> L
                                                  //| ist(dearer, reader, reared, reread), List((e,1), (i,1), (n,1), (r,1), (s,1))
                                                  //|  -> List(reins, resin, rinse, risen, siren), List((e,1), (i,1), (l,1), (s,1)
                                                  //| , (v,1)) -> List(Elvis, evils, Levis, lives, veils), List((a,1), (e,1), (l,1
                                                  //| ), (r,1), (s,1)) -> List(earls, Lares, laser, reals), List((c,1), (e,1), (o,
                                                  //| 1), (p,1), (s,1)) -> List(copes, copse, Pecos, scope), List((a,1), (b,1), (d
                                                  //| ,1), (e,1), (r,1)) -> List(bared, beard, bread, debar, Debra), List((a,1), (
                                                  //| c,1), (e,1), (r,1), (t,1)) -> List(caret, cater, crate, react, recta, trace)
                                                  //| , List((a,1), (e,1), (m,
                                                  //| Output exceeds cutoff limit.
dictionaryByOccurrences.get(List(('a', 1), ('e', 1), ('t', 1))).map(_.toSet)
                                                  //> res7: Option[scala.collection.immutable.Set[forcomp.Anagrams.Word]] = Some(S
                                                  //| et(ate, eat, tea))
}