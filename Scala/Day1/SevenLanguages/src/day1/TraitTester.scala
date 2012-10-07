package day1

object TraitTester {
  def main(args: Array[String]): Unit = {
    val flanders = new Ned("Ned Flanders");
    flanders.greet
  }
}

class Character(val name:String) 

trait Nice { 
  def greet() = println("Howdily doodily.") 
} 


class Ned(override val name:String) extends Character(name) with Nice 



