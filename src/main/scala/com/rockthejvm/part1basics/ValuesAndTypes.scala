package com.rockthejvm.part1basics

object ValuesAndTypes {

  // unlike java, and more similar to modern statically typed language, it is 'val name: dataType = value data'
  // values are also immutable in scala
  val meaningOfLife: Int = 42

  // type inference in scala
  // val greeting: String = "Hello"
  // val numbers: List[Int] = List(1, 2, 3)

  // can also be expressed as

  // val greeting = "Hello"
  // val numbers = List(1, 2, 3)

  // common data types
  val aBoolean: Boolean = false
  val aChar: Char = 'a' // similar to C, ' is used instead of " for character literals. "A" represents a string object containing 'A' and a hidden string terminator '\0'
  val anInt: Int = 45 // Int 4 bytes
  val aShort: Short = 5234 // 2 bytes
  val aFloat: Float = 2.4f // 4 byte dec
  val aDouble: Double = 3.13 // 8 byte dec
  val aLong: Long = 84927498329482L // 8 byte ints, used a lot in ids, like in java
  val aString: String = "scala rocks"

  val x = 10
  // x = 20 bad: this is a attempt to modify an already assigned value

  // variables, however, are mutable references
  var y = 10
  y = 20


  def main(args: Array[String]): Unit = {

  }
}
