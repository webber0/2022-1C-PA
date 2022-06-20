%Exercise 2.2
house_elf(dobby).
witch(hermione).
witch('McGonagall'). %Fixed to adapt SWI-Prolog syntax
witch(rita_skeeter).
wizard(harry). %Added
magic(X):-house_elf(X).
magic(X):-wizard(X).
magic(X):-witch(X).

%Which of the following queries are satisfied? Where relevant, give all the variable
%instantiations that lead to success.
%1. ?- magic(house_elf). ->No, 'casuse it's not a vairable -> magic(House_elf).
%2. ?- wizard(harry). -> Yes
%3. ?- magic(wizard). -> No, 'casuse it's not a vairable -> magic(Wizard).
%4. ?- magic('McGonagall'). -> Yes
%5. ?- magic(Hermione). -> Yes

%Exercise 2.3
word(article,a).
word(article,every).
word(noun,criminal).
word(noun,'big kahuna burger').
word(verb,eats).
word(verb,likes).
sentence(Word1,Word2,Word3,Word4,Word5) :-
	word(article,Word1),
	word(noun,Word2),
	word(verb,Word3),
	word(article,Word4),
	word(noun,Word5).

%What query do you have to pose in order to find out which sentences the grammar
%can generate? List all sentences that this grammar can generate in the order Prolog
%will generate them. Make sure that you understand why Prolog generates them in this
%order

% ?- sentence(Article1,Noun1,Verb,Article2,Noun2).
%'casuse it looks all possibilities 

%Practical Session 2
%Make sure you understand the way \=/2 predicate works by trying it out on (at least)
%the following examples. But do this actively, not passively. That is, after you type in
%an example, pause, and try to work out for yourself what Prolog is going to respond.
%Only then hit return to see if you are right.
%1. a \= a -> false, they're the same!
%2. ’a’ \= a -> true, they're not the same. I make a wrong, they're the same
%3. A \= a -> false, they're the same: A is a variable, and a is an atom?
%f(a).
%4. f(a) \= a -> true, 'cause it exists
%5. f(a) \= A -> False, 
%6. f(A) \= f(a)
%7. g(a,B,c) \= g(A,b,C)
%8. g(a,b,c) \= g(A,C)
%9. f(X) \= X

%Intro to trace
f(a).
f(b).
g(a).
g(b).
h(b).
k(X) :- f(X),g(X),h(X).