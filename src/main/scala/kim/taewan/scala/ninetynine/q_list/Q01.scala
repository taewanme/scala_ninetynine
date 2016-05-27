package kim.taewan.scala.ninetynine.q_list

/**
  * Created by taewan on 2016. 5. 27..
  */
object Q01 {
  def listBasic[A](list:List[A]):A = {
    require(list.size>0,"Input List shoud have one or more elements")
    list.last
  }

  def listRecusive[A](list:List[A]):A = {
    require(list.size>0, "Input List shoud have one or more elements")

    list match {
      case a::Nil => a
      case a::b => listRecusive(b)
    }
  }
}
