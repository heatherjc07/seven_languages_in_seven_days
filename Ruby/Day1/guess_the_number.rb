random_number = rand(10)
 guess = 11
 while guess != random_number do
     print "Pick a number between 1 and 10: "
     guess = gets.to_i
   
    p "your guess #{guess} is too big" if random_number < guess
    p "your guess #{guess} is too small" if random_number > guess
 end 

 p "Match! The random number is #{random_number}"