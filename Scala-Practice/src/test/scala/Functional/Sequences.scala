package Functional

object Sequences extends App  {
   val aSequence=Seq(1,2,3,4)
  println(aSequence)//will show its a list
  println(aSequence.reverse)
  println(aSequence(2))
  println(aSequence ++ Seq(7,5,6))
  val mixed=Seq(1,4,2,3)
  println(mixed.sorted)

  val aRange:Seq[Int]= 1 until 10


  (1 to  10 ).foreach(x=> println("Hello"))

  val aList=List(1,2,3)
//  val prepended=42 +: aList +: 89
//  println(prepended)

  //arrays
  val nums=Array(1,2,3,4)

  //vector
  //immutable seqences

  //tuples
  val aTuple= new Tuple2(2,"hello,Scala")   //aTuple=(2,"hello,Scala")
  println(aTuple._1) //2
  println(aTuple.copy(_2="goodbye Java"))
  println(aTuple.swap)

  //Maps  Keys-> Values
  val aMap:Map[String,Int]=Map()

  val phonebook=Map(("Jim",555),("Daniel",789)).withDefaultValue(-1)
  println(phonebook)
  println(phonebook.contains("Jim"))
  println(phonebook("Jim"))
  println(phonebook("Mary")) //without default value it will throw exception

  val newPairing =("Mary",678)
  val newPhonebook =phonebook + newPairing //maps are immutable

  //functionals on maps
  //map,flatMap,filter
  println(phonebook.filterKeys(x => x.startsWith("J")))

  println(List(("Daniel",555)).toMap)





}
