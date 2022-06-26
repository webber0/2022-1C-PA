%Promocionaste? Version 1 (Simple)
parcial1(juan,7).
parcial1(maria,6).
parcial1(pedro,2).
parcial1(nicolas,7).
parcial1(karen,7).

parcial2(juan,8).
parcial2(maria,4).
parcial2(pedro,2).
parcial2(nicolas,4).
parcial2(karen,7).

promedio(Alumno,Nota):-
    parcial1(Alumno,Nota1),
    parcial2(Alumno,Nota2),
    Nota is (Nota1+Nota2)/2.
situacion(Alumno,Promedio,Situacion):-
    promedio(Alumno,Promedio),
    Promedio >= 7,
    Situacion = promociona.
situacion(Alumno,Promedio, Situacion):-
    promedio(Alumno,Promedio),
    Promedio >= 4,
    Situacion = cursa.
situacion(Alumno,Promedio, Situacion):-
    promedio(Alumno,Promedio),
    Situacion = recursa.

productoCartesiano(N1,N2):-
    promedio(_,N1),
    promedio(_,N2),
    dif(N1,N2).
losMenores(X):-
    productoCartesiano(X,Y),
    X < Y.
elMaximo(X):-
    promedio(_,X),
    not(losMenores(X)).

alumnosDistinguidos(Alumno,Nota):-
    elMaximo(Nota),
    promedio(Alumno,Nota).
    