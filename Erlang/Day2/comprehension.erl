% Consider a shopping list that looks like [{item, quantity, price}, ...]. Write a
% list comprehension that builds a list of items of the form [{item, total_price},
% ...], where total_price is quantity times price.


Cart = [{pencil, 4, 0.25}, {pen, 1, 1.20}, {paper, 2, 0.20}].
TotalPrice = [{Product, Price * Quantity} ||{Product, Quantity, Price} <- Cart].