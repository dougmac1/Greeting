package app

import scala.io.StdIn

object GreeterApplication extends App {

  def greet(name : String) : Unit = {
    if (name == "adam") {
      println("You don't get a hello!")
    } else {
      println("Hello")
    }
  }

  val name = StdIn.readLine("What is your name? ")

  greet(name)
}