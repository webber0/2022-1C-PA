ruta(c1,c2).
ruta(c2,c3).
ruta(c3,c4).
ruta(c4,c5).
ruta(c5,c4).

cantidad_rutas(RutaOrigen,RutaDestino,CantidadRutas):-
    not(dif(RutaOrigen,RutaDestino)),
    CantidadRutas is 0,!.
cantidad_rutas(RutaOrigen,RutaDestino,CantidadRutas):-
    ruta(RutaOrigen,RutaDestino),
    CantidadRutas is 1,!.
cantidad_rutas(RutaOrigen,RutaDestino,CantidadRutas):-
    ruta(RutaOrigen,RutaIntermedia),
    cantidad_rutas(RutaIntermedia,RutaDestino,CantidadRutas1),
    CantidadRutas is CantidadRutas1+1,!.
    