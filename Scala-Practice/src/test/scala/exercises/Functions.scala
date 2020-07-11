package exercises

object Functions extends App{

  def greetingFunction(name:String,age:Int):String =
    "Hi,my name is"+name+"and I am "+age+"years old"

  println(greetingFunction("saahil",22))

  def factorialFunction(n:Int):Int=
    if(n<=0) 1
    else n*factorialFunction(n-1)

      println( factorialFunction(3))

  def FibonacciNumber(n:Int):Int=
    if(n==1 || n==2) 1
  else  FibonacciNumber(n-1)+FibonacciNumber(n-2)
  println(FibonacciNumber(5))





}
