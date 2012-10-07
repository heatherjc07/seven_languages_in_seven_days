object setFunctions {import scala.runtime.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(63); 
val colours = Set("red", "green", "blue");System.out.println("""colours  : scala.collection.immutable.Set[java.lang.String] = """ + $show(colours ));$skip(20); val res$0 = 

colours + "yellow";System.out.println("""res0: scala.collection.immutable.Set[java.lang.String] = """ + $show(res$0));$skip(18); val res$1 = 
colours - "green";System.out.println("""res1: scala.collection.immutable.Set[java.lang.String] = """ + $show(res$1));$skip(36); val res$2 = 

colours ++ Set("orange", "purple");System.out.println("""res2: scala.collection.immutable.Set[java.lang.String] = """ + $show(res$2));$skip(30); val res$3 = 
colours -- Set("red", "blue");System.out.println("""res3: scala.collection.immutable.Set[java.lang.String] = """ + $show(res$3));$skip(30); val res$4 = 

Set(1, 2, 3) == Set(3, 2, 1);System.out.println("""res4: Boolean = """ + $show(res$4));$skip(32); val res$5 = 

List(1, 2, 3) == List(3, 2, 1);System.out.println("""res5: Boolean = """ + $show(res$5))}
 
}