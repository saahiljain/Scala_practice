package lectures

object CallBy extends App {
  def callbyName(x: => Long):Unit={
    println("name"+x)
  }
  def callbyValue(x: => Long):Unit={
    println("name"+x)
  }
  callbyName(System.nanoTime())
  callbyValue(System.nanoTime())


    //call by name has lazy evaluation the expression is evaluated at every step its required


}
