%El orden en Prolog es importante, 
%Capitulo 1
happy(yolanda).
happy(vincent).

woman(mia).
woman(jody).
woman(yolanda).
listensToMusic(butch).
listensToMusic(mia).
listensToMusic(yolanda):-happy(yolanda).
%Se ve que le gusta tener cosas similares juntas
playsAirGuitar(jody).
playsAirGuitar(mia):-
    listensToMusic(mia).
playsAirGuitar(yolanda):- 
    listensToMusic(yolanda).
playsAirGuitar(vincent):- 
    listensToMusic(vincent),
    happy(vincent).
playsAirGuitar(butch):- happy(butch).
playsAirGuitar(butch):- listensToMusic(butch).
%KB4
loves(vincent,mia).
loves(marcellus,mia).
loves(pumpkin,honey_bunny).
loves(honey_bunny,pumpkin).
%KB5
jealous(X,Y) :- 
    loves(X,Z),
    loves(Y,Z).
