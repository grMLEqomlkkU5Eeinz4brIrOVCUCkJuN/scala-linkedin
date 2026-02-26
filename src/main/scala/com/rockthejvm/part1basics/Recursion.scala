package com.rockthejvm.part1basics

import scala.annotation.tailrec

// In Scala, recursion is favored over traditional loops (like while or for with side effects) primarily to embrace the principles of functional programming, such as immutability and referential transparency. - the docs

object Recursion {

  // classical recusrion, but should be treated as an anti pattern to avoid overflows
  def sum(n: Int): Int = {
    if (n <= 0) 0 // sanity check
    else n + sum(n-1) // not re-using the same frame, n is still being kept alive
  }
  // The computer must first call sum(n-1), wait for it to return a value, and then perform the addition (n + ...). Because the function has to "stay alive" to perform that addition later, it keeps its frame on the stack. If n is large enough (e.g., 10,000+), you will get a StackOverflowError.

  // TCO pattern
  @tailrec // annotation for this pattern
  def printN(string: String, n: Int): Unit = {
    if (n <= 0) ()
    else {
      println(string)
      // last action
      printN(string, n-1)
    }

    // Once printN(string, n-1) is called, the current function has nothing left to do. The Scala compiler recognizes this and jumps back (bytecode level) to the start of the function with new parameters instead of adding a new layer to the stack.
  }


  // test all numbers from 2 to n/2, all the possible divisors
  def isPrime(n: Int): Boolean = {
    def testDivisors(d: Int): Boolean = {
      if (d > n / 2) true
      else if (n % d == 0) false
      else testDivisors(d + 1)
    }

    if (n <= 0) false
    else if (n == 1) false
    else testDivisors(2)
  }

  def concatenateN(string: String, n: Int): String = {
    if (n <= 0) ""
    else string + concatenateN(string, n - 1)
  }

  def fibonacci(n: Int): Int = {
    if (n <= 1) 1
    else if (n == 2) 2
    else fibonacci(n - 1) + fibonacci(n - 2)
  }

  def main(args: Array[String]): Unit = {
    println(sum(10))
    printN("scala is cool", 10)
  }
}
