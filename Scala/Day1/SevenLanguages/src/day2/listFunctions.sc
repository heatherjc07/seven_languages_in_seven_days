object listFunctions {
  List(1, 2, 3) //determine the contents are Ints, List[Int] = List(1, 2, 3)
                                                  //> res0: List[Int] = List(1, 2, 3)
  List("one", "two", 3) //mixed list so returns a List of type Any
                                                  //> res1: List[Any] = List(one, two, 3)

  Nil                                             //> res2: scala.collection.immutable.Nil.type = List()


  val list = List("January", "February", "March") //> list  : List[java.lang.String] = List(January, February, March)
  list.isEmpty                                    //> res3: Boolean = false
  Nil.isEmpty                                     //> res4: Boolean = true
  
  list.length                                     //> res5: Int = 3
  list.size                                       //> res6: Int = 3
  
  val disneylist = List("mickey", "minnie", "donald")
                                                  //> disneylist  : List[java.lang.String] = List(mickey, minnie, donald)
  disneylist.foreach(disney => println(disney))   //> mickey
                                                  //| minnie
                                                  //| donald
  val drinks = List("vodka", "gin", "beer", "tequilla")
                                                  //> drinks  : List[java.lang.String] = List(vodka, gin, beer, tequilla)

drinks.count(drinks => drinks.size > 3) //3       //> res7: Int = 3

drinks.filter(drinks => drinks.size > 3)          //> res8: List[java.lang.String] = List(vodka, beer, tequilla)

drinks.map(drinks => drinks.size)                 //> res9: List[Int] = List(5, 3, 4, 8)

drinks.forall(drinks => drinks.size > 1)          //> res10: Boolean = true

drinks.exists(drinks => drinks.size > 4)          //> res11: Boolean = true

drinks.exists(drinks => drinks.size > 10)         //> res12: Boolean = false


drinks.sortWith((s, t) => s.charAt(0).toLower < t.charAt(0).toLowerCase)
                                                  //> res13: List[java.lang.String] = List(beer, gin, tequilla, vodka)



drinks.sortWith((s, t) => s.size < t.size)        //> res14: List[java.lang.String] = List(gin, beer, vodka, tequilla)
 
  
  
  
}