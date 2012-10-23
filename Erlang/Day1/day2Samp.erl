-module(day2Samp).  
-export([animal_fun/1]).
-export([month_fun/1]).
-export([term_code/1]).

animal_fun(Animal) -> 
  case Animal of
  "dog" -> underdog;
  "cat" -> thundercat
  end.
  
  %day2Samp:animal_fun("dog").

month_fun(Month) ->
  case Month of
  "august" -> roasted;
  "january" -> brr;
   _ -> something_else
 end.
 
 %day2Samp:month_fun("august").
 %day2Samp:month_fun("january").
 %day2Samp:month_fun("april").
 
 
term_code(ProgramsTerminated) ->
 if
   ProgramsTerminated > 0 ->
     success;
   ProgramsTerminated < 0 ->
     error;
   true -> zero
end.

 %day2Samp:term_code(2).
 %day2Samp:term_code(-1).
 %day2Samp:term_code(0).
 
 