package kim.taewan.scala.ninetynine.q_list

import scala.annotation.tailrec

/**
  * Created by taewan on 2016. 5. 27..
  */
object Q02 {
  def penultimateBasic[A](list:List[A]):A = {
    require(list!=null && list.size>0,"Input List should have one or more elements")
    list.init.last
  }

  @tailrec
  def penultimateRecu[A](list:List[A]):A = {
    require(list!=null && list.size>1,"Input List should have one or more elements")

    list match {
      case head::_::Nil  => head
      case head::tail       => penultimateRecu(tail)
    }
  }
}
