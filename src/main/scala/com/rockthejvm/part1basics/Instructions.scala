package com.rockthejvm.part1basics

object Instructions {

  // instructions are executedd vs expressions are evaluated

  val printing: Unit = println("This is an instruction") // Unit is similar to void, but the mental model seems a little different, the model sohuld not e "this returns nothing", rather "this is a unit that only executes"
  val theUnit: Unit = () // the only possible value of type unit. it actually returns just this

  // instructions in a code block
  val aCodeBlock: Unit = {
    val aLocalValue = 45
    println("1")
    println("2")
  }

  var aVariable = 10
  val reassignment: Unit = aVariable += 34 // changes the memory zone, but returns no meaningful value itself


  def main(args: Array[String]): Unit = {
    println(printing == theUnit)
    println(theUnit)

    // loops
    var theNumber = 1
    while (theNumber <= 10) {
      println(theNumber)
      theNumber += 1
    }
  }
}
