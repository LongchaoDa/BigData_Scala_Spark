object factorial_test:

  def calculate_factorial (a : Int) : Int =
    if (a == 0 || a == 1) 1
    else a * calculate_factorial(a - 1)

  def use_factorial(input: Int): Unit =
    val out: Int = calculate_factorial(input)
    println(out)

  use_factorial(5)
