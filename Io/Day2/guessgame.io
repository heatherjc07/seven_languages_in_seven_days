toGuess := 4

guessCount := 0
prevDiff := nil
currDiff := nil

while(guessCount < 10, 
  guessCount = guessCount + 1  
  currGuess := File standardInput readLine("Enter your guess: ") asNumber() 

  currDiff := (toGuess - currGuess) abs  
  if(currDiff == 0) then (
    guessCount = 10
  ) else (
    if (prevDiff == nil) then("Try again" println) elseif(currDiff == prevDiff) then ("Same" println) elseif(currDiff < prevDiff) then ("Hotter" println) else("Colder" println)
    prevDiff = currDiff
  )
)

if(currDiff == 0, "Correct!", "Sorry, you ran out of guesses.") println