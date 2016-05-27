package kim.taewan.scala.ninetynine.q_list

import org.scalatest.{Matchers, FlatSpec}

/**
  * Created by taewan on 2016. 5. 27..
  */

class Q03BuiltInTest extends FlatSpec with Matchers{
  import Q03.{nthBuiltIn => nth}

  it should "입력 받은 리스트의 끝에서 두번째 엘리먼트를 반환" in {
    val result = nth(2, List(0, 1, 2, 3, 5, 8))
    result should be (2)
  }

  it should "not support empty list & some precondition" in {
    an[IllegalArgumentException] should be thrownBy {
      nth(1,List())
    }

    an[IllegalArgumentException] should be thrownBy {
      nth(-1, Nil)
    }

    an[IllegalArgumentException] should be thrownBy {
      nth(7, List(1, 2, 3, 4))
    }
  }

  it should "support any input type " in {
    val result =nth(1, List("aaa","bbb","ccc"))
    result should be ("bbb")
  }

}

class Q03RecurTest extends FlatSpec with Matchers{
  import Q03.{nthRecur => nth}

  it should "입력 받은 리스트의 끝에서 두번째 엘리먼트를 반환" in {
    val result = nth(2, List(0, 1, 2, 3, 5, 8))
    result should be (2)
  }

  it should "not support empty list & some precondition" in {
    an[IllegalArgumentException] should be thrownBy {
      nth(1,List())
    }

    an[IllegalArgumentException] should be thrownBy {
      nth(-1, Nil)
    }

    an[IllegalArgumentException] should be thrownBy {
      nth(7, List(1, 2, 3, 4))
    }
  }

  it should "support any input type " in {
    val result =nth(1, List("aaa","bbb","ccc"))
    result should be ("bbb")
  }

}
