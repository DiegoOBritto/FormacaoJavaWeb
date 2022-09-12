package classesJava;

//Classe(objeto) que representa o Aluno
public class Aluno {

    //Atributos do Aluno
    public String nome;
    public int idade;
    String dataNascimento;
    String registroGeral;
    String nomeMae;
    String nomePai;
    String dataMatricula;
    String nomeEscola;
    String serieMatriculado;

    //Construtores criam os dados na memória - Sendo padrão do Java
    public Aluno() {

    }

    public Aluno(String nomePadrao) {
        nome = nomePadrao;
    }

    public Aluno(String nomePadrao, int idadePadrao) {
        nome = nomePadrao;
        idade = idadePadrao;

    }

}
