package com.agiledeveloper.lab

object CreatureTest extends org.scalatest.Suite with org.scalatest.BeforeAndAfterEach {
  def testCreatureColor = {
    assert("Blue" === Creature("Blue").color)
  }

  def testAnotherCreatureColor = {
    assert("Purple" === new Creature("Purple").color)
  }

  def testNumberOfCreatures = {
    Creature.count = 0

    Creature("Red")
    assert(1 === Creature.count)
    new Creature("Red")
    assert(2 === Creature.count)
    Creature("Green")
    assert(3 === Creature.count)
  }

  def main(args : Array[String]) = CreatureTest.execute()
}

//Make count accessible only from within the lab package.
