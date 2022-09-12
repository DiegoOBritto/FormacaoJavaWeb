package operacoesLogicasCondicionaiseRelacionais;

public class FORcomBreak {

    public static void main(String[] args) {

        for (int numero = 0; numero <= 10; numero++) {
            System.out.println("numero atual é: " + numero);
            if (numero == 2) {
                System.out.println("encontrei o numero " + numero + "... estou parando de executar");
                break;
            }
        }
    }
}
