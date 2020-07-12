import cats.Monoid
import cats.implicits._

object MonoidEx extends App {
  println(Monoid[Int].empty)
  println((1 to 10).fold(Monoid[Int].empty)((a,b) => a.combine(b)))
  println((1 to 10).fold(0)(_ + _))

  println((1 to 10).toList.combineAll)

  println(5|+|6|+|7|+|8)
  def add[A: Monoid](items: List[A]): A =
    items.foldLeft(Monoid[A].empty)(_ |+| _)
  println(add(List(1,2,3,4,5)))









}
