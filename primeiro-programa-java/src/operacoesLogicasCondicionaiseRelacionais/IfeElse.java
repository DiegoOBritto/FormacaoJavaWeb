package operacoesLogicasCondicionaiseRelacionais;

public class IfeElse {

    private static double nota3;

    //Main é um método auto executável em Java
    public static void main(String args[]) {

        double nota1 = 9;
        double nota2 = 7;
        double nota3 = 5;
        double nota4 = 8.8;
        double mediaNotas = (nota1 + nota2 + nota3 + nota4) / 4;


        System.out.println("A média das notas é: " + mediaNotas);

        if (mediaNotas >= 7 ) {
            System.out.println("O aluno foi aprovado !!!");
        } else if (mediaNotas >= 4 && mediaNotas <= 6.9) {
            System.out.println("O aluno está de recuperação!!!");
        } else {
            System.out.println("O aluno foi reprovado!!!");
        }
    }
}