package vectors;

import javax.swing.*;
import java.util.Random;

public class Ex12 {
    public static void main(String[] args) {
        Random random = new Random();
        int[][] values = new int[20][15];
        String message = "";
        int total = 0;
        for (int row = 0; row < 20; row++) {
            String line = "| ";
            for (int col = 0; col < 15; col++) {
                values[row][col] = random.nextInt(90);
                if (values[row][col] < 10) {
                    line += values[row][col] + "   | ";
                } else {
                    line += values[row][col] + " | ";
                }
                if (values[row][col] % 2 == 0) {
                    total += values[row][col];
                }
            }
            line += "\n";
            message += line;
        }
        message += "\n\nSoma dos pares = " + total;
        JOptionPane.showMessageDialog(null, message);
    }
}
