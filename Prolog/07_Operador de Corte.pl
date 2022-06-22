%Operador de Corte
%El operador de corte le indica a Prolog que apenas encuentre un resultado
%true, no siga haciendo un backtracking, sino que se quede con ese resultado
%(Algo similar a un select top 1 * from tabla, creo yo...)
r1(a,b). %(1) primero agarra esto
r1(a,c). %(8) como no puede seguir en (7) hace un backtracking hasta aca
r2(b,d). %(2) luego esto
r2(b,e).
r2(c,f).
r2(c,g).
r2(c,h).
r3(d,i). %(3) luego esto
r3(d,j). %(7) hace un backtracking hasta acá
r3(f,k).
r3(g,l).
r4(i,m). %(4) finalmente llega acá
r4(i,n). %(5) Hace un backtracking
r5(n,r). %(6) finaliza esta rama acá
r(X):-
    r1(X,Y),
	writeln(Y),
    r2(Y,Z),
    writeln(Z),
    r3(Z,W),
    writeln(W),
    r4(W,U),
    writeln(U),
    r5(U,T),
    writeln(T) .

%El corte solo toma efecto al tratar de retroceder, no al avanzar