package lectures

object Iterators extends App {
  val x=List(1,2,3)

  x.foreach(x=>println(x))
  println(x)

  //map
  println(x.map(_+1))
  //filter
  println(x.filter(_ %2 ==0))

  val toPair=(x:Int) =>List(x,x+1)

    //print all combinations between two lists
  val numbers=List(1,2,3,4)
  val chars=List('a','b','c','d')

  val combinations=numbers.flatMap(n=> chars.map (c => "" + n))
  println(combinations)

  val forCombinations =for{
    n <- numbers if n% 2 == 0
    c <- chars

  } yield "" +c +n+ "-"
}
