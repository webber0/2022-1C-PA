venta(20220110091500, vero,  11, 1).
venta(20220111091500, lucas,  35, 1).
venta(20220112091500, fede,   22, 2).
venta(20220113091500, vero,  48, 2).
venta(20220110093000, fede,   33, 2).
venta(20220111093000, lucas,  74, 1).
venta(20220112093000, hernan, 97, 3).
venta(20220113100000, lucas,  72, 1).
venta(20220111110000, hernan, 65, 3).
venta(20220111114500, vero,  56, 3).
venta(20220111120000, vero,  54, 2).
venta(20220111131223, vero,  81, 1).


productoCartesiano(Venta1,Sede1,Venta2,Sede2):-
    venta(_,_,Venta1,Sede1),
    venta(_,_,Venta2,Sede2),
    Sede1=Sede2.
lasVentasMenores(Ventas,Sede):-
    productoCartesiano(Ventas,Sede,Ventas1,_),
    Ventas < Ventas1.
laMayorVentaPorSede(Vendedor,Ventas,Sede):-
    venta(_,Vendedor,Ventas,Sede),
    not(lasVentasMenores(Ventas,Sede)).t