package day1

import org.scalatest.FunSuite

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class TicTacToeBoardTestSuite extends FunSuite {


  
  test("None Filled") {
      assert(new TicTacToeBoard(List(List(" "," "," "),
                                      List(" "," "," "),    
                                      List(" "," "," "))).whoWon == "There is no winner yet")
  }
    
  test("X col one") {
      assert(new TicTacToeBoard(List(List("X","O","O"),
                                      List("X","X","O"),    
                                      List("X","O","X"))).whoWon == "Player X won!")
  }
  
  test("O col one") {
      assert(new TicTacToeBoard(List(List("O","X","X"),
                                      List("O","O","X"),    
                                      List("O","X","O"))).whoWon == "Player O won!")
  }
 
  test("O row one") {
      assert(new TicTacToeBoard(List(List("O","O","O"),
                                      List("X","X","O"),    
                                      List("X","O","X"))).whoWon == "Player O won!")
  }
  
  test("X row one") {
      assert(new TicTacToeBoard(List(List("X","X","X"),
                                      List("O","O","X"),    
                                      List("O","X","O"))).whoWon == "Player X won!")
  }
  
  test("O diag one") {
      assert(new TicTacToeBoard(List(List("X","O","O"),
                                      List("O","X","O"),    
                                      List("X","O","X"))).whoWon == "Player X won!")
  }
  
  test("X diag one") {
      assert(new TicTacToeBoard(List(List("O","X","X"),
                                      List("X","O","X"),    
                                      List("O","X","O"))).whoWon == "Player O won!")
  }
  
  test("A draw") {
      assert(new TicTacToeBoard(List(List("O","X","X"),
                                      List("X","O","O"),    
                                      List("X","O","X"))).whoWon == "It's a Draw!")
  }
}