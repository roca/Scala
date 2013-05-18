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

pathsFromStart.take(3).toSet                      //> res0: scala.collection.immutable.Set[(streams.scratch.Block, List[streams.sc
                                                  //| ratch.Move])] = Set((Block(Pos(1,1),Pos(1,1)),List()), (Block(Pos(1,2),Pos(1
                                                  //| ,3)),List(Right)), (Block(Pos(2,1),Pos(3,1)),List(Down)))
}