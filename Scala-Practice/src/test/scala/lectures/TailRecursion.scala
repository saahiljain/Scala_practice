package lectures

import scala.annotation.tailrec

object Recursion extends App{
    //Recursion uses Stack and it can lead to StackOverflow

    def anotherFactorial(n:Int):Int={                             //This way we are able to calculate large
      @tailrec
      def factHelper(x:Int,accumulator:Int):Int=                  //recursive calls without exhausting the recusrive stack memory
        if(x<=1) accumulator
        else factHelper(x-1,x*accumulator)  //Tail Recursion =use recursive call as the Last expression
      factHelper(n,1)
    }
    println(anotherFactorial(600))



}
