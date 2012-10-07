object mapFunction {import scala.runtime.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(107); 
  
  val capitals = Map("Ireland" -> "Dublin", "France" -> "Paris", "Italy" -> "Rome");System.out.println("""capitals  : scala.collection.immutable.Map[java.lang.String,java.lang.String] = """ + $show(capitals ));$skip(21); val res$0 = 
  capitals("France")



import scala.collection.mutable.HashMap;System.out.println("""res0: java.lang.String = """ + $show(res$0));$skip(80); 


val map = new HashMap[Int, String];System.out.println("""map  : scala.collection.mutable.HashMap[Int,String] = """ + $show(map ));$skip(20); val res$1 = 

map += 4 -> "four";System.out.println("""res1: mapFunction.map.type = """ + $show(res$1));$skip(21); val res$2 = 

map += 8 -> "eight";System.out.println("""res2: mapFunction.map.type = """ + $show(res$2))}
  
}