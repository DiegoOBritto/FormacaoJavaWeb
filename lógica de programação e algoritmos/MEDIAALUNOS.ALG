Algoritmo "mediaAlunos"

Var
nota1, nota2, nota3, nota4 : inteiro
mediaFinalAluno : real

Inicio
escreva("Qual � a nota 1 ? ")
leia(nota1)

escreva("Qual � a nota 2 ? ")
leia(nota2)

escreva("Qual � a nota 3 ? ")
leia(nota3)

escreva("Qual � a nota 4 ? ")
leia(nota4)

mediaFinalAluno <- (nota1 + nota2 + nota3 + nota4) / 4

escreval ("A m�dia do aluno � = ", mediaFinalAluno)

se (mediaFinalAluno >= 50) entao
   se(mediaFinalAluno >= 70) entao
     escreva ("Aluno foi aprovado")
   senao
     escreva("Aluno em recupera��o")
   fimse
senao
     escreva("Aluno foi reprovado")
fimse
   

Fimalgoritmo
