package Models

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
