object day1concepts {


/**
 TYPE INFERENCE
**/
 val a = 1 // No type specified. Compiler determines it is an Int: Int = 1
                                                  //> a  : Int = 1
 val b = 2 // No type specified. Compiler determines it is an Int: Int = 2
                                                  //> b  : Int = 2

  if ( b < a) {
    println("true")
  } else {
    println("false")
  }                                               //> false
 
}