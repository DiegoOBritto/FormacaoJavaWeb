Algoritmo "repeti��o com interrup��o"
Var

numero : inteiro

Inicio

numero <- 0

repita
      numero <- numero + 1
      escreval("n�mero atual �: ", numero)
      se numero =  17 entao
         escreval("Encontramos o n�mero = ", numero)
         interrompa
      fimse
ate numero >= 20

Fimalgoritmo