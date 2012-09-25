
% If list is only one value long
% set Min to this value
min([Head|[]], Head).
% if current min smaller than head
% return it
min([Head | Tail], TailMin) :- min(Tail, TailMin), TailMin =< Head.
% otherwise return Head
min([Head | Tail], Head) :- min(Tail, TailMin), TailMin > Head.