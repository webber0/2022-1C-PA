%Recursividad
%Para que la recursividad no se lleve toda la memoria
%tengo que poner un caso base o caso de corte
%entonces...
factorial(0,1).
factorial(N,R):- 
    N>0, 
    N1 is N-1,
    factorial(N1,R1),
    R is R1*N.
%Entonces, para los antecesores
padre(juan,pedro).
padre(juan,maria).
padre(pedro,ana).
padre(ana,nicolas).
padre(ana,joela).

antecesor(Padre,Hijo):-
    padre(Padre,Hijo).
antecesor(X,Y):-
    padre(X,Z),
    antecesor(Z,Y).

%Fibonacci
fibonacci(0,0).
fibonacci(1,1).
fibonacci(X,Y):-
    X > 1,
    X1 is X-1,
    X2 is X-2,
   	fibonacci(X1,Y1),
    fibonacci(X2,Y2),
    Y is Y1 + Y2.
