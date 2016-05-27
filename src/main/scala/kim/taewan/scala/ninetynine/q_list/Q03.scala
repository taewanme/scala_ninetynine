package kim.taewan.scala.ninetynine.q_list

/**
  * Created by taewan on 2016. 5. 27..
  */
object Q03 {
  def nthBuiltIn[A](n:Int, list:List[A]):A = {
    require(n>=0, "n is positive number")
    require(list != null && list.size > 0, "list is not Empty List")
    require(n<list.size, "n number is less than list size")

    list.drop(n).head
  }

  def nthRecur[A] (n:Int, list:List[A]):A = {
    require(n>=0, "n is positive number")
    require(list != null && list.size > 0, "list is not Empty List")

    (n,list) match {
      case (0, head::_)  => head
      case (n, head::tail) => nthRecur(n-1, tail)
      case (n, Nil) => throw new IllegalArgumentException
    }
  }
}
