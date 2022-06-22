%clauses

entrada(paella).
entrada(gazpacho).
entrada(consomé).

carne(filete_de_cerdo).
carne(pollo_asado).

pescado(trucha).
pescado(bacalao).

postre(flan).
postre(helado).
postre(pastel).

%fin clauses
%Implementar las reglas necesarias para formular las siguientes consultas en Prolog:
%a) Cuáles son los menús que ofrece el restaurante?
plato_Principal(Plato):-
    carne(Plato);
    pescado(Plato).
menu(Entrada,Plato_principal,Postre):-
    entrada(Entrada),
    plato_Principal(Plato_principal),
    postre(Postre).

%menu(Entrada,Plato_principal,Postre).
%b) Cuáles son los menús que tienen Consomé en las entradas?
menuConsome(Entrada,Plato_principal,Postre):-
    menu(Entrada,Plato_principal,Postre), %Aca lo simplifique reutilizando una regla existente
    Entrada=consomé.
%c) Cuáles son los menús que no contienen flan como postre? 
menuSinFlan(Entrada,Plato_principal,Postre):-
    menu(Entrada,Plato_principal,Postre),
    Postre \==flan.
