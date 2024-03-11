package vectors;

import javax.swing.*;

public class Ex4 {
    public static void main(String[] args) {
        int[] quantity = new int[10];
        int[] prices = new int[10];
        int[] total = new int[10];

        int totalQuanitySold = 0;
        int totalPriceSold = 0;

        for (int i = 0; i <= 9; i++) {
            int seller = i + 1;
            String message = "Digite a quantidade de peças vendida pelo vendedor " + seller;
            quantity[i] = Integer.parseInt(JOptionPane.showInputDialog(null, message, "Quantity sold", -1));
            message = "Digite o valor da peça vendida pelo vendedor " + seller;
            prices[i] = Integer.parseInt(JOptionPane.showInputDialog(null, message, "Price", -1));
        }

        for (int i = 0; i <= 9; i++) {
            total[i] = prices[i] * quantity[i];
        }

        String message = "";
        for (int i = 0; i <= 9; i++) {
            int seller = i + 1;
            message += "Valor total da venda do vendedor " + seller + " foi R$: " + total[i] + "\n";
        }

        for (int i = 0; i <= 0; i++) {
            totalPriceSold += prices[i];
            totalQuanitySold += quantity[i];
        }

        message += "\n\n Total de vendas" + totalQuanitySold;
        message += "\n Total de valor de venda R$: " + totalPriceSold;

        JOptionPane.showMessageDialog(null, message, "Result", -1);

    }

}
