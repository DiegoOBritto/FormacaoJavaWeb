package cursojava.executavel;

import javax.swing.*;

public class Arrays {

	public static void main(String[] args) {

		String[] valores = { "diego", "9", "Curso Java", "diego@email.com" };

		for (int pos = 0; pos < valores.length; pos++) {
			System.out.println("Valor na posição " + pos + " é igual = " + valores[pos]);
		}

		int[] inteiros = new int[10];
		float[] floats = new float[10];

	}
}
