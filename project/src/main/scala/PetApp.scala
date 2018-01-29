object PetApp extends App {


    abstract class Animal(name : String) {
      def speak: String
    }


    class Cat (name : String) extends Animal(name) {
      override def speak: String = "meow"

    }

    class Dog (name : String) extends Animal(name) {
      override def speak: String = "woof"

    }

    class BorderTerrier (name : String) extends Dog(name) {

      def hunt = "I am hunting rats"

    }

    class Tiger (name: String) extends Cat(name) {

      def chase = "I am coming to get you"
    }

    class Wolf (name: String) extends Dog(name) {
      override def speak: String = "howl"
    }

    class Meowth (name : String, coins : Int, rocket : Boolean) extends Cat(name) {

      override def speak: String = s"I'm $name, I have $coins $single, " + rocketString

      def rocketString: String = if (coins >= 10) "You are in team rocket" else "I am not worthy enough of #ROCKET"

      private val single = if(coins < 2) "coin" else "coins"

    }
    class Puma (name : String, speed : Int, spots : Boolean, amount : Int) extends Cat(name) {

      private val spotString = if (spots) "I have some spots" else "I have lots spots"

      def amountString = if (amount >= 100) "You  have 100 or more spots, you are a male Puma"
      else "You have less than 100 spots, you are a female Puma"


      override def speak: String = s"I'm $name, I travel at $speed mph, $spotString, $amountString"
    }
  //

    class Lion (name: String, speed : Int, gender : Boolean) extends Cat(name) {

      private val genderString = if (gender) "I am Male" else "I am female"

      override def speak: String = s"I'm $name, I travel at $speed mph & $genderString"
    }


    val jess : Animal = new Cat("jess")
    val lassie : Animal = new Dog("lassie")
    val sirius : Animal = new Wolf("sirius")
    val meowth : Animal = new Meowth("meowth", 1, true)
    val michael : Animal = new Puma("michael", 50, true, 70)
    val connor : Animal = new Puma("connor", 70, false, 70)
    val adam : Animal = new Dog("adam")
    val terry : BorderTerrier = new BorderTerrier("terry")
    val hugo : Tiger = new Tiger("hugo")
    val matty : Animal = new Lion("matty", 35, true)


    println(jess.speak)
    println(lassie.speak)
    println(sirius.speak)
    println(meowth.speak)
    println(michael.speak)
    println(connor.speak)
    println(adam.speak)
    println(s"${terry.speak} ${terry.hunt}")
    println(s"${hugo.speak} ${hugo.chase}")
    println(matty.speak)
}



