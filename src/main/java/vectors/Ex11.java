package vectors;

import javax.swing.*;
import java.util.Random;

public class Ex11 {
    public static void main(String[] args) {
        Random random = new Random();
        int[][] values = new int[15][15];
        String message = "";
        for (int row = 0; row < 15; row++) {
            String line = "| ";
            for (int col = 0; col < 15; col++) {
                values[row][col] = random.nextInt(90);
                if (values[row][col] < 10) {
                    line += values[row][col] + "   | ";
                } else {
                    line += values[row][col] + " | ";
                }
            }
            line += "\n";
            message += line;
        }
        int total = 0;
        message += "\n\n";
        for (int row = 0; row < 15; row++) {
            if (row < 14) {
                message += values[row][row] + " + ";
            } else {
               message += values[row][row] + " = ";
            }
            total+= values[row][row];
        }
        message += total;
        JOptionPane.showMessageDialog(null, message);

    }
}
