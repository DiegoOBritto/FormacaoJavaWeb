package operacoesLogicasCondicionaiseRelacionais;

public class OperadoresTernarios {

    public static void main(String[] args) {

        //operadores ternários são para micro validações

        double nota1 = 5;
        double nota2 = 5;
        double nota3 = 5;
        double nota4 = 5;
        double media = (nota1 + nota2 + nota3 + nota4) / 4;
        String saidaResultado;

        saidaResultado = media >= 70 ? "Aluno aprovado" : (media >= 40 && media <= 69) ? "Aluno em recuperação" : "Aluno reprovado";

        System.out.println(saidaResultado);
    }
}
