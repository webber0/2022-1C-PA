%si x < 0 vale 3.
%si x <= x <=2 entonces vale x
%si x > 2 vale 5
f(X,R):- 
    X < 0,
    R is 3,!. %En este caso, le agrego un corte
%para que no siga evaluando las otras opciones
f(X,R):-
    X=<2, %En si, X=>0 no es necesario porque
%ya la condicion anterior devolvio falso, y como el
%corte solo corta al primer true, entonces no hace 
%efecto
    R is X,!.
f(X,R):-
    X > 2, %necesario para evitar el singleton variable
    R is 5. %no es necesario cortar porque ya llego
%hasta aca...
