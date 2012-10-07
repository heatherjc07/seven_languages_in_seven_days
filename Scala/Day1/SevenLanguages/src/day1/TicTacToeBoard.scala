package day1

class TicTacToeBoard(board : List[List[String]]){
  val rowNum = board.length
  val colNum = board(0).length

  val players = List("X","O")
  
  def whoWon :String = 
  {
    //Need to have been a minimum of 5 guesses
    if(board.flatten.count(value => value == TicTacToeBoard.EMPTY) > 4)
      return TicTacToeBoard.ONGOING
      
    players.foreach(player => if(winningBoard(player)) return TicTacToeBoard.WINNER.format(player))
    
    if(board.flatten.contains(TicTacToeBoard.EMPTY))
      TicTacToeBoard.ONGOING
    
    TicTacToeBoard.DRAW
  }
  
  def winningBoard(player:String): Boolean = 
  {
    val lines = columns ++ board ++ diagonals
    lines.foreach(line => if(line.forall(value=> value == player)) return true)
    return false
  }
  
  
  //each list within board is a row
  //this builds up columns
  def columns = 
  {
     for(column <- 0 until colNum)
       yield (for(row <- (0 until rowNum))                     
          yield board(row)(column)            ).toList 
  }
  def diagonals =
  {
    List(List(board(0)(0), board(1)(1), board(2)(2)),List(board(0)(2), board(1)(1), board(2)(0)))
  }
  
  override def toString():String = {
    var displayBoard = ""
    for(row <- 0 until rowNum)
    {
      displayBoard = displayBoard + board(row)(0) + "|" + board(row)(1)+ "|" + board(row)(2) + "\n"
      if(row != rowNum -1) displayBoard = displayBoard + "-----\n" 
    }
    displayBoard
  }
}

object TicTacToeBoard{
  val DRAW = "It's a Draw!"
  val ONGOING = "There is no winner yet"
  val WINNER = "Player %s won!"
  val EMPTY = " ";
}




