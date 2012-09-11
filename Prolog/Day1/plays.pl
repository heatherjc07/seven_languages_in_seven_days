plays(jamie_cullum, piano) . 
plays(slash, guitar). 
plays(justine_frischmann, guitar). 
plays(graham_coxon, guitar). 
plays(keith_moon, drums). 

musician_genre(graham_coxon, indie). 
musician_genre(graham_coxon, indie). 
musician_genre(jamie_cullum, jazz). 
musician_genre(slash, rock). 
musician_genre(keith_moon, rock). 

plays_instrument_genre(X, Y) :- plays(Z, X), musician_genre(Z,Y). 

% Run these in the interpreter
% ?- plays(What, guitar). 
% Returns slash, justine_frischmann, graham_coxon
% ?- plays_instrument_genre(piano, jazz). 
% true
% ?- plays_instrument_genre(guitar, indie).
% true
% ?- plays_instrument_genre(guitar, jazz).
% false
