%Parejas de baile
%Un salón de baile desea organizar un concurso, para esto cuenta con un fichero con información de personas dispuestas a bailar. Las parejas se formarán según sus compatibilidades de acuerdo a las declaraciones siguientes:

%hombre (n1,b1,b2). 
%mujer (n2,b1,b2).

%donde n1 es el nombre de un hombre o una mujer, b1 primer estilo de baile en que le gustaría participar y b2 el segundo estilo de baile de su agrado.
%Considere que dos personas X e Y de sexos diferentes son adecuadas para formar pareja si X e Y tienen en común alguno de los dos estilos de baile que hayan declarado.
%Se desea obtener el listado de posibles participantes, indicando el nombre de ambos y el estilo en el que participan. Codifique las reglas prolog, que permitan obtener dicho listado.
%Ejemplo de declaración:

%hombre(alberto, cumbia, salsa). 
%mujer(ana, salsa, merengue).

%Ana y Alberto podrían participar del estilo salsa.

hombre(alberto,cumbia,salsa).
hombre(carlos,cumbia,tango).
mujer(ana,salsa,merengue).
mujer(silvana,reggue,hiphop).

puedenBailar(N1,N2,B):-
    (hombre(N1,B,_),
    mujer(N2,B,_));
    ( hombre(N1,B,_),
    mujer(N2,_,B)  );
    (  hombre(N1,_,B),
    mujer(N2,B,_) );
    (  hombre(N1,_,B),
    mujer(N2,_,B) ).