// https://adventofcode.com/2022/day/2
import scala.io.Source
object Day2 extends App:
  val input = Source.fromResource("day2.data").getLines().toList

  private def score(a: String, b: String): Int =
    require(a.length == b.length && a.length == 1, "invalid input data")
    val x: Int = (a.head - 'A')
    val y: Int = (b.head - 'X')
    val winScore = if x == y then 3 else if ((y - x + 3) % 3 == 1) then 6 else 0
    val elementScore = y + 1
    winScore + elementScore

  val data = input.map {
    case s"$a $b" => score(a, b)
  }

  val result = data.sum

  println(result)

