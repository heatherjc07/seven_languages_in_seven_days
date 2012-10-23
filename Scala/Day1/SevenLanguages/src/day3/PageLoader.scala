package day3

import scala.io._ 
import scala.actors._ 
import Actor._ 

//computes the size of the page given a URL 
object PageLoader { 
  def getPageSize(url : String) = Source.fromURL(url).mkString.length  

//urls we are going to visit 
val urls = List("http://www.amazon.com/", 
                "http://www.heatherjcampbell.com/", 
                "http://www.google.com/", 
                "http://www.cnn.com/" ) 

//time each web request 
def timeMethod(method: () => Unit) = { 
  val start = System.nanoTime 
  method() 
  val end = System.nanoTime 
  println("Method took " + (end - start)/1000000000.0 + " seconds.") 
} 

//method that gets the size of each page in turn 
def getPageSizeSequentially() = { 
  for(url <- urls) { 
    println("Size for " + url + ": " + PageLoader.getPageSize(url)) 
  } 
} 

//method that gets the size of each page concurrently 
def getPageSizeConcurrently() = { 
  val caller = self 
  for(url <- urls) { 
   actor { caller ! (url, PageLoader.getPageSize(url)) } 
  } 

  for(i <- 1 to urls.size) { 
    receive { 
     case (url, size) => 
     println("Size for " + url + ": " + size) 
    } 
  } 
} 
}

object PageLoaderTester {

  def main(args: Array[String]): Unit = {
   println("Sequential run:") 
   PageLoader.timeMethod {  PageLoader.getPageSizeSequentially } 
   println("Concurrent run")
   PageLoader.timeMethod {  PageLoader.getPageSizeConcurrently } 
  }
}