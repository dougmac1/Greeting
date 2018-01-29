//object game extends App {
//
//  val Michael: Character = new Mage(100, new Mana(150), new Point(6,9))
//  val Doug: Character = new Cleric(100, )
//
//  println(Michael.attack())
//}
//class Point(x: Int , y: Int)
//
//abstract class Resource(amount: Int)
//
//class Mana(amount: Int) extends Resource(amount)
//class Rage(amount: Int) extends Resource(amount)
//class Gold(amount: Int) extends Resource(amount)
//
//abstract class Character(health: Int , resource: Resource , point: Point) {
//  def move(pos: Point) : Point = pos
//  def attack() : String
//}
//class Mage(health: Int , resource: Mana , point: Point) extends Character(health , resource , point) {
//  //  override def move(pos: Point) = pos
//  override def attack(): String = "I cast a spell"
//}
//class Cleric(health: Int , resource: Mana , point: Point) extends Character(health, resource, point) {
//  //  override def move(pos: Point) = pos
//  override def attack(): String = "I am healing"
//}
//class Warrior(health: Int , resource: Resource , point: Point) extends Character(health, resource, point) {
//  //  override def move(pos: Point): Point = pos
//  override def attack(): String = "I swinging my axe"
//}
//abstract class Enemy(health: Int , resource: Gold , point: Point) extends Character(health, resource, point){
//
//}
//class DemonDog(health: Int , resource: Gold , point: Point) extends Enemy(health, resource, point) {
//  override def move(pos: Point): Point = super.move(pos)
//  override def attack(): String = "Bite!"
//}
//
//abstract class HumanEnemy(health: Int , resource: Gold , point: Point) extends Enemy(health, resource, point){
//
//}
//class NightBourneElf(health: Int , resource: Gold , point: Point) extends HumanEnemy(health, resource, point){
//  override def move(pos: Point): Point = super.move(pos)
//  override def attack(): String = "I cast a void spell"
//}
//class Ork(health: Int , resource: Gold , point: Point) extends HumanEnemy(health, resource, point){
//  override def move(pos: Point): Point = super.move(pos)
//  override def attack(): String = "Swing sword"
//}
