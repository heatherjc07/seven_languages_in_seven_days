child_of(heather, helen). 
child_of(carolyn, helen). 
child_of(fiona, colette). 
child_of(fiona, pat). 
child_of(heather, desi). 
child_of(carolyn, desi). 
child_of(stephen, colette). 
child_of(stephen, pat). 
child_of(luke, heather). 
child_of(luke, stephen). 
sibling_of(X, Y) :- \+(X = Y), child_of(X, Z), child_of(Y, Z).

% run the following in the interpreter
% ?- child_of(heather, colette). 
% returns false 
% ?- child_of(luke, stephen). 
% returns true 
% ?- sibling_of(luke, luke). 
% returns false 
% ?- sibling_of(fiona, stephen). 
% returns true  
%  ?- sibling_of(carolyn, heather). 
% returns true  
%  ?- sibling_of(carolyn, fiona). 
% returns false 

