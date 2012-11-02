-module(gp).
-export([start/2]).
-export([loop/2]).

start(Process, Identifier) ->
  Doc = spawn(gp, loop, [Process, Identifier]),
  Doc ! new,
  Doc.

loop(Process, Identifier) ->
  process_flag(trap_exit, true),
  receive
    new ->
      io:format("Creating and monitoring process~n"),
      register(Identifier, spawn_link(Process)),
      loop(Process, Identifier);
    {'EXIT', From, Reason} ->
      io:format("The process ~p ~p died with reason ~p.", [Identifier, From, Reason]),
      io:format(" Restarting~n."),
      self() ! new,
      loop(Process, Identifier)
  end.

%Gp = gp:start(fun translate_service:loop/0, translator).
%translate_service:translate(translator, "casa").
%translate_service:translate(translator, "sausage").
%translate_service:translate(translator, "casa").

