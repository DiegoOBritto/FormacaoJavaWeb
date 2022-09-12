package operacoesLogicasCondicionaiseRelacionais;

import javax.swing.*;

public class OpcaoDeConfirmacao {

    public static void main(String[] args) {

        String laranjas = JOptionPane.showInputDialog("Informe a quantidade de laranjas");
        String pessoas = JOptionPane.showInputDialog("Informe a quantidade de pessoas");

        double laranjasNumero = Double.parseDouble(laranjas);
        double pessoaNumero = Double.parseDouble(pessoas);

        int divisao = (int) (laranjasNumero / pessoaNumero);

        double resto = laranjasNumero % pessoaNumero;

        int resposta = JOptionPane.showConfirmDialog(null,
                "Deseja ver o resultado da divisão ? ");

        if (resposta == 0) {
            JOptionPane.showMessageDialog(null, "Divisão para pessoas deu: " + divisao);
        } else {
            System.out.println("Não quis ver o resultado");
        }

        resposta = JOptionPane.showConfirmDialog(null,
                "Deseja ver o RESTO da divisão ? ");

        if (resposta == 0) {
            JOptionPane.showMessageDialog(null, "O resto da divisão é " + resto);
        } else {
            System.out.println("Não quis ver o resultado");
        }

    }
}
