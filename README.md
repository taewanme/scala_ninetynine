# S-99: Ninety-Nine Scala Problems

- 원본 URL: http://aperiodic.net/phil/scala/s-99/

## List

- P01 (*) 리스트의 마지막 엘리먼트 반환
  - 예제 코드
```scala
scala> last(List(1, 1, 2, 3, 5, 8))
res0: Int = 8
```
  - mapping
    - 구현 클래스: kim.taewan.scala.ninetynine.q_list.Q01.scala
    - 단위 테스트: kim.taewan.scala.ninttynine.q_list.Q01_teest.scala


- P02 리스트에서 끝에서 두 번째 엘리먼트 반환
  - 예제 코드
```scala
scala> penultimate(List(1, 1, 2, 3, 5, 8))
res0: Int = 5
```
  - mapping
    - 구현 클래스: kim.taewan.scala.ninetynine.q_list.Q02.scala
    - 단위 테스트: kim.taewan.scala.ninttynine.q_list.Q02_test.scala
