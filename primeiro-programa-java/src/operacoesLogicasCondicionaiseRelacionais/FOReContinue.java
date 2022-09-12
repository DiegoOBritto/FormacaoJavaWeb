package operacoesLogicasCondicionaiseRelacionais;

public class FOReContinue {

    public static void main(String[] args) {

        //estrutura de repetição For e Continue

        for (int numero = 0; numero <= 10; numero++) {
            if (numero == 2 || numero == 5 || numero == 7) {
                System.out.println("obaaa !!!encontrei o numero " + numero);
                continue;
            }

            System.out.println("processando laço de repetição...");
        }
    }
}
