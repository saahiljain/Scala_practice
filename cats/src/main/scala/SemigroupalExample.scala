import cats.Semigroupal
import cats.instances.list._
import cats.instances.option._ // for Semigroupal
import cats.syntax.apply._ // for tupled
import cats.instances.either._ // for Semigroupal


object SemigroupalExample extends App {

  println(Semigroupal[Option].product(Some(123), Some("abc")))
  println(Semigroupal[Option].product(None, Some("abc")))
  //Anyone is None then result is None
  println(Semigroupal[Option].product(Some(123), None))
//tuple2 to tuple 22
  println(Semigroupal.tuple3(Option(1), Option(2), Option(3)))
  //map2 to map22
  println(Semigroupal.map3(Option(1), Option(2), Option(3))(_ + _ + _))

  println((Option(123), Option("abc")).tupled)// for tupled

  println((Option(123), Option("abc"), Option(true)).tupled)

  case class Cat(name: String, born: Int, color: String)

  (
    Option("Garfield"),
    Option(1978),
    Option("Orange & black")
    ).mapN(Cat.apply)

  //Lists behave unexpectedly
  println(Semigroupal[List].product(List(1, 2), List(3, 4)))

  type ErrorOr[A] = Either[Vector[String], A]

  println(Semigroupal[ErrorOr].product(
    Left(Vector("Error 1")),
    Left(Vector("Error 2"))
  )) //instead of accumulating error it implements fail-fast behaviour as flatMap

}
