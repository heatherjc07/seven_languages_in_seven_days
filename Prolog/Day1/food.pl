 food_type(cheddar, cheese). 
 food_type(spam, meat). 
 food_type(sausage, meat). 
 food_type(ham, meat). 
 food_type(banoffee, dessert). 
 flavour(sweet, dessert). 
 flavour(savoury, meat). 
 flavour(savoury, cheese). 
 food_flavour(X, Y) :- food_type(X, Z), flavour(Y,Z). 
