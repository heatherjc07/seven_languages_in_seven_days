package day1

class Employee(val firstName: String,val lastName: String, 
 val number: Int) extends Person(firstName, lastName) { 

 //explicitly state method you are overriding 
 // helps guard against overriding or failing to override because of spelling 
 override def talk(message: String) { 
   println(fullName + " with number " + number + " says " + message) 
 } 

 override def id():String = number.toString 

} 
