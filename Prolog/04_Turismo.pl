%clauses
transporte(roma,20).
transporte(londres,30).
transporte(tunez,10).

alojamiento(roma,hotel,50).
alojamiento(roma,hostal,30).
alojamiento(roma,camping,10).
alojamiento(londres,hotel,60).
alojamiento(londres,hostal,40).
alojamiento(londres,camping,20).
alojamiento(tunez,hotel,40).
alojamiento(tunez,hostal,20).
alojamiento(tunez,camping,5).
%finclauses

%Expresar la relación viaje(C,S,H,P) que se interpreta por: 
%el viaje a la ciudad C durante S semanas con estancia en H cuesta P pesos.
% Completar con viajeeconomico(C,S,H,P,Pmax) que expresa que 
% el costo P es menor que Pmax pesos.



viaje(Ciudad,Semanas,Hospedaje,Precio):-
    transporte(Ciudad,SubtotalViaje),
    alojamiento(Ciudad,Hospedaje,CostoAlojamiento),
    %Ciudad = Destino,
	SubtotalAlojamiento is CostoAlojamiento * Semanas,
    Precio is SubtotalViaje + SubtotalAlojamiento.
%viaje(Ciudad,2,Hospedaje,Pesos). --> inicializo la variable al momento de ejecutar la consulta
% Completar con viajeeconomico(C,S,H,P,Pmax) que expresa que 
% el costo P es menor que Pmax pesos.
viajeEconomico(Ciudad,Semanas,Hospedaje,Precio,PrecioMax):-
    viaje(Ciudad,Semanas,Hospedaje,Precio),
    Precio =< PrecioMax.
%viajeEconomico(Ciudad,2,Hospedaje,Pesos,80).