%%Repaso de recursividad
%Factorial de un numero
factorial(0,1).
factorial(1,1).
factorial(K,F):-
    K1 is K-1,
    factorial(K1,F1),
    F is F1 * K,!.
%Serie de Gauss (o suma hasta el n-esimo elemento)
gaus(0,0).
gaus(1,1).
gaus(X,Y):-
    X1 is X-1,
    gaus(X1,Y1),
    Y is X + Y1,!.
%Fibonacci
fibo(0,0).
fibo(1,1).
fibo(X,Y):-
    X1 is X-1,
    X2 is X-2,
    fibo(X1,Y1),
    fibo(X2,Y2),
    Y is Y1 + Y2,!.

%Descendiendes de alguien. La relacion es Padre(Padre,Hijx)
%Sea una familia:
familia(arsenio,ricardo).
familia(ricardo,karen).
familia(karen,milanesito). %milanesito no es un nombre real, solo sirve al ejemplo

%entonces, al hacer una consulta, pueden suceder una de dos cosas, o es el
%descendiente directo (es padre->hijo) o bien tengo que recorrer a la familia
descendiente(Padre,HijoDirecto):-
    familia(Padre,HijoDirecto).
descendiente(Padre,Descendiente):-
    familia(Padre,HijoDirecto),
    descendiente(HijoDirecto,Descendiente).
%o sea, que la consulta termina siendo los descendientes de X
