Algoritmo "mediaAlunos"

Var
nota1, nota2, nota3, nota4 : inteiro
mediaFinalAluno : real

Inicio
escreva("Qual é a nota 1 ? ")
leia(nota1)

escreva("Qual é a nota 2 ? ")
leia(nota2)

escreva("Qual é a nota 3 ? ")
leia(nota3)

escreva("Qual é a nota 4 ? ")
leia(nota4)

mediaFinalAluno <- (nota1 + nota2 + nota3 + nota4) / 4

escreval ("A média do aluno é = ", mediaFinalAluno)

se (mediaFinalAluno >= 50) entao
   se(mediaFinalAluno >= 70) entao
     escreva ("Aluno foi aprovado")
   senao
     escreva("Aluno em recuperação")
   fimse
senao
     escreva("Aluno foi reprovado")
fimse
   

Fimalgoritmo
