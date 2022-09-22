//import scala.annotation.tailrec
//
//object Practice :
//  def factorial(n:Int):Int =
//    if (n == 0|| n == 1) 1
////      tell the sys its a recursive
//    else n * factorial(n-1)
//
////  @tailrec
//  def factorialTR(n: Int): Int ={
//    def factorial_helper (n : Int, acc: Int) : Int =
//      if (n == 0 || n == 1) acc
//      else factorial_helper(n-1, n * acc)
//
//    factorial_helper(n, 1)
////    println()
//  }
//
////  private def formatAbs(x: Int) =
////    val msg = "testing input = %d and out is %d"
////    msg.format(x, abs(x))
//
//  // List[Int]:
//
//  def my_map(l:List[Int], f:Int => Int) : List[Int] = l match
//  case Nil => Nil
//  case x :: xs => f(x) :: my_map(xs, f)
//
//  def my_better_map = (l : List[Int], f: Int ==> Int): List[Int]
//
//  @main
//  def calculate: Unit =
//    println("input and output: ")
//

