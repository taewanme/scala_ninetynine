# S-99: Ninety-Nine Scala Problems

- 원본 URL: http://aperiodic.net/phil/scala/s-99/

prolog 학습 자료로 대료적인 자료는 "P-99: Ninety-Nine Prolog Problems"입니다 [원문: "https://sites.google.com/site/prologsite/prolog-problems"]
prolog의 연습문제를 scala 버전으로 변환한 것이 "S-99: Ninety-Nine Scala Problems"입니다.
S-99는 총 7개 카테고리, 98개 문항으로 구성되어 있습니다


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
