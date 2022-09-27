package cursojava.executavel;

import cursojava.classes.Aluno;
import cursojava.classes.Diretor;
import cursojava.classes.Secretario;

public class TestandoSubclasses {

    public static void main(String[] args) {

        Aluno aluno = new Aluno();
        aluno.setNome("Diego Oliveira");
        aluno.setNomeEscola("Jdev");

        Diretor diretor = new Diretor();
        diretor.setRegistroGeral("123456");
        diretor.setNome("Claudia");

        Secretario secretario = new Secretario();
        secretario.setExperiencia("Administração");
        secretario.setNumeroCpf("654321");

        System.out.println(aluno);
        System.out.println(diretor);
        System.out.println(secretario);
    }
}
