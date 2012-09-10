TwoDList := Object clone do (
  init := method(
    self lists := list()
  )
  
  dim := method(x, y,
    self lists preallocateToSize(y)
    for(i, 0, y - 1, self lists append(list() preallocateToSize(x)))
    self
  )
  
  set := method(x, y, value,
    self lists at(y) atInsert(x, value)
  )
  
  get := method(x, y,
    self lists at(y) at(x)
  )
  
  transpose := method(
    transposedList := TwoDList clone dim(self lists size, self lists at(0) size)
    self lists foreach(y, subList, 
      subList foreach(x, value,
        transposedList set(y, x, value)
      )
    )
    transposedList
  ) 
  
  println := method(
    self lists foreach(y, subList, 
      subList foreach(x, value, 
        if(x == 0 or x == subList size, "|" print)
        " #{get(x, y)} |" interpolate print        
      )
      "" println      
    )
  )
  
  toFile := method(name,
    File with(name) open write(self serialized) close
  )
  
  fromFile := method(name,
    doRelativeFile(name)
  ) 
)

list = TwoDList clone dim(2, 3)
list set(0, 0, "Apple")
list set(1, 0, "Banana")
list set(0, 1, "Damson")
list set(1, 1, "Elderflower")
list set(0, 2, "Grapefruit")
list set(1, 2, "Kiwi")

list get(0, 0) println
list get(1, 0) println
list get(0, 1) println
list get(1, 1) println
list get(0, 2) println
list get(1, 2) println

transposedList := list transpose

transposedList toFile("transposed.txt")

transposedListFromFile := TwoDList fromFile("transposed.txt")

"2x3 list:" println
list println

"Transposed 3x2 list:" println
transposedList println

"Transposed 3x2 list from file:" println
transposedListFromFile println