package kim.taewan.scala.ninetynine.q_list

/**
  * Created by taewan on 2016. 5. 27..
  */
import org.scalatest.{Matchers, FlatSpec}

class Q01BasicTest extends FlatSpec with Matchers {
  import Q01.{listBasic => list}

  it should "return a last element of list" in {
    val result = list(List(1, 2, 3, 4, 5, 6, 7, 8))
    result should be (8)
  }

  it should "not support empty list" in {
    an[IllegalArgumentException] should be thrownBy {
      list(List())
    }

    an[IllegalArgumentException] should be thrownBy {
      list(Nil)
    }
  }

  it should "support any input type " in {
    val result =list(List("aaa","bbb","ccc"))
    result should be ("ccc")
  }
}

class Q01RecusiveTest extends FlatSpec with Matchers {
  import Q01.{listRecusive => list}

  it should "return a last element of list" in {
    val result = list(List(1, 2, 3, 4, 5, 6, 7, 8))
    println(result)
    result should be (8)
  }

  it should "not support empty list" in {
    an[IllegalArgumentException] should be thrownBy {
      list(List())
    }

    an[IllegalArgumentException] should be thrownBy {
      list(Nil)
    }
  }

  it should "support any input type " in {
    val result =list(List("aaa","bbb","ccc"))
    result should be ("ccc")
  }
}
