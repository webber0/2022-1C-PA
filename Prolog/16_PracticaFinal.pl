%Se tiene un predicado tramo que posee un hecho por cada ruta directa entre ciudades, 
%informando su distancia. Las rutas son doble mano.
%Se pide definir un predicado que dadas 2 ciudades cualesquiera, permita calcular la distancia 
%entre ellas.
%Ejemplo:
%Si los hechos son
%tramo (“Caba”, “Rosario”, 300).
%tramo (“Córdoba”, “Rosario”, 400).
%tramo (“Córdoba”, “Tucumán”, 600).
%tramo (“Salta”, “Tucumán”, 400).
%La respuesta a la consulta Camino(“Caba”, “Salta”, X) sería X=1700

%tramo(salta, tucuman, 400).
%tramo(cordoba, tucuman, 600).
%tramo(cordoba, rosario, 400).
%tramo(rosario, caba, 300).
tramo(caba,rosario,300).
tramo(rosario,cordoba,400).
tramo(cordoba,tucuman,600).
tramo(tucuman,salta,400).


descendiente(X,Y,D):-
    tramo(X,Y,D).
descendiente(X,Y,D):-
	tramo(X,Z,D1),
    descendiente(Z,Y,D2),
    D is D1+D2,!.