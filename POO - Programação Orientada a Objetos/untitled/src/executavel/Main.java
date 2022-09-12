package executavel;

import classesJava.Aluno;

public class Main {

    public static void main(String[] args) {
        //aluno1, aluno2...são referencias para o objeto aluno
        //new Aluno() é uma instancia (criação de um Objeto)
        //Construtor padrão
        Aluno aluno1 = new Aluno();
        aluno1.setNome("Diego");
        aluno1.setIdade(22);
        aluno1.setDataNascimento("30/05/2000");
        aluno1.setRegistroGeral("123456");
        aluno1.setNumeroCpf("54321");
        aluno1.setNomeMae("Claudia");
        aluno1.setNomePai("Paulo");
        aluno1.setDataMatricula("01/01/2022");
        aluno1.setNomeEscola("Sp");
        aluno1.setSerieMatriculado("Ensino médio");

        System.out.println("Nome do aluno é: " + aluno1.getNome());
        System.out.println("Idade do aluno é: " + aluno1.getIdade());
        System.out.println("Data de nascimento do aluno é: " + aluno1.getDataNascimento());
        System.out.println("RG do aluno é: " + aluno1.getRegistroGeral());
        System.out.println("CPF do aluno é: " + aluno1.getNumeroCpf());
        System.out.println("Nome da mãe do aluno é: " + aluno1.getNomeMae());
        System.out.println("Nome do pai do aluno é: " + aluno1.getNomePai());
        System.out.println("Data de matricula do aluno é: " + aluno1.getDataMatricula());
        System.out.println("Nome da escola do aluno é: " + aluno1.getNomeEscola());
        System.out.println("Série em que o aluno está matriculado: " + aluno1.getSerieMatriculado());
        System.out.println("==================================================");

        //====================================================================================================


        Aluno aluno2 = new Aluno();
        aluno2.setNome("Claudia");
        aluno2.setIdade(22);
        aluno2.setDataNascimento("01/01/2000");

        System.out.println("Nome do aluno: " + aluno2.getNome());
        System.out.println("Idade do aluno: " + aluno2.getIdade());
        System.out.println("Data de nascimento do aluno: " + aluno2.getDataNascimento());

        //====================================================================================================
        Aluno aluno3 = new Aluno();
        //Construtor com 1 parametro
        Aluno aluno4 = new Aluno("Maria");
        //Construtor com 2 parametros
        Aluno aluno5 = new Aluno("José", 50);
    }
}