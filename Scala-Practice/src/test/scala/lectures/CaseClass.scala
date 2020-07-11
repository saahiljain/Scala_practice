package lectures

object CaseClass extends App{
  case class Person(name:String,age:Int)
  val jim=new Person("Jim",34)
  println(jim.name)

  println(jim)

  val jim2=new Person("Jim",34)
  println(jim==jim2) //true

  //case classes have handy copy method
  val jim3=jim.copy(age=45)
  println(jim3)

  //companion objects
  val thePerson=Person
  println(thePerson) //Person

  val mary=Person("Mary",23)

  //case classes are serializable
  //cases have extractor patterns =it can be used in patern matching

  case object  UnitedKingdom{
    def name: String ="The UK of "
  }
}
