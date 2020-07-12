import cats.Monad
import cats.syntax.flatMap._
import cats.syntax.functor._
import cats.Id
object MonodExample extends App{
  import cats.instances.list._ // for Monad
  Monad[List].flatMap(List(1, 2, 3))(a => List(a, a*10))

  def sumSquare[F[_]: Monad](a: F[Int], b: F[Int]): F[Int] =
    a.flatMap(x => b.map(y => x*x + y*y))

  println(sumSquare(List(1, 2, 3), List(4, 5)))

  //using for-comprehension

  def sumSq1[F[_]:Monad](a:F[Int],b:F[Int]):F[Int] =
    for{
      x <- a
      y <- b
    }yield x*x + y*y

  println(sumSq1(List(1,2),List(3,4)))

  println(sumSq1(3:Id[Int],3:Id[Int]))

}
