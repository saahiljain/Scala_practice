package lectures

import scala.util.Random

object PatterMatching extends App{
  val x= Random.nextInt(10)
  val description=x match {
    case 1 => "the one"
    case 2 => "double"
    case _ => "something else" //without this we matcherror
  }
  println(x)
  println(description)

  case class Person(name:String,age:Int)
  val bob=Person("Bob",20)
  val greeting=bob match {
    case Person(n,a) if a<21 => "first"
    case Person(n,a) => "second"
    case _ => "no matching"
  }
  println(greeting)

}
