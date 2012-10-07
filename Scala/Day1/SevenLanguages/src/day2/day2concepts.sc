object day2concepts {
 
 //example square functions
 def sqr(x:Int):Int = x * x                       //> sqr: (x: Int)Int

 //infered return type
 def sqr2(x:Int) = x * x                          //> sqr2: (x: Int)Int

 sqr(2)                                           //> res0: Int = 4
 sqr2(2)                                          //> res1: Int = 4
}