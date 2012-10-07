object day1concepts {import scala.runtime.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(122); 


/**
 TYPE INFERENCE
**/
 val a = 1;System.out.println("""a  : Int = """ + $show(a ));$skip(75);  // No type specified. Compiler determines it is an Int: Int = 1
 val b = 2;System.out.println("""b  : Int = """ + $show(b ));$skip(73);  // No type specified. Compiler determines it is an Int: Int = 2

  if ( b < a) {
    println("true")
  } else {
    println("false")
  }}
 
}