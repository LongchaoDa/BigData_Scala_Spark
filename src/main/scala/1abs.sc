//@main
//def main(): Unit = {
//  println("Hello world!")
//}

//repo
//command
//main fun
//worksheet

object Mytestings:
//  def abs(n:Int): Int =
//    if n < 0 then -n
//    else n
  def abs(n: Int): Int =
    if n < 0 then return -n
    else return n

  private def formatAbs(x: Int)=
    val msg = "testing input = %d and out is %d"
    msg.format(x, abs(x))

  @main
  def printAbs:Unit =
    println("starting the object and executing the main fun:")
    println(formatAbs(-11))
    