package fr.hervedarritchon.scala.kata.fizzbuzz

import org.scalatest.{Matchers, FlatSpec}

/**
 * Created by Hervé Darritchon on 22/05/15.
 *
 */
class FizzBuzzSpec extends FlatSpec with Matchers {

  "FizzBuzzSpec" should "have tests" in {
    true should ===(true)
  }

  "A non special number" should "return itself" in {
    "1" should === (FizzBuzz.start(1))
  }

  "A 3" should "return Fizz" in {
    "Fizz" should === (FizzBuzz.start(3))
  }

  "A 5" should "return Buzz" in {
    "Buzz" should === (FizzBuzz.start(5))
  }

  "A multiple of 3" should "return Fizz" in {
    "Fizz" should === (FizzBuzz.start(6))
  }

  "A multiple of 5" should "return Buzz" in {
    "Buzz" should === (FizzBuzz.start(10))
  }

  "A 15" should "return FizzBuzz" in {
    "FizzBuzz" should === (FizzBuzz.start(15))
  }

  "A multiple of 3 and 5" should "return FizzBuzz" in {
    "FizzBuzz" should === (FizzBuzz.start(45))
  }

}