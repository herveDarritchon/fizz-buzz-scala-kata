package fr.hervedarritchon.scala.kata

import com.typesafe.scalalogging.LazyLogging
import fr.hervedarritchon.scala.kata.fizzbuzz.FizzBuzz

/**
 * Created by Hervé Darritchon on 22/05/15.
 *
 */
class KataApplication extends LazyLogging {

  def main(args: Array[String]): Unit = {
    logger.debug("Kata starts here.")
    FizzBuzz.start (args(0).toInt)
    logger.debug("Kata stops here.")
  }
}
