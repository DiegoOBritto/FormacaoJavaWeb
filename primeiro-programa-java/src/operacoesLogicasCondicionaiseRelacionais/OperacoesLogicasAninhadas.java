package operacoesLogicasCondicionaiseRelacionais;

public class OperacoesLogicasAninhadas {

    public static void main(String[] args) {

        double nota1 = 10;
        double nota2 = 10;
        double nota3 = 10;
        double nota4 = 10;
        double media = (nota1 + nota2 + nota3 + nota4) / 4;

        //Operações lógicas aninhadas: são operações denro de operações

        System.out.println("A média do aluno é: " + media);

        if (media >= 5) {
            if (media >= 7) {
                if (media > 90) {
                    System.out.println("Aluno está aprovado direto, Parabéns");
                } else {
                    System.out.println("Aluno está aprovado direto!!!");
                }
            } else {
                System.out.println("Aluno está em recuperação!!!");
            }
        } else {
            System.out.println("Aluno reprovado!!!");
        }
    }
}
