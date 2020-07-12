import cats.Monad

object MonodExample extends App{
  import cats.instances.list._ // for Monad
  Monad[List].flatMap(List(1, 2, 3))(a => List(a, a*10))

}
