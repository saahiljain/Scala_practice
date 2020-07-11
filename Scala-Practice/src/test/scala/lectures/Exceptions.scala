package lectures

import org.graalvm.compiler.nodes.InvokeWithExceptionNode

object Exceptions extends App{
   //val aWeirdValue:String=throw new NullPointerException

    def getInt(withExceptions:Boolean):Int=
      if(withExceptions) throw new RuntimeException("No int for you!")
      else 42
      try {
          getInt(true)
      }
      catch {
        case e: RuntimeException => println("caught runtime exception")
      }
  finally {
    //will be definitely executed
    println("finally")
  }



}
