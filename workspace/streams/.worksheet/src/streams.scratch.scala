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

object scratch extends Level1{;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(360); val res$0 = 

pathsFromStart.take(3).toSet;System.out.println("""res0: scala.collection.immutable.Set[(streams.scratch.Block, List[streams.scratch.Move])] = """ + $show(res$0))}
}
