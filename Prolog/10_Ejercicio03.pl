hombre(pedro).
hombre(manuel).
hombre(arturo).
mujer(maría).
%padre/hijx
padre(pedro, manuel).
padre(pedro, arturo).
padre(pedro, maría).

%Reglas a formular
niño(Hijx,Padre):- padre(Padre,Hijx). %expresa que X es hijo o hija de Y.
hijo(Hijx,Padre):- %expresa que X es un hijo varón de Y.
	niño(Hijx,Padre),
	hombre(Hijx).
hija(Hijx,Padre):- %expresa que X es una hija de Y.
    niño(Hijx,Padre),
    mujer(Hijx).

hermano-o-hermana(X,Y):- %expresa que X es hermano o hermana de Y.
    niño(X,_),
    niño(Y,_),
    dif(X,Y).

hermano(X,Y):-%expresa que X es un hermano de Y.
    hermano-o-hermana(X,Y),
    hombre(X),
    hombre(Y),
    dif(X,Y).
hermana(X,Y):- %expresa que X es una hermana de Y.
    hermano-o-hermana(X,Y),
    mujer(X),
    mujer(Y),
    dif(X,Y).