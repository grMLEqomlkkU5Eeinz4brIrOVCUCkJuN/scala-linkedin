package com.rockthejvm.part1basics

// In scala a class is a blueprint for creating objects, it defines types and properties
// Whereas an object is a singleton instance of the class, meaning only one instance of it exists, basically the static keyword


// Objects don't need to be instantiated with the new keyword, direct method calling would work the same way
// A scala's program execution starts with a main method, which must be in an object

// when an object has the same name as a clas, it is called a "companion object". This pattern allows classes and objects to access each other's private members, allowing a way to have both instance dependent logic

// https://docs.scala-lang.org/scala3/book/domain-modeling-tools.html#companion-objects

object Expressions {

  // expressions are structures that evaluate to a value
  // public members reuire typing annotations
  val meaningOfLife: Int = 40 + 2
  //                  ^^^^^^ expression

  // expressions that compose + - * /, bitwise | & >> <<
  // private members do not need typing annotations
  private val mathExpression = 2 + 3 * 4 // 14

  // boolean expressions
  val equalityTest: Boolean = 1 == 2 // it is an expression and the compiler will know to return a bool

  // if expression
  val anIfExpression: Int = if (equalityTest) 45 else 99
  val anIfExpression_v2: Int = if equalityTest then 45 else 99

  // code blocks are also expressions
  val aCodeBlock: Int = {
    // can define local values
    val localValue = 78

    // last value = the value of the entire block
    localValue + 99
  }

  // scala 3 code blocks indentation style (scala 3)
  val aCodeBlock_v2: Int =
    val localValue = 78
    localValue + 99

  // pattern matching - switch on steroids
  val someValue = 43
  val description: String = someValue match {
    case 1 => "the first"
    case 2 => "second"
    case 42 => "meaning of life"
    case _ => "something else"
  }

  def main(args: Array[String]): Unit = {
    println(mathExpression)
    println(meaningOfLife)
    println(equalityTest)
    println(aCodeBlock) // will return 177
    println(aCodeBlock_v2)
    println(description)
  }
}
