package fr.hervedarritchon.scala.kata.fizzbuzz

/**
 * Created by Hervé Darritchon on 22/05/15.
 *
 */
object FizzBuzz {

  def start(number: Int): String = number match {
    case x if (x % 3 == 0) && (x % 5 == 0) => "FizzBuzz"
    case x if (x % 3 == 0) => "Fizz"
    case x if (x % 5 == 0) => "Buzz"
    case _ => number.toString
  }

}
