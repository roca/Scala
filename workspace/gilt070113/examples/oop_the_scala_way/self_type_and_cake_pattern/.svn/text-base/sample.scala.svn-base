trait Helper {
  def helpout()
}

trait Environment {
  val helper : Helper
}

trait Ranger {
  this: Environment =>
  def doWork() = {
    println("working...")
    helper.helpout()
    println("done working...")
  }
}

class Human extends Helper {
  def helpout = println("help the ranger...")
}

object VillageRanger extends Ranger with Environment {
  val helper = new Human
}

VillageRanger.doWork()

class Elephant extends Helper {
  def helpout() = println("do the heavy weight lifting")
}

object ForestRanger extends Ranger with Environment {
  val helper = new Elephant
}

ForestRanger.doWork()

