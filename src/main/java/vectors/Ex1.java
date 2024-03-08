package vectors;

import javax.swing.*;

public class Ex1 {

    public static void main(String[] args) {
        int [] values = new int[10];
        for (int i = 0; i <= 9; i++) {
            int position = i + 1;
            int value = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número inteiro para a posição (" + position + "/10)", "Tap a value", -1));
            values[i] = value;
        }
        int negatives = 0;
        int totalSumPositives = 0;
        for (int value : values) {
            if (value < 0 ) {
                negatives++;
            } else {
                totalSumPositives += value;
            }
        }
        String message = "";
        message += "Temos " + negatives + " números negativos no vetor.\n";
        message += "A soma dos números positivos é: " + totalSumPositives;
        JOptionPane.showMessageDialog(null, message, "Result", -1);
    }

}
