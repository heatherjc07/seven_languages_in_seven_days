-module(day1).  
-export([count/1]). 
-export([print_match/1]).
-export([word_count/1]).

count(10) -> io:format("~p~n", [10]);
count(N) ->  io:format("~p~n", [N]),
             count(N+1).
%day1:count(0).

print_match({err, Msg}) -> io:format("Error: ~s~n", [Msg]);
print_match(Msg) -> io:format("~s~n",[Msg]).


% day1:print_match("What a brill success").
% day1:print_match({err, "Totally off"}).

token_count([]) -> 0;
token_count(Words) ->
    [_|T] = Words,
    1 + token_count(T).

word_count(Str) ->
    io:format("~p~n",[ token_count(string:tokens(Str, " "))]).
    
%day1:word_count("Miss Polly had a dolly who was sick sick sick").
% 10

% Need to remember to prefix call with module
% Need to remember to use Capital letters for variables