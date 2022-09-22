object factorial_test:

  def calculate_factorial (a : Int) : Int =
    if (a == 0 || a == 1)
      println(1)
      1

    else
      val temp : Int = a * calculate_factorial(a - 1)
      println(temp)
      temp

  def recur_version(input : Int) : Int =
    def teller (input: Int, acc: Int): Int =
      // this is the stopping signal
      if (input ==0 || input ==1) acc
      // here, if not stop, we increase acc
      else teller(input - 1, input * acc)
      // declare the teller, input will decrease, and acc will increase
    teller(input, 1)


//  def better_factorial(a: Int): Int =
//    if (a == 0 || a ==1) 1
//    else

  def use_factorial(input: Int): Unit =
// straight version
//    val out: Int = calculate_factorial(input)
// better version
    val out: Int = recur_version(input)
    println("final result:" + out)

  @main
  def mainfun : Unit =
//    println()
    use_factorial(5)
