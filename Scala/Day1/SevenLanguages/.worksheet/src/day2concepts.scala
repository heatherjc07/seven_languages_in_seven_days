object day2concepts {import scala.runtime.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(79); 
 
 //example square functions
 def sqr(x:Int):Int = x * x;System.out.println("""sqr: (x: Int)Int""");$skip(49); 

 //infered return type
 def sqr2(x:Int) = x * x;System.out.println("""sqr2: (x: Int)Int""");$skip(9); val res$0 = 

 sqr(2);System.out.println("""res0: Int = """ + $show(res$0));$skip(9); val res$1 = 
 sqr2(2);System.out.println("""res1: Int = """ + $show(res$1))}
}