/* Evaluate 1 + 1 and then 1 + "one". Is Io strongly typed or weakly typed?
Support your answer with code.*/

(1 + 1) println // 2
//1 + "one" println // Exception: argument 0 to method '+' must be a Number, not a 'Sequence'
//Therefore Strongly Typed

/*Is 0 true or false? What about the empty string? Is nil true or false?
Support your answer with code.*/

if(0) println   
if("") println  
if(nil) println 

/*How can you tell what slots a prototype supports?*/
Vehicle := Object clone
Vehicle description := "Something to take you places"
Vehicle slotNames println

/*What is the difference between = (equals), := (colon equals), and ::= (colon
colon equals)? When would you use each one?

::=  Creates slot, creates setter, assigns value 
:=   Creates slot, assigns value 
=    Assigns value to slot if it exists, otherwise raises exception 
*/
