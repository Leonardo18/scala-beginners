package lectures.part1basics

object Expressions extends App {

  val x: Int = 1 + 2 // EXPRESSION
  println(x)

  println(2 + 3 * 4)
  // + - * / & | ^ << >> >>> (right shift with zero extension)

  println(3 == x) // Test equality
  // == != > >= < <=

  println(!(1 == x)) // Logical Negation
  // ! && ||

  var aVariable: Int = 2
  aVariable += 3 // Also works with -= *= /= ..... side effects
  println(aVariable)

  // Instructions (DO) vs Expressions (VALUE)
  // Instructions are executed (think Java), expressions are evaluated (Scala)

  // IF expression
  val aCondition = true
  val aConditionedValue = if(aCondition) 5 else 3 // IF EXPRESSION
  println(aConditionedValue)
  println(if(aCondition) 5 else 3)

  var i: Int = 1
  val aWhile = while (i < 10) {
    println(i)
    i += 1
  }

  // NEVER WRITE THIS AGAIN
  // EVERITHING IN SCALA IS AN EXPRESSION!

  val aWeirdValue = (aVariable = 3) // Unit === void
  println(aWeirdValue)

  // side effects: println(), whiles, reassigning

  // Code blocks: the value of the block is the value of its last expression
  val aCodeBlock = {
    val y = 2
    val z = y + 1

    if(z > 2) "hello" else "goodbye"
  }
  println(aCodeBlock)

  // In Scala we think about expressions

  // Question 1. Difference between "Hello world" vs println("Hello world")? One if a string and the other is a unit
  // Question 2. Boolean and Int

  val someValue = {
    2 < 3
  }
  println(someValue) // Boolean type

  val someOtherValue = {
    if(someValue) 239 else 986 // Will be ignored because theres another last expression
    42
  }
  println(someOtherValue) // Int type
}
