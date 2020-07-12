object Foldable extends App {
  def show[A](list: List[A]):String =
    list.foldLeft("nil")((accum,item)=> s"$item then $accum")
  println(show(Nil))
  println(show(List(1,2,3)))  //foldLeft method works recursively down the sequence
  //foldLeft and foldRight are equivalent if our binary operation is associative
  //foldRight traverses from finish to start
  println(List(1, 2, 3).foldLeft(0)(_ + _)) //sum of list
  println(List(1, 2, 3).foldLeft(List.empty[Int])((a, i) => i :: a)) //reverses List

}

