package day1

object CompanionTester {

  def main(args: Array[String]): Unit = {
    //without companion object need to do 
    val James = new Worker("James") 
    James.talk("I'm only days old")
    
    //with companion object can do 
    val Luke = Worker("Luke")
    Luke.talk("I'm one")
  }

}

class Worker(val name: String) { 

  def talk(message: String) = println(name + " says " + message) 

  def id(): String = name 

} 


//companion object with an apply factory method 

object Worker{ 

 def apply(name: String)=new Worker(name) 

} 
 
