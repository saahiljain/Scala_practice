package lectures

object Expressions extends App{
  val x = 1+2
  println(x)
  val y= 1 + "2" //string concatenation
  println(y)
  val z= "2" +1
  println(z)
  val xz="two"+1
  println(xz)


  val aWeirdValu=()   //Unit===void
  println(aWeirdValu)

  //COdeBlocks
  val aCodeBlock={
    val y=2
    val z=y+1
    println(y)
    if(z>2) "hello" else "goodbye"

  }
println(aCodeBlock)
}
