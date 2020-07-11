package lectures

object AbstractDataTypes extends App{
  abstract class Animal{
    val creatureType:String       //do not instantiate not give any values its just an skeleton
    def eat:Unit
  }
  class Dog extends Animal
  {
    override val creatureType: String = "canine"

    def eat: Unit = println("crunch crunch")
  }
  //traits
  trait Carnivore{
    def eat(animal: Animal):Unit

  }
  //difference b/w abstract and trait
  //traits do not hv parameters
  //multiple traits can be inherited
  //traits=behaviour
  class  Crocodile extends Animal with Carnivore{
    val creatureType:String ="croc"
    def eat:Unit ="nomnomnom"
    def eat(animal: Animal):Unit=println(s"I'm a croc and I'm eating ${animal.creatureType}")

  }
  val dog=new Dog
  val croc=new Crocodile
  croc.eat(dog)
}
