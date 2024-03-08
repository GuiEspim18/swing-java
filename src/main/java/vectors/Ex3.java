package vectors;

import javax.swing.*;

public class Ex3 {

    public static void main(String[] args) {
        int[] values = new int[7];
        for (int i = 0; i <= 6; i++) {
            int position = i + 1;
            String message = "Digite um valor para a posição (" + position + "/7)";
            int value = Integer.parseInt(JOptionPane.showInputDialog(null, message, "Tap value", -1));
            values[i] = value;
        }
        String multiple2 = "";
        String multiple3 = "";
        String multiple2and3 = "";
        for (int value : values) {
            if (value % 2 == 0) {
                multiple2 += " | " + value;
            }
            if (value % 3 == 0) {
                multiple3 += " | " + value;
            }
            if (value % 2 == 0 && value % 3 == 0) {
                multiple2and3 += " | " + value;
            }
        }
        multiple2 += " | ";
        multiple3 += " | ";
        multiple2and3 += " | ";
        String message = "Os números multiplos de 2 são: " + multiple2 + "\n";
        message += "Os números multiplos de 3 são: " + multiple3 + "\n";
        message += "Os números multiplos de 2 e 3 são: " + multiple2and3 + "\n";
        JOptionPane.showMessageDialog(null, message, "Result", -1);

    }

}
