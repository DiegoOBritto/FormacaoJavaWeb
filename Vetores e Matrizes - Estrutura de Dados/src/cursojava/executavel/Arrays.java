package cursojava.executavel;

public class Arrays {

    public static void main(String[] args) {

        /*Arrays podem ter todo tipo de dados e objetos*/

        /*Arrays sempre devem ter a quantidade de posições definidas*/
        double[] notas = new double[5];

        //Atribuindo valor na posição de cada array
        notas[0] = 6.8;
        notas[1] = 9.7;
        notas[2] = 5.5;
        notas[3] = 3.0;

       for (int pos = 0; pos < 5; pos ++) {
           System.out.println("Nota " + (pos + 1)+ " é: " + notas[pos]);
       }
    }
}
