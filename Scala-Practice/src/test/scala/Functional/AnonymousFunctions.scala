package Functional

object AnonymousFunctions extends App{
  //anonymous functions (LAMBDA)
  val doubler=(x:Int) =>x*2
  //
  val adder:(Int,Int) => Int =(a:Int,b:Int)=>a+b

  val Incrementer:Int => Int = _ +1


  val superAdd=(x:Int) => (y:Int) =>x +y  //take int return an funtion which can take an int and which result in sum of both parameters
  println(superAdd(3)(4))
}
