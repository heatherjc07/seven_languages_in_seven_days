fibonacci := method(n,  if(n < 3, 1, fibonacci(n - 1) + fibonacci(n - 2)))


writeln ("Recursive Solution")
println for(i, 1, 20, fibonacci(i) println)


fibonacci2 := method(n,  

val_before_last := 0  
last_val := 0  
total := 1  

for(i, 2, n,     
  val_before_last = last_val    
  last_val = total    
  total = last_val + val_before_last  )  
total)

writeln ("Iterative  Solution")
println for(i, 1, 20, fibonacci2(i) println)                       
     
