package Models

class Person(name : String, age: Int, private val Accounts: Seq[BankAccount] = Nil) {


  def this(name : String, age : Int) = this(name, age, List(new SavingsAccount("123", 50.00)))
  def this(name : String) = this(name, age = 0, List(new SavingsAccount("123", 0.00)))

  private val years : String = if(age == 1) "year" else "years"
  private val excludedNames : List[String] = List("adam", "connor", "matty", "michael", "pan")

  def speak() : String = {
    if (excludedNames.contains(name)) {
      "You don't get a hello."
    } else {
      s"Hello $name, you are $age $years old. \n You have $Accounts in your account."
    }
  }
}
