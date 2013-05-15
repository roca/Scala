package streams

import common._
import streams._

trait Level1 extends GameDef with Solver with StringParserTerrain {
      /* terrain for level 1*/

    val level =
    """ooo-------
      |oSoooo----
      |ooooooooo-
      |-ooooooooo
      |-----ooToo
      |------ooo-""".stripMargin

   
  }

object scratch extends Level1{

terrain(Pos(3,1))                                 //> res0: Boolean = true



val n  = neighborsWithHistory(Block(Pos(1,1),Pos(1,1)), List(Left,Up)).toSet
                                                  //> n  : scala.collection.immutable.Set[(streams.scratch.Block, List[streams.scr
                                                  //| atch.Move])] = Set((Block(Pos(1,2),Pos(1,3)),List(Right, Left, Up)), (Block(
                                                  //| Pos(2,1),Pos(3,1)),List(Down, Left, Up)))
  
 newNeighborsOnly(
  Set(
    (Block(Pos(1,2),Pos(1,3)), List(Right,Left,Up)),
    (Block(Pos(2,1),Pos(3,1)), List(Down,Left,Up))
  ).toStream,

  Set(Block(Pos(1,2),Pos(1,3)), Block(Pos(1,1),Pos(1,1)))
)                                                 //> scala.NotImplementedError: an implementation is missing
                                                  //| 	at scala.Predef$.$qmark$qmark$qmark(Predef.scala:252)
                                                  //| 	at streams.Solver$class.newNeighborsOnly(Solver.scala:43)
                                                  //| 	at streams.scratch$.newNeighborsOnly(streams.scratch.scala:20)
                                                  //| 	at streams.scratch$$anonfun$main$1.apply$mcV$sp(streams.scratch.scala:28
                                                  //| )
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$$anonfun$$exe
                                                  //| cute$1.apply$mcV$sp(WorksheetSupport.scala:76)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$.redirected(W
                                                  //| orksheetSupport.scala:65)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$.$execute(Wor
                                                  //| ksheetSupport.scala:75)
                                                  //| 	at streams.scratch$.main(streams.scratch.scala:20)
                                                  //| 	at streams.scratch.main(streams.scratch.scala)
  
}