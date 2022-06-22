numero(pedro,1).
numero(ana,2).
numero(juan,3).

producto_cartesiano(X,Y):-
    numero(_,X),
    numero(_,Y).
menores(X):-
    producto_cartesiano(X,Y),
    X < Y.

maximo(Y,X):-
    numero(Y,X),
    not(menores(X)).