package lectures

object Functions extends App{
  // String Concatenation function
  def firstFunction(a:String,b:Int):String=
    a + "" + b
  println(firstFunction("saahil",2))



  def firstFunctionModif(a:String,b:Int): String = {
    return a + "" + b
    "42"
  }
  println(firstFunctionModif("saahil",2))

  //To avoid using loops shift to function
  //Recursive function
  def RecursiveFunction(a:String,n:Int):String=
    if(n==1) a
    else a+RecursiveFunction(a,n-1)

    println(RecursiveFunction("saahil",3))
}


