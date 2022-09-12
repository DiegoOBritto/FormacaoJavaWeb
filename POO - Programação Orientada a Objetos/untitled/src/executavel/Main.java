package executavel;

import classesJava.Aluno;

public class Main {

    public static void main(String[] args) {
        //aluno1, aluno2...são referencias para o objeto aluno
        //new Aluno() é uma instancia (criação de um Objeto)
        //Construtor padrão
        Aluno aluno1 = new Aluno();
        aluno1.nome = "João";
        aluno1.idade = 22;
        System.out.println("Nome do aluno 1 é: " + aluno1.nome);
        System.out.println("A idade do aluno 1 é: " + aluno1.idade);

        Aluno aluno2 = new Aluno();
        Aluno aluno3 = new Aluno();
        //Construtor com 1 parametro
        Aluno aluno4 = new Aluno("Maria");
        //Construtor com 2 parametros
        Aluno aluno5 = new Aluno("José", 50);
    }
}