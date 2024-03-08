package vectors;

import javax.swing.*;

public class Ex2 {

    public static void main(String[] args) {
        int[] values = new int[5];
        for (int i = 0; i <= 4; i++) {
            int position = i + 1;
            String message = "Digite um valor para a posição (" + position + "/5)";
            int value = Integer.parseInt(JOptionPane.showInputDialog(null, message, "Tap value", -1));
            values[i] = value;
        }
        String message = "Os números positivos presentes no vetor são:\n";
        for (int value : values) {
            if (value > -1) {
                message += " | " + value;
            }
        }
        message += " | ";
        JOptionPane.showMessageDialog(null, message, "Result", -1);
    }

}
