object mapFunction {
  
  val capitals = Map("Ireland" -> "Dublin", "France" -> "Paris", "Italy" -> "Rome")
                                                  //> capitals  : scala.collection.immutable.Map[java.lang.String,java.lang.String
                                                  //| ] = Map(Ireland -> Dublin, France -> Paris, Italy -> Rome)
  capitals("France")                              //> res0: java.lang.String = Paris



import scala.collection.mutable.HashMap


val map = new HashMap[Int, String]                //> map  : scala.collection.mutable.HashMap[Int,String] = Map()

map += 4 -> "four"                                //> res1: mapFunction.map.type = Map(4 -> four)

map += 8 -> "eight"                               //> res2: mapFunction.map.type = Map(8 -> eight, 4 -> four)
  
}