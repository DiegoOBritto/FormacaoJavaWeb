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

        for (int pos = 1; pos <= 4; pos ++) {
            String nomeDisciplina = JOptionPane.showInputDialog("Informe a disciplina: " + pos );
            String notaDisciplina = JOptionPane.showInputDialog("Nota da disciplina: " + pos);

            Disciplina disciplina = new Disciplina();
            disciplina.setDisciplina(nomeDisciplina);
            disciplina.setNota(Double.valueOf(notaDisciplina));

            aluno1.getDisciplinas().add(disciplina);
        }




        System.out.println(aluno1.toString()); //Descrição do obejto na memoria
        System.out.println("Média do aluno: " + aluno1.getMediaNota());
        System.out.println("Resultado: " + aluno1.getAlunoAprovado2());

    }
}