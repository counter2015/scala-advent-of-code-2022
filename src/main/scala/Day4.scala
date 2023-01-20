// https://adventofcode.com/2022/day/4
import scala.io.Source

object Day4 extends App:

  val input = Source.fromResource("day4.data").getLines().toList

  val res1 = input.map {
    case s"$a-$b,$c-$d" =>
      if a.toInt <= c.toInt && b.toInt >= d.toInt then 1
      else if a.toInt >= c.toInt && b.toInt <= d.toInt then 1
      else 0
  }

  println(res1.sum)

  val res2 = input.map {
    case s"$a-$b,$c-$d" =>
      val a1 = a.toInt
      val b1 = b.toInt
      val c1 = c.toInt
      val d1 = d.toInt

      if (a1 >= c1 && a1 <= d1) || (b1 >= c1 && b1 <= d1) then 1
      else if a1 <= c1 && b1 >= d1 then 1
      else if a1 >= c1 && b1 <= d1 then 1
      else 0
  }

  println(res2.sum)