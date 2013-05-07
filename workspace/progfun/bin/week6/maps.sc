package week6

object maps {
val romanNumerals = Map("I" -> 1, "V" -> 5, "X" -> 10)
                                                  //> romanNumerals  : scala.collection.immutable.Map[String,Int] = Map(I -> 1, V -
                                                  //| > 5, X -> 10)
val capitalOfCountry = Map("US" -> "Washington", "Switzerland" -> "Bern")
                                                  //> capitalOfCountry  : scala.collection.immutable.Map[String,String] = Map(US -
                                                  //| > Washington, Switzerland -> Bern)

val countryOfCapital = capitalOfCountry map {
case(x, y) => (y, x)
}                                                 //> countryOfCapital  : scala.collection.immutable.Map[String,String] = Map(Wash
                                                  //| ington -> US, Bern -> Switzerland)

}