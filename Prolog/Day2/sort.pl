% Define the sort
sort_list([], []).
sort_list([Head], [Head]).
sort_list([First, Second | Tail], Sorted) :-
  %split list into two
  divide([First, Second | Tail], Left, Right),
  %sort each side
  sort_list(Left, LeftSorted),
  sort_list(Right, RightSorted),
  %merge
  merge(LeftSorted, RightSorted, Sorted).

% Define the merge
merge(LeftList, [], LeftList).
merge([], RightList, RightList).
merge([LeftHead | LeftTail], [RightHead | RightTail], [LeftHead | Merged]) :- 
  LeftHead =< RightHead,
  merge(LeftTail, [RightHead | RightTail], Merged).
merge([LeftHead | LeftTail], [RightHead | RightTail], [RightHead | Merged]) :- 
  LeftHead > RightHead, 
  merge([LeftHead | LeftTail], RightTail, Merged).  

  
% Define the divide
divide([], [], []).
divide([Head], [Head], []).
divide([First, Second | Tail], [First | Left], [Second | Right]) :-
  divide(Tail, Left, Right).

