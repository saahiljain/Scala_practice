package lectures

object Generics extends App{
  class MyList[A]
  {
    //InvariantList can't substitute
    //use the type A
  }
  val listOfIntegers=new MyList[Int]
  val listOfString=new MyList[String]
  class Animal
  class Dog extends Animal
  class Cat extends Animal

  class CovariantLList[+A]
  val animal:Animal=new Cat
  val animalList:CovariantLList[Animal]=new CovariantLList[Cat] //Covariance

  class InvariantList[A]
  val invariantList:InvariantList[Animal]=new InvariantList[Animal]  //here we can't do animal=Cat

  //ContraVariance  this should be never done
  class Trainer[-A]
  val contraVariance:Trainer[Cat]=new Trainer[Animal]

  //bounded types
  class Cage[A<:Animal](animal:A)
  val cage=new Cage(new Dog)


}
