ventas1erSem(joaquin,20500).
ventas1erSem(martin, 50000).
ventas1erSem(juana, 1500).
ventas1erSem(maria, 2500).
ventas1erSem(martina, 30000).

ventas2doSem(martina, 20500).
ventas2doSem(joaquin, 10250).
%ventas2doSem(martina, 64520).
ventas2doSem(rosa, 1000).
ventas2doSem(juana, 22050).

% 20% del total vendido en el año para aquellos vendedores que hayan tenido ventas en ambos semestres y cada una de ellas supera los $ 20000.
% 10% del total vendido en el año para aquellos vendedores que hayan tenido ventas en ambos semestres, pero no superan los $ 20000 en alguno de estos.
% 5% del total vendido para los vendedores que no registran ventas en algún semestre 

vendedoresEstrellas(Vendedor,Comision):-
    ventas1erSem(Vendedor,Ventas1),
    ventas2doSem(Vendedor,Ventas2),
    Ventas1>20000,
    Ventas2>20000,
    Comision is 20.
vendedoresNormales(Vendedor,Comision):-
    ventas1erSem(Vendedor,Ventas1),
    ventas2doSem(Vendedor,Ventas2),
    (   (Ventas1>20000,Ventas2<20000);
    (Ventas2>20000,Ventas1<20000)),
    Comision is 10.
vendedoresAusentes(Vendedor,Comision):-
    (   (   ventas1erSem(Vendedor,_),
        not(ventas2doSem(Vendedor,_)));
    (   ventas2doSem(Vendedor,_),
        not(ventas1erSem(Vendedor,_)))),
    Comision is 5.