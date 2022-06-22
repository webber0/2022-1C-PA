%Listas
%recorriendolo en el orden normal
reclista([]).
reclista([Ca|Co]):-writeln(Ca),reclista(Co). %Esto es mas optimo en el uso
%de memoria,ya que no apilo datos que no voy a usar en el futuro

%recorriendolo en el orden invertido
reclistaAlReves([]).
reclistaAlReves([Ca|Co]):-
    reclistaAlReves(Co),
    writeln(Ca).

%Sumar elementos de una lista
sumarLista([],0). %Hecho
sumarLista([Ca|Co],R):-
    sumarLista(Co,R1),
    R is Ca + R1.

%Contar los valores de una lista
contarLista([],0).
contarLista([_|Co],R):- %En este caso, le pongo variable anonima a Ca xq
    %esa variable no lo uso, entonces, simplemente le digo a Prolog que 
    %la ignore
    contarLista(Co,R1),
    R is 1+R1.

%Contar los valores de una lista, mostrando la cabeza
contarListaConCabeza([],0).
contarListaConCabeza([Ca|Co],R):- %En este caso, le pongo variable anonima a Ca xq
    %esa variable no lo uso, entonces, simplemente le digo a Prolog que 
    %la ignore
    contarListaConCabeza(Co,R1),
    writeln(Ca),
    R is 1+R1.