object listFunctions {import scala.runtime.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(99); val res$0 = 
  List(1, 2, 3);System.out.println("""res0: List[Int] = """ + $show(res$0));$skip(67); val res$1 =  //determine the contents are Ints, List[Int] = List(1, 2, 3)
  List("one", "two", 3);System.out.println("""res1: List[Any] = """ + $show(res$1));$skip(7); val res$2 =  //mixed list so returns a List of type Any

  Nil;System.out.println("""res2: scala.collection.immutable.Nil.type = """ + $show(res$2));$skip(52); 


  val list = List("January", "February", "March");System.out.println("""list  : List[java.lang.String] = """ + $show(list ));$skip(15); val res$3 = 
  list.isEmpty;System.out.println("""res3: Boolean = """ + $show(res$3));$skip(14); val res$4 = 
  Nil.isEmpty;System.out.println("""res4: Boolean = """ + $show(res$4));$skip(17); val res$5 = 
  
  list.length;System.out.println("""res5: Int = """ + $show(res$5));$skip(12); val res$6 = 
  list.size;System.out.println("""res6: Int = """ + $show(res$6));$skip(57); 
  
  val disneylist = List("mickey", "minnie", "donald");System.out.println("""disneylist  : List[java.lang.String] = """ + $show(disneylist ));$skip(48); 
  disneylist.foreach(disney => println(disney));$skip(56); 
  val drinks = List("vodka", "gin", "beer", "tequilla");System.out.println("""drinks  : List[java.lang.String] = """ + $show(drinks ));$skip(45); val res$7 = 

drinks.count(drinks => drinks.size > 3);System.out.println("""res7: Int = """ + $show(res$7));$skip(42); val res$8 =  //3

drinks.filter(drinks => drinks.size > 3);System.out.println("""res8: List[java.lang.String] = """ + $show(res$8));$skip(35); val res$9 = 

drinks.map(drinks => drinks.size);System.out.println("""res9: List[Int] = """ + $show(res$9));$skip(42); val res$10 = 

drinks.forall(drinks => drinks.size > 1);System.out.println("""res10: Boolean = """ + $show(res$10));$skip(42); val res$11 = 

drinks.exists(drinks => drinks.size > 4);System.out.println("""res11: Boolean = """ + $show(res$11));$skip(43); val res$12 = 

drinks.exists(drinks => drinks.size > 10);System.out.println("""res12: Boolean = """ + $show(res$12));$skip(75); val res$13 = 


drinks.sortWith((s, t) => s.charAt(0).toLower < t.charAt(0).toLowerCase);System.out.println("""res13: List[java.lang.String] = """ + $show(res$13));$skip(46); val res$14 = 



drinks.sortWith((s, t) => s.size < t.size);System.out.println("""res14: List[java.lang.String] = """ + $show(res$14))}
 
  
  
  
}