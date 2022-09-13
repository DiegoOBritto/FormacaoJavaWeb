package executavel;

import classesJava.Aluno;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        //aluno1, aluno2...são referencias para o objeto aluno
        //new Aluno() é uma instancia (criação de um Objeto)
        //Construtor padrão

        String nome = JOptionPane.showInputDialog("Digite o nome do aluno ? ");
        String idade = JOptionPane.showInputDialog("Digite a idade do aluno ?");
        String nascimento = JOptionPane.showInputDialog("Digite a data de nascimento do aluno ?");
        String rg = JOptionPane.showInputDialog("Digite o RG do aluno ?");
        String cpf = JOptionPane.showInputDialog("Digite o CPF do aluno ?");
        String mae = JOptionPane.showInputDialog("Digite o nome da mãe do aluno: ");
        String pai = JOptionPane.showInputDialog("Digite o nome do pai do aluno: ");
        String matricula = JOptionPane.showInputDialog("Digite a data da matricula do aluno: ");
        String escola = JOptionPane.showInputDialog("Digite o nome da escola: ");
        String serie = JOptionPane.showInputDialog("Digite a série em que o aluno está matriculado");
        String primeiraNota = JOptionPane.showInputDialog("Digite a primeira nota: ");
        String segundaNota = JOptionPane.showInputDialog("Digite a segunda nota: ");
        String terceiraNota = JOptionPane.showInputDialog("Digite a terceira nota: ");
        String quartaNota = JOptionPane.showInputDialog("Digite a quarta nota: ");

        Aluno aluno1 = new Aluno();

        aluno1.setNome(nome);
        aluno1.setIdade(Integer.valueOf(idade));
        aluno1.setDataNascimento(nascimento);
        aluno1.setRegistroGeral(rg);
        aluno1.setNumeroCpf(cpf);
        aluno1.setNomeMae(mae);
        aluno1.setNomePai(pai);
        aluno1.setDataMatricula(matricula);
        aluno1.setNomeEscola(escola);
        aluno1.setSerieMatriculado(serie);
        aluno1.setNota1(Double.valueOf(primeiraNota));
        aluno1.setNota2(Double.valueOf(segundaNota));
        aluno1.setNota3(Double.valueOf(terceiraNota));
        aluno1.setNota4(Double.valueOf(quartaNota));

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
        System.out.println("A média de notas do aluno " + aluno1.getNome() + " é: " + aluno1.getMediaNota());
        System.out.println("Resultado: " + aluno1.getAlunoAprovado());
        System.out.println(aluno1.getAlunoAprovado2());
    }
}