package day3

import scala.io._
import scala.actors._
import Actor._
import scala.util.matching.Regex
import java.nio.charset.MalformedInputException
import java.io.IOException

//computes the size of the page given a URL 
object PageLoader3 { 
  
 val linkMatch = "<a\\s[^>]*href\\s*=\\s*\"([^\"]*)\"[^>]*>(.*?)</a>".r //creates a regex from a String

  
  def getPageSize(url : String) = {
     val siteText = getSiteText(url)
     siteText.length
    }
  
 def getSiteText(url : String) = {
   try
   {
     Source.fromURL(url)("UTF-8").mkString
   }
   catch
   {
     case m:MalformedInputException => "" //ignoring non UTF-8
     case i:IOException => "" //if we can't read it ignore
     case e:Exception => ""
   }
 }
  def getNumPageLinks(url : String) = {
    val siteText = Source.fromURL(url).mkString
    linkMatch.findAllIn(siteText).length
  }
  
  def getListOfLinks(url : String) = {
    val siteText = Source.fromURL(url).mkString
    linkMatch.findAllIn(siteText).matchData.toList.map(_.group(1))
    //Using the Regex class  group method
    //we're matching the first group which gives us the url
  }

  def normaliseLink(link: String, parent: String) = {
    //if it doesn't start with http prefixing with parent url
    if(link.indexOf("http") != 0)
      parent + link
    else
        link
  }
  def totalSize(size: Int, links: List[String], parent: String): Int = 
    links match {  case Nil => size  
                   case head :: tail => totalSize(size + PageLoader3.getPageSize(normaliseLink(head,parent)), tail, parent)  }
  
//urls we are going to visit 
val urls = List("http://www.heatherjcampbell.com",
				"http://www.amazon.com", 
                "http://www.google.com", 
                "http://www.cnn.com") 

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
    val pageSize = PageLoader3.getPageSize(url)
    println("Size for " + url + ": " + pageSize) 
    println("Number of links " + url + ": " + PageLoader3.getNumPageLinks(url))
    println("Total size: " + PageLoader3.totalSize(pageSize, PageLoader3.getListOfLinks(url), url))
  } 
} 



//method that gets the size of each page concurrently 
def getPageSizeConcurrently() = { 
  val caller = self 
  for(url <- urls) { 
   actor { 
            val pageSize = PageLoader3.getPageSize(url)
            val numLinks = PageLoader3.getNumPageLinks(url)
            
            val linkActor = self      
            
            val links = PageLoader3.getListOfLinks(url)
            links.foreach(link => actor { linkActor ! PageLoader3.getPageSize(normaliseLink(link,url)) })      
            var totalSize = pageSize      
            for (i <- 1 to links.length) {        
              receive { case linkSize: Int => totalSize += linkSize }      
            }
            caller ! (url, pageSize,numLinks,totalSize)
   		 } 
  } 

  for(i <- 1 to urls.size) { 
    receive { 
     case (url, size, numLinks,totalSize) => 
      {
        println("Size for " + url + ": " + size) 
        println("Number of Links for " + url + ": " + numLinks) 
        println("Total size: " + totalSize)
      }
    } 
  } 
} 
}

object PageLoader3Tester {

  def main(args: Array[String]): Unit = {
   //println("Sequential run:") 
   //PageLoader3.timeMethod {  PageLoader3.getPageSizeSequentially } 
   println("Concurrent run")
   PageLoader3.timeMethod {  PageLoader3.getPageSizeConcurrently }
  }
}