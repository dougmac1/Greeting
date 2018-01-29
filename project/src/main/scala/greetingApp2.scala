package scala.app

import scala.io.StdIn


abstract class BankAccount(accountNumber : String, val balance: Double) {

  def withdraw(amount: Double) : BankAccount

  def deposit(amount: Double) : BankAccount

  override def toString: String = s"Account number: $accountNumber balance: $balance"

}

class SavingsAccount(accountNumber: String,
                     balance : Double) extends BankAccount(accountNumber,balance) {

  override def deposit(amount: Double): BankAccount = new SavingsAccount(accountNumber, balance + amount)

  override def withdraw(amount: Double): BankAccount = new SavingsAccount(accountNumber, balance - amount)

}

class cashISAAccount(accountNumber: String, balance: Double) extends BankAccount(accountNumber, balance) {

  private val depositThreshold: Double = 200.00
  override def deposit(amount: Double) = if (amount > depositThreshold) {
    val difference = amount - depositThreshold
    println(s"You cant deposit more than $depositThreshold, Excess: $difference")
    new cashISAAccount(accountNumber, balance + depositThreshold)
  } else {
    new cashISAAccount(accountNumber, balance + amount)
  }

  override def withdraw(amount: Double) = {
    println("You cant withdraw")
    this
  }
}

class Person(name : String, age: Int, private val bankAccount: BankAccount) {

  def this(name : String, age : Int) = this(name, age, new SavingsAccount("123", 50.00))
  def this(name : String) = this(name, age = 0, new SavingsAccount("123", 0.00))

  private val years : String = if(age == 1) "year" else "years"

  def speak() : String = {
    if (name == "adam") {
      "You don't get a hello."
    } else {
      s"Hello $name, you are $age $years old. \n You have $bankAccount in your account."
    }
  }

}

object Prompt {

  def ask(message : String) : String = StdIn.readLine(message)

}

object GreetingsApplication extends App {


  val cashISA = new cashISAAccount("12345", 0.00)
  val isaDeposited = cashISA.deposit(1000.00)
  val withdrawFromISA = isaDeposited.withdraw(200.00)
  val personWithCashISA = new Person("Loyal customer", 56, withdrawFromISA)

  val savingsAccount = new SavingsAccount("12345", 100.00)
  val savingsPlus100 = savingsAccount.deposit(100.00)


  val name : String = Prompt.ask("What is your name? ")
  val age : String = Prompt.ask("How old are you? ")

  val p : Person = new Person(name, age.toInt)
  val child = new Person("David")

  println(p.speak())


}


































//package app
//
//import scala.io.StdIn
//
//abstract class BankAccount(accountNumber : String, val balance: Double) {
//
//  def withdraw(amount: Double)  : BankAccount
//  def deposit(amount: Double) : BankAccount
//
//}
//
//class SavingsAccount(accountNumber: String, balance : Double) extends BankAccount(accountNumber, balance) {
//
//  override def deposit(amount: Double): SavingsAccount = new SavingsAccount(accountNumber, balance + amount)
//  override def withdraw(amount: Double): SavingsAccount = new SavingsAccount(accountNumber, balance - amount)
//
//}
//class cashISA(accountNumber: String, balance : Double) extends BankAccount(accountNumber, balance){
//  override def deposit(amount: Double): cashISA = new cashISA(accountNumber, balance + amount)
//  override def withdraw(amount: Double): cashISA = {
//    println("Your account has low funds")
//    this
//  }
//}
//
//
//
//class Person(name : String , age: Int) {
//
//  private val years : String = if(age == 1) "year" else "years"
//
//  def speak(): String = {
//    if (name == "Jeff") {
//      "You don't get a hello."
//    } else {
//      "Hello " + name + " " + "you are" + " " + age + " " + years + " old"
//    }
//  }
//}
//
//object Prompt {
//
//  def ask(message : String) = StdIn.readLine(message)
//
//
//}
//
//object GreeterApplication extends App {
//
//  val cashISA = new cashISA("12345" , 100)
//  val cashISA100 = cashISA.withdraw(100)
//
//  val savingsAccount = new SavingsAccount("12345", 100.00)
//  val savingsPlus100 = savingsAccount.deposit(50.00)
//
//  val name = Prompt.ask("What is your name? ")
//  val age = Prompt.ask("What is your age? ")
//
//  val p : Person = new Person(name, age.toInt)
//  println(p.speak())
//  println(savingsAccount.balance)
//
//}
//
//
//class PersonP(name : String, age : Int)
//{
//  private val years : String = if(age == 1) "year" else "years"
//
//  def speak() : String = {
//
//    if (name == "doug") {
//
//      "You don't get a hello!"
//
//    }  else {
//
//      s"Hello $name, you are $age $years old."
//    }
//  }
//
//
//
//
////object GreeterApplication extends App {
////
////object Prompt {
////
////  def ask(message : String) = StdIn.readLine(message)
////}
////
////  val name = Prompt.ask("What is your name?")
////  val age = Prompt.ask("How old are you?")
////  val person = new Person(name, age.toInt)
////
////  println(person.speak())
////
//}
//
//
//
//
//
