%Initially our reversed list is empty
reverse(List, ReverseList):- reverse(List, [], ReverseList).

%Once we reach end of list we set ReverseList equal to the reverse list we've been building
reverse([], ReverseList,ReverseList).

%We take the head of our list and add it to the start of our reversed list
reverse([Head|Tail], SoFar, ReverseList) :-
          reverse(Tail, [Head|SoFar], ReverseList).

