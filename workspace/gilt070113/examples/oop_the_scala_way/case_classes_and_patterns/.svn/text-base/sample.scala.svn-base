trait Trade
case class Buy(symbol : String, amount : Int) extends Trade
case class Sell(symbol : String, amount : Int) extends Trade

def process(trade : Trade) = {
  trade match {
    case Buy(symbol, quantity) =>
      println(s"Buy $symbol quantity $quantity")
    
    case Sell(symbol, quantity) =>
      println(s"Sell $symbol quantity $quantity")
  }
}

process(Buy("AAPL", 50))
process(Sell("GOOG", 20))