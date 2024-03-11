package vectors;

import javax.swing.*;

public class Ex5 {

    public static void main(String[] args) {
        String[] code = new String[5];
        int[] price = new int[5];

        int low50 = 0;
        String between50and100 = "";
        int high100Count = 0;
        int high100Price = 0;

        for (int i = 0; i < 5; i++) {
            int product = i + 1;
            String message = "Digite o código do produto " + product;
            code[i] = JOptionPane.showInputDialog(null, message, "Product code", -1);
            message = "Digite o preço do produto " + product + "  código " + code[i];
            price[i] = Integer.parseInt(JOptionPane.showInputDialog(null, message, "Product " + code[i] + "price", -1));
        }

        for (int i = 0; i < 5; i++) {
            if (price[i] < 50) {
                low50++;
            }
            if (price[i] >= 50 && price[i] <= 100) {
                between50and100 += code[i] + " ";
            }
            if (price[i] > 100) {
                high100Count++;
                high100Price += price[i];
            }
        }

        String message = "Temos " + low50 + " produtos com preço abaixo de 50 reais\n";
        message += "Os códigos dos produtos com preço entre 50 a 100 reais são: " + between50and100 + "\n";
        message += "A média de produtos com preço acima de 100 é " + high100Price / high100Count;

        JOptionPane.showMessageDialog(null, message, "Result", -1);
    }


}
