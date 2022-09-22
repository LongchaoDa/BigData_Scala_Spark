//object pattern_mapping:
// testing the :: functions
//2::Nil
//1::(2::Nil)
//1::(2::(3::Nil))
//1::List(2,3,4)
//List(0,1,2,3) //default the value is taken as Int

// target: input a list, mapping to another list
def straight_mapping(f : Int => Int, in_list : List[Int]): List[Int] = in_list match
  case Nil => Nil
  // if the list could be taken as (a) + (a_list) then process the data
  // as: f(a) + recur(a_list, f)
  case a::a_list => f(a)::straight_mapping(f,a_list)

//def f: Int => Int = x => x * x
//def better_mapping(in_list: List[Int], f:Int => Int):List[Int] = {
def better_mapping(in_list: List[Int]):List[Int] = {

  def fin: Int => Int = x => x * x

  def inner_helper_mapping(rest_list: List[Int], f: Int => Int, acc_list: List[Int]): List[Int] = rest_list match
    case Nil => acc_list
    case a::a_rest => inner_helper_mapping(a_rest, f, f(a)::acc_list)
    // list(2,3,4)==> 2::(3,4) processing f(a)::acc_list) <> for now, acc_list = Nil, so its: [4, Nil]
    // list(3,4) ==> 3::(4) .... then: acc_list[9, 4, Nil]
    // list(4) ==> 4::(Nil) ... then: acc_list [16, 9, 4, Nil]
    // we should add "reverse"

  inner_helper_mapping(in_list, fin, Nil).reverse

}


@main
def main_test:Unit =
  def f: Int => Int = x => x * x
  println("trying straightforward tesing for List(2,4,6,7)")
  // straight way
  println(straight_mapping(f, List(2,4,6,7)))

  // better way
  println("trying better mapping method:")
//  println(better_mapping(List(3,5,7,8), f))
  println(better_mapping(List(3,5,7,8)))



//insight:
// f() could be defined inner or outer the first layer fun
// a::list(1,2,3), the sequence is not changeable, as: (a, 1,2,3)
// better way always use: acc, and acc will increase, while other one decrease
// first write name: type
// def fin: Int => Int = x => x * x
// the lase line value will be taken as return value