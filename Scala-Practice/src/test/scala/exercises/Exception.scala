package exercises

object Exception extends App{

  //val outOfMemoryError=throw new OutOfMemoryError()

  //val stackOverflowError=throw new StackOverflowError()

  class OverflowException extends RuntimeException
  class UnderflowException extends RuntimeException
  class DivisionByZeroException extends RuntimeException
  object PocketCalculator{
    def add(x:Int,y:Int)={
      val result=x+y
      if(x > 0 && y>0 &&result>0 ) throw new OverflowException
      else if( x <0 && y<0 && result >0 ) throw new UnderflowException
      else result
    }
    def divide(x:Int,y:Int)={
      if(y==0) throw new DivisionByZeroException
      else x / y
    }
  }
  println(PocketCalculator.add(Int.MaxValue,10))
  println(PocketCalculator.divide(2,0))

}
