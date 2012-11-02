-module(buy).
-export([purchase/0]).

purchase() ->
  receive
     finished ->
            io:format("purchases finished~n", []);
     {purchase, Item, Quantity} ->
            io:format("purchase received: ~p ~p ~n",[Quantity, Item]),
            purchase()
end.