package lectures.part1basics

// Extends APP turns this object a runnable like as a main function declare
object ValuesVariablesTypes extends App {

  //Values
  val x: Int = 42
  println(x)

  // VALS ARE IMMUTABLE
  // COMPILER CAN INFER TYPES

  val aString: String = "Mini Ninja Baguncinha"
  val anotherString: String = "another string"

  val falseBoolean: Boolean = false
  val trueBoolean: Boolean = true

  val aChar: Char = 'a'
  val anInt: Int = x
  val aShort: Short = 4613
  val aLong: Long = 499999999
  val aFloat: Float = 2.0
  val aDouble: Double = 3.14

  //Variables
  var aVariable: Int = 4

  aVariable += 5  //side effects

  println(aVariable)
}
