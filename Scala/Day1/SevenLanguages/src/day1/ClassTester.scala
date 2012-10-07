package day1

object ClassTester {

  def main(args: Array[String]): Unit = {
    val heatherCampbell = new Person("Heather", "Campbell") 
    heatherCampbell.talk("Working on day 1 of Scala") 
    println("ID: " + heatherCampbell.id) 

    val heatherJoanneCampbell = new Person("Heather", "Campbell", "Joanne") 
    heatherJoanneCampbell.talk("Working on day 1 of Scala") 
    println("ID: " + heatherJoanneCampbell.id)

    val heatherCampbellEmp = new Employee("Heather", "Campbell", 11112222) 
    heatherCampbellEmp.talk("Working on day 1 of Scala") 
    println("ID: " + heatherCampbellEmp.id)

  }

}