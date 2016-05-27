package kim.taewan.scala.ninetynine.q_list

import org.scalatest.{Matchers, FlatSpec}

/**
  * Created by taewan on 2016. 5. 27..
  */
class Q02BasicTest extends FlatSpec with Matchers {

  import Q02.{penultimateBasic => penultimate}

  it should "입력 받은 리스트의 끝에서 두번째 엘리먼트를 반환" in {
    val result = penultimate(List(1, 1, 2, 3, 5, 8))
    result should be (5)
  }

  it should "not support empty list" in {
    an[IllegalArgumentException] should be thrownBy {
      penultimate(List())
    }

    an[IllegalArgumentException] should be thrownBy {
      penultimate(Nil)
    }
  }

  it should "support any input type " in {
    val result =penultimate(List("aaa","bbb","ccc"))
    result should be ("bbb")
  }

  it should "입력 받은 리스트의 길이 1인 경우 예외 발생" in {
    an[NoSuchElementException] should be thrownBy {
      penultimate(List(1))
    }
  }
}

class Q02RecusiveTest extends FlatSpec with Matchers {

  import Q02.{penultimateRecu => penultimate}

  it should "입력 받은 리스트의 끝에서 두번째 엘리먼트를 반환" in {
    val result = penultimate(List(1, 1, 2, 3, 5, 8))
    result should be (5)
  }

  it should "not support empty list" in {
    an[IllegalArgumentException] should be thrownBy {
      penultimate(List())
    }

    an[IllegalArgumentException] should be thrownBy {
      penultimate(Nil)
    }
  }

  it should "support any input type " in {
    val result =penultimate(List("aaa","bbb","ccc"))
    result should be ("bbb")
  }

  it should "입력 받은 리스트의 길이 1인 경우 예외 발생" in {
    an[IllegalArgumentException] should be thrownBy {
      penultimate(List(1))
    }
  }
}
