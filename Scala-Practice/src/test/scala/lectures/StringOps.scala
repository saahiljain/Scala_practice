package lectures

object StringOps extends  App{
  val str:String ="Hello,I am learning Scala"
  println(str.charAt(2))
  println(str.substring(7,11))
  println(str.split(" ").toList)
  println(str.replace(" ","-"))
  println(str.toLowerCase())
  println(str.length)


//  val name="David"
//  val age=12
//  val greeting=s"Hello,my name is $name and i am $age years old"  //can be $(age+1)

  //println(greeting)

  val speed=1.2f
  val name="Daniel"
  println(f"$name%s can eat $speed%2.2f burgers per minute")

  println(raw"hello \n")
  val escape="hello \n world"
  println(raw"$escape")

}
