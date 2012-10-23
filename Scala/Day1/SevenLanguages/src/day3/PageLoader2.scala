package day3

import scala.io._
import scala.actors._
import Actor._ 
import scala.util.matching.Regex

//computes the size of the page given a URL 
object PageLoader2 { 
  
 val linkMatch = "<a\\s[^>]*href\\s*=\\s*\"([^\"]*)\"[^>]*>(.*?)</a>".r //creates a regex from a String
  
  def getPageSize(url : String) = {
     val siteText = Source.fromURL(url).mkString
     siteText.length
    }
  
  def getNumPageLinks(url : String) = {
    val siteText = Source.fromURL(url).mkString
    linkMatch.findAllIn(siteText).length
  }

//urls we are going to visit 
val urls = List("http://www.amazon.com/", 
               "http://www.heatherjcampbell.com", 
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
    println("Size for " + url + ": " + PageLoader2.getPageSize(url)) 
    println("Number of links " + url + ": " + PageLoader2.getNumPageLinks(url))
  } 
} 

//method that gets the size of each page concurrently 
def getPageSizeConcurrently() = { 
  val caller = self 
  for(url <- urls) { 
   actor { caller ! (url, PageLoader2.getPageSize(url)
                    ,PageLoader2.getNumPageLinks(url))
   		 } 
  } 

  for(i <- 1 to urls.size) { 
    receive { 
     case (url, size, numLinks) => 
      {
        println("Size for " + url + ": " + size) 
        println("Number of Links for " + url + ": " + numLinks) 
      }
    } 
  } 
} 
}

object PageLoader2Tester {

  def main(args: Array[String]): Unit = {
   println("Sequential run:") 
   PageLoader2.timeMethod {  PageLoader2.getPageSizeSequentially } 
   println("Concurrent run")
   PageLoader2.timeMethod {  PageLoader2.getPageSizeConcurrently } 

  }
}