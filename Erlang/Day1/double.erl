-module(double).
-export([double_all/1]).
double_all([]) -> [];
double_all([First|Rest]) -> [First + First|double_all(Rest)].

%Numbers = [2,202,4,55].
%double:double_all(Numbers).