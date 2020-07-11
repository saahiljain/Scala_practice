package lectures

object OOPS extends App{
  class Person(val name:String,favouriteMovie:String)
  {
    def likes(movie:String):Boolean=movie==favouriteMovie
    def +(person: Person):String= s"${this.name} is hanging out with ${person.name}"
    def +(nickname:String): Person =new Person(s"$this.name ($nickname)",favouriteMovie)
    def unary_! : String=s"${this.name} this is amazing"

    def apply():String = s"hi my ${this.name}"
  }
  val saahil=new Person("Saahil","Inception")
  println(saahil likes("Inception"))
  //infix notation =operator notation(syntactic sugar) => operator that is written in between the operands
  val sam=new Person("sam","Mission Impossoble")
  println(saahil + sam)
  println(saahil.+(sam))

  //unary_ prefix only works with - + ~ !
  println(!saahil)
  println(saahil.unary_!)

  //apply  acts as function too
  println(saahil.apply())
  println(saahil()) //both are equivalent
}
