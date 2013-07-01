def power(implicit number : Double, exp: Int) = 
  math.pow(number, exp)

def fn1() {
  val three = 3
  val two = 2
  println(power(three, two))
}

def fn2() {
  implicit val four = 4.0
  implicit val two = 2
  println(power)
}

fn1()
fn2()
