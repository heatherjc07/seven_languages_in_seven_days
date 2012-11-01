% Consider a list of keyword-value tuples, such as [{erlang, "a functional language"},
% {ruby, "an OO language"}]. Write a function that accepts the list and
% a keyword and returns the associated value for the keyword.

-module(key).
-export([get_by_key/2]).

get_by_key(List, Key) ->
 [{ _, MatchVal} | _ ] = lists:filter(fun({CurrentKey, _}) -> CurrentKey == Key end, List),  MatchVal.