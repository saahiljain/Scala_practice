import cats.Functor
import cats.instances.list._
import cats.instances.function._ // for Functor
import cats.syntax.functor._ // for map
object FunctorExample extends App {

  val list1=List(1,2,3)
  val list2 = Functor[List].map(list1)(_ * 2)


  val func1 = (a: Int) => a + 1
  val func2 = (a: Int) => a * 2
  val func3 = (a: Int) => s"${a}!"
  val func4 = func1.map(func2).map(func3)
  func4(123)


  def map[F[_],A,B](fa: F[A])(f: A => B)(implicit F: Functor[F]): F[B] = {
    F.map(fa)(f)
  }

  println(map(List(1, 2, 3))(_ * 3))
  //Lifting a function

  

}
