package cursojava.executavel;

import cursojava.classes.Aluno;
import cursojava.classes.Diretor;
import cursojava.classes.Pessoa;
import cursojava.classes.Secretario;

public class TestandoSubclasses {

    public static void main(String[] args) {

        Aluno aluno = new Aluno();
        aluno.setNome("Diego Oliveira");
        aluno.setNomeEscola("Jdev");
        aluno.setIdade(22);

        Diretor diretor = new Diretor();
        diretor.setRegistroGeral("123456");
        diretor.setNome("Claudia");
        diretor.setIdade(50);

        Secretario secretario = new Secretario();
        secretario.setExperiencia("Administração");
        secretario.setNumeroCpf("654321");
        secretario.setIdade(18);

        System.out.println(aluno);
        System.out.println(diretor);
        System.out.println(secretario);

        System.out.println(aluno.pessoaMaiorIdade() + " - " + aluno.msgMaiorIdade());
        System.out.println(diretor.pessoaMaiorIdade());
        System.out.println(secretario.pessoaMaiorIdade());

    }
}
