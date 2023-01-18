// https://adventofcode.com/2022/day/1
import scala.io.Source

object Day1 extends App:
  val input = Source.fromResource("day1.data").getLines().toList

  val data = input.mkString("\n").split("\n\n").map(_.split("\n").map(_.toLong).sum)

  val result = data.max
  println(result)

  val top3Result = data.sorted.takeRight(3).sum
  println(top3Result)