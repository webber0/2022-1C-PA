%Promocionaste? Version 2
parcial1(pedro,7).
parcial1(maria,8).

parcial2(pedro,7).
parcial2(juan,6).

ausentesSegundoParcial(X):-
    parcial1(X,_),
    not(parcial2(X,_)).
ausentesPrimerParcial(X):-
    parcial2(X,_),
    not(parcial1(X,_)).

enSituacionDeAusentes(X):-
    ausentesPrimerParcial(X);
    ausentesSegundoParcial(X).
    

