package operacoesLogicasCondicionaiseRelacionais;

public class DoWhile {

    public static void main(String[] args) {

        //while: verifica e depois executa o código
        //do: primeiro executa e depois verifica

        int numero = 0;

        while (numero <= 10) {
            System.out.println("o numero atual é: " + numero);
            numero ++;
        }
        System.out.println("----------------------");

        int numero2 = 0;

        do {
            System.out.println("o numero2 atual é: " + numero2);
            numero2++;
        } while(numero2 <=10);
    }
}
