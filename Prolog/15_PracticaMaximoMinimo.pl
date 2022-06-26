%Dado un conjunto de valores, encontrar el minimo, el maximo y el promedio
%(Si, el ejercicio de la temperatura)

%Dado los hechos temperatura(Dia, temperatura)
temperatura(1,-5).
temperatura(2,2).
temperatura(3,4.5).
%etc. etc., no hay un solo dia que no se tome la temperatura
%Primero elijo para hacer el minimo/maximo (Arrancan de la misma base)
productoCartesiano(X,Y):-
    temperatura(_,X),
    temperatura(_,Y).
%Aca empiezo para la máxima
losMenores(X):-
    productoCartesiano(X,Y),
    X<Y.
elMaximo(X):-
	temperatura(_,X),
    not(losMenores(X)).
fechasMaxima(Fecha,Temperatura):-
    elMaximo(Temperatura),
    temperatura(Fecha,Temperatura).

%El menor es similar pero al reves en la condicion de losMenores
losMayores(X):-
    productoCartesiano(X,Y),
    X>Y.
elMenor(X):-
    temperatura(_,X),
    not(losMayores(X)).
fechasMinima(Fecha,Temperatura):-
    elMenor(Temperatura),
    temperatura(Fecha,Temperatura).