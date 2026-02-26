package com.rockthejvm.part1basics

object Functions {

  def aFunction(a: String, b: Int): String = {
    a + " " + b
  }

  // minified
  // def aFunction(a: String, b: Int) = a + " " + b  // inferred as String

  // function invocation
  val anInvocation: String = aFunction("Scala", 999)

  // functions returning Unit
  def aVoidFunction(aString: String): Unit = {
    println(aString)
  }

  def functionWithSideEffects(aString: String): String = {
    println(aString) // executes this instruction
    aString + " " + aString // returns this expression to satisfy String type
  }

  // can define smaller functions inside bigger ones
  def aBigFunction(n: Int): Int = {

    // can define smaller functions, locally scoped
    def aSmallerFunction(a: Int, b: Int): Int = a + b

    aSmallerFunction(n, n+ 1)
  }

  def main(args: Array[String]): Unit = {
    println(anInvocation)
    aVoidFunction("Hello World")
    println(functionWithSideEffects("Scala on top"))
    println(aBigFunction(2))
  }
}
