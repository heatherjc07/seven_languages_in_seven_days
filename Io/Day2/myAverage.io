List myAverage := method ( total := 0
 self foreach(i, item, if(item type == "Number", total = total + item, Exception raise("#{item} is not a Number" interpolate)))  
 total / (self size)
 )
 
 list(5,2,3,1) myAverage println
 list() myAverage println 
 list(5,"t",6,7) myAverage println 