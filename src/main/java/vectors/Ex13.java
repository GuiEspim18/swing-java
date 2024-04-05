package vectors;

import javax.swing.*;
import java.util.Random;

public class Ex13 {
    public static void main(String[] args) {
        Random random = new Random();
        int[][] values = new int[20][20];
        String message = "";
        int [] lineSum = new int[20];
        for (int row = 0; row < 20; row++) {
            String line = "| ";
            int total = 0;
            for (int col = 0; col < 20; col++) {
                values[row][col] = random.nextInt(90);
                if (values[row][col] < 10) {
                    line += values[row][col] + "   | ";
                } else {
                    line += values[row][col] + " | ";
                }
                total += values[row][col];
            }
            lineSum[row] = total;
            line += "\n";
            message += line;
        }
        for (int line = 0; line < 20; line++) {
            message += "\n Soma da linha " + line + " é " + lineSum[line];
        }
        JOptionPane.showMessageDialog(null, message);
    }
}
