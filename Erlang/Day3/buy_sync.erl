-module(buy_sync).
-export([purchase/0, purchaser/3]).
purchase() ->
  receive
     finished ->
            io:format("purchases finished~n", []);
     {From,{purchase, Item, Quantity}} ->
            io:format("purchase received: 
              ~p ~p ~n", [Quantity, Item]),
     From ! printed,
            purchase();
     _ -> io:format("wrong format~n", [])
end.

purchaser(To, Item, Quantity) ->
  To ! {self(), {purchase, Item, Quantity }},
  receive
     printed ->
           io:format("Purchase Printed~n", [])

end.