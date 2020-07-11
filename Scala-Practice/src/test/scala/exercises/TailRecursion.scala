package exercises

import scala.annotation.tailrec

object TailRecursion extends App {

  @tailrec
  def concatenate(initial:String,n:Int,accumulator:String):String=
    if(n<=0)accumulator
    else concatenate(initial,n-1,initial+accumulator)
  print(concatenate("saahil",3,""))

  def isPrime(n:Int):Boolean=
    {
      @tailrec
      def prime(t:Int,isPrimeFlag:Boolean):Boolean=
        if(!isPrimeFlag)false
        else if(t<=1) true
        else prime(t-1,n % t !=0 )
      prime(n/2,true)
    }
  println(isPrime(4))

}
