package lectures

object Inheritance extends App{
  class Animal{
    val creatureType="domestic"
    protected def eat=println("nomnom") //use final to avoid override
  }
class Cat extends Animal { //can only inherit one class  if we use final for the class
  def crunch ={
    eat //directly taking if it was private then it couldn't be used
    println("crunch crunch")
  }
  val cat = new Cat
  cat.eat

}
  class Person(name:String,age:Int)
  {
    def this(name:String)=this(name,0)
  }
  class Adult(name:String,age:Int,idCard:String) extends  Person(name) //this is valid without mentioning age parameter bcoz of this def in Person

  class Dog(override val creatureType:String) extends Animal
  {
    //override val creatureType: String = "domestic"
    override def eat ={
      super.eat
      println("Crunch,crunch")}
  }
  val dog=new Dog("k9")  //error when Dog() needs a parameter
  dog.eat
  println(dog.creatureType)

  //type substitution (broad:polymorphism
  val unknownAnimal=new Dog("k9")
  unknownAnimal.eat

    //preventing overrides
  //seal class => sealed class Animal doesn't allow extension of class in other files
}
