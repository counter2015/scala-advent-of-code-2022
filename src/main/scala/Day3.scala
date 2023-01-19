// https://adventofcode.com/2022/day/3
import scala.io.Source

object Day3 extends App:
  val input = Source.fromResource("day3.data").getLines().toList
  private def score(char: Char): Int =
    if char >= 'a' && char <= 'z' then char - 'a' + 1 else char - 'A' + 27

  val res1 = (for {
    line <- input
  } yield {
    val left = line.take(line.length / 2)
    val right = line.takeRight(line.length / 2)

    val res = left.toCharArray.toSet & right.toCharArray.toSet

    val ans = res.map(score).sum
    ans
  }).sum

  println(res1)

  val res2 = (for {
    group <- input.grouped(3)
    _ = assert(group.length == 3, "invalid input")
    aSet = group(0).toCharArray.toSet
    bSet = group(1).toCharArray.toSet
    cSet = group(2).toCharArray.toSet
  } yield {
    (aSet & bSet & cSet).map(score).sum
  }).sum

  println(res2)