package executavel;

import classesJava.Aluno;
import classesJava.Disciplina;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Aluno> alunos = new ArrayList<Aluno>();

        for (int qtd = 1; qtd <= 2; qtd++) {

            String nome = JOptionPane.showInputDialog("Digite o nome do aluno " + qtd + " ? ");
       /* String idade = JOptionPane.showInputDialog("Digite a idade do aluno ?");
        String nascimento = JOptionPane.showInputDialog("Digite a data de nascimento do aluno ?");
        String rg = JOptionPane.showInputDialog("Digite o RG do aluno ?");
        String cpf = JOptionPane.showInputDialog("Digite o CPF do aluno ?");
        String mae = JOptionPane.showInputDialog("Digite o nome da mãe do aluno: ");
        String pai = JOptionPane.showInputDialog("Digite o nome do pai do aluno: ");
        String matricula = JOptionPane.showInputDialog("Digite a data da matricula do aluno: ");
        String escola = JOptionPane.showInputDialog("Digite o nome da escola: ");
        String serie = JOptionPane.showInputDialog("Digite a série em que o aluno está matriculado");*/


            //aluno1, aluno2...são referencias para o objeto aluno
            //new Aluno() é uma instancia (criação de um Objeto)
            //Construtor padrão
            Aluno aluno1 = new Aluno();

            aluno1.setNome(nome);
        /*aluno1.setIdade(Integer.valueOf(idade));
        aluno1.setDataNascimento(nascimento);
        aluno1.setRegistroGeral(rg);
        aluno1.setNumeroCpf(cpf);
        aluno1.setNomeMae(mae);
        aluno1.setNomePai(pai);
        aluno1.setDataMatricula(matricula);
        aluno1.setNomeEscola(escola);
        aluno1.setSerieMatriculado(serie);*/

            for (int pos = 1; pos <= 1; pos++) {
                String nomeDisciplina = JOptionPane.showInputDialog("Informe a disciplina: " + pos);
                String notaDisciplina = JOptionPane.showInputDialog("Nota da disciplina: " + pos);

                Disciplina disciplina = new Disciplina();
                disciplina.setDisciplina(nomeDisciplina);
                disciplina.setNota(Double.valueOf(notaDisciplina));

                aluno1.getDisciplinas().add(disciplina);
            }

            int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina ?");

            if (escolha == 0) {

                int conitnuarRemover = 0; //Opcão "sim" = 0
                int posicao = 1;

                while (conitnuarRemover == 0) {
                    String disciplinaRemover = JOptionPane.showInputDialog("Qual disciplina deseja remover: 1, 2, 3 ou 4 ? ");
                    aluno1.getDisciplinas().remove(Integer.valueOf(disciplinaRemover).intValue() - posicao);
                    posicao++;
                    conitnuarRemover = JOptionPane.showConfirmDialog(null, "Deseja remover outra disciplina ?");
                }
            }

            alunos.add(aluno1);
        }

        for (int pos = 0; pos < alunos.size(); pos++) {

            Aluno aluno = alunos.get(pos);

            if (aluno.getNome().equalsIgnoreCase("diego")) {
                Aluno trocar = new Aluno();
                trocar.setNome("Aluno foi trocaddo !!!");

                Disciplina disciplina = new Disciplina();
                disciplina.setDisciplina("Java");
                disciplina.setNota(9.6);

                trocar.getDisciplinas().add(disciplina);

                alunos.set(pos, trocar);
                aluno = alunos.get(pos);
            }

            System.out.println("Aluno: " + aluno.getNome());
            System.out.println("Média do aluno" + aluno.getMediaNota());
            System.out.println("Resultado: " + aluno.getAlunoAprovado2());
            System.out.println("==============================================");

            for (Disciplina disc : aluno.getDisciplinas()) {
                System.out.println("Disciplina: " + disc.getDisciplina() + " Nota = " + disc.getNota());
            }
        }
    }
}