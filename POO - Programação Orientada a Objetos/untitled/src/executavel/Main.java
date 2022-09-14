package executavel;

import classesJava.Aluno;
import classesJava.Disciplina;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

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



        //aluno1, aluno2...são referencias para o objeto aluno
        //new Aluno() é uma instancia (criação de um Objeto)
        //Construtor padrão
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

        Disciplina disciplina1 = new Disciplina();
        disciplina1.setDisciplina("Banco de Dados");
        disciplina1.setNota(5.5);
        aluno1.getDisciplinas().add(disciplina1);

        Disciplina disciplina2 = new Disciplina();
        disciplina2.setDisciplina("Java");
        disciplina2.setNota(7.5);
        aluno1.getDisciplinas().add(disciplina2);

        Disciplina disciplina3 = new Disciplina();
        disciplina3.setDisciplina("HTML/CSS");
        disciplina3.setNota(5.5);
        aluno1.getDisciplinas().add(disciplina3);

        Disciplina disciplina4 = new Disciplina();
        disciplina4.setDisciplina("Javascript");
        disciplina4.setNota(5.5);
        aluno1.getDisciplinas().add(disciplina4);


        System.out.println(aluno1.toString()); //Descrição do obejto na memoria
        System.out.println("Média do aluno: " + aluno1.getMediaNota());
        System.out.println("Resultado: " + aluno1.getAlunoAprovado2());

    }
}