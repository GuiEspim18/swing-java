package vectors;

import javax.swing.*;

public class Ex6 {
    public static void main(String[] args) {
        int[] totalSold = new int[10];
        double[] percentPerSold = new double[10];
        String[] sellerCode = new String[10];

        for (int i = 0; i < 10; i++) {
            int seller = i + 1;
            String message = "Total de vendas do vendedor " + seller;
            totalSold[i] = Integer.parseInt(JOptionPane.showInputDialog(null, message, "Total sale seller " + seller, -1 ));
            message = "Comissão do total de vendas do vendedor " + seller;
            percentPerSold[i] = Integer.parseInt(JOptionPane.showInputDialog(null, message, "Percent per sold seller " + seller, -1 )) / 100;
            message = "Código do vendedor " + seller;
            sellerCode[i] = JOptionPane.showInputDialog(null, message, "Seller " + seller + " code", -1);
        }

        String message = "";

        for (int i = 0; i < 10; i++) {
            int seller = i + 1;
            double value = totalSold[i] * percentPerSold[i];
            message += "Vendedor " + seller + " teve a comissão de venda de R$: " + value + "\n";
        }

        JOptionPane.showMessageDialog(null, message, "Result", -1);

    }

}
