package day2
/*
Write a Censor trait with a method that will replace the curse words Shoot
and Darn with Pucky and Beans alternatives. Use a map to store the
curse words and their alternatives
 */
trait Censor {
	  import scala.io.Source
	  
      var curseWords = Map(       
          "Shoot" -> "Pucky",        
          "Darn" -> "Beans")
 
      def setCurseWords(newCurseWords : Map[String, String]) = curseWords = newCurseWords    
     
      def setCurseWordsFromFile =
      {
    	  Source.fromFile("curseWords.txt").getLines.foreach 
    	  { 
    	    line =>    val curseWordPair = line.split(':')    
            curseWords += curseWordPair(0) -> curseWordPair(1)    
    	 }       
      }
      
      def cleanUp(dirtySentence: String): String=
      {
        var cleanSentence = dirtySentence;
        curseWords.foreach{case (key, value) =>
          cleanSentence = cleanSentence.replace(key,value)}
        cleanSentence
      }
}

class CleanString extends Censor

object CleanStringTester {
    def main(args: Array[String]) {
    val rudeStr = "Shoot, my Darn Scala code isn't working!"
    val clean = new CleanString
    println("Feeling Rude: ")
    println(rudeStr)
    println("keepingItClean: ")
    println(clean.cleanUp(rudeStr))
    
    val rudeStr2 = "Blast, my Bloody Scala code isn't working!"
    clean.setCurseWordsFromFile
    println("Feeling Rude: ")
    println(rudeStr2)
    println("keepingItClean: ")
    println(clean.cleanUp(rudeStr2))    
    }
  }
