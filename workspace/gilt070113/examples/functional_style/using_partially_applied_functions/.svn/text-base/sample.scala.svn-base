def log(level: String, msg : String) = {
  println(s"Level $level Msg: $msg")
}

log("warning", "starting")
log("warning", "running")
log("warning", "shutting")
log("warning", "stopped")

val logWarning = log("warning", _ : String)

logWarning("starting")
logWarning("running")
logWarning("shutting")
logWarning("stopped")

def add(value1: Int, value2 : Int) =
  value1 + value2

println(add(2, 4))
println(add(2, 5))

val add2 = add(2, _ : Int)
println(add2(4))
println(add2(5))


val add4 = add(_: Int, 4)
println(add4(2))

