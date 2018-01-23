package app

import scala.io.StdIn


class Person(name : String, age : Int) {

  private val years : String = if(age == 1) "year" else "years"

  def speak() : String = {

    if (name == "doug") {

      "You don't get a hello!"

    }  else {

      s"Hello $name, you are $age $years old."
    }
  }
}

object GreeterApplication extends App {

object Prompt {

  def ask(message : String) = StdIn.readLine(message)
}

  val name = Prompt.ask("What is your name?")
  val age = Prompt.ask("How old are you?")
  val person = new Person(name, age.toInt)

  println(person.speak())

}
