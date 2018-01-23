package app

import scala.io.StdIn


class Person(name : String) {

  def speak() : String = {

    if (name == "doug") {

      "You don't get a hello!"

    }  else {

      "Hello " + name
    }
  }
}

object GreeterApplication extends App {

object Prompt {

  def ask(message : String) = StdIn.readLine(message)
}

  val name = StdIn.readLine("What is your name?")

  val p = new Person(name)

  println(p.speak())

}
