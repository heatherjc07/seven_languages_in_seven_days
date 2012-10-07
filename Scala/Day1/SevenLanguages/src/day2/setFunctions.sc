object setFunctions {
val colours = Set("red", "green", "blue")         //> colours  : scala.collection.immutable.Set[java.lang.String] = Set(red, green,
                                                  //|  blue)

colours + "yellow"                                //> res0: scala.collection.immutable.Set[java.lang.String] = Set(red, green, blue
                                                  //| , yellow)
colours - "green"                                 //> res1: scala.collection.immutable.Set[java.lang.String] = Set(red, blue)

colours ++ Set("orange", "purple")                //> res2: scala.collection.immutable.Set[java.lang.String] = Set(purple, blue, o
                                                  //| range, green, red)
colours -- Set("red", "blue")                     //> res3: scala.collection.immutable.Set[java.lang.String] = Set(green)

Set(1, 2, 3) == Set(3, 2, 1)                      //> res4: Boolean = true

List(1, 2, 3) == List(3, 2, 1)                    //> res5: Boolean = false
 
}