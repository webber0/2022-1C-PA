%Dado una estacion meteorologica que mide por dia la temperatura, que me de
%- Maximo/minimo, que me de el registro en si
%- Promedio general
%el formato es temperatura(dia,minima,maxima)
temperaturas_dia(1, 5,10).%7.5
temperaturas_dia(2, 15,19).%17
temperaturas_dia(3, 10,11).%10.5
temperaturas_dia(4, 20,32).%26
temperaturas_dia(5, 18,27).%22.5
temperaturas_dia(6, 15,21).%18
%total = 16.9
 

temp_prom(N, P):-temperaturas_dia(N, Min, Max), P is (Min + Max) / 2.
 
acum(0, 0):-!.
acum(N, S):-N1 is N - 1, acum(N1, S1), temp_prom(N, P), S is S1 + P.
 
prom(P):-max(N), acum(N, S), P is S / N.
 

dias_no_max(N):-temp_prom(N,_), temp_prom(N2,_), N < N2.
max(N):-temp_prom(N, _), \+ dias_no_max(N).
 
% N -> deberia calcularse como max