package day1

// note attributes in class declaration 
class Person(firstName: String,lastName: String) { 

  // constructor  
  var fullName:String = firstName + " " + lastName; 

  // Auxiliary Constructors/alternate constructors 
  def this(firstName: String, lastName: String, middleName: String) { 
    //call default constructor 
    this(firstName, lastName) 
    this.fullName = firstName + " " + middleName + " " + lastName; 
  } 

  def talk(message: String) = println(fullName + " says " + message) 
  def id(): String = fullName; 

} 
