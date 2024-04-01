package vectors;

import javax.swing.*;

public class Ex10Correction {
    public static void main(String[] args) {
        int[][] values = new int[6][6];
        for (int column = 0; column < 6; column++) {
            values[0][column] = 1;
            values[1][column] = 2;
            values[2][column] = 3;
            values[3][column] = 3;
            values[4][column] = 2;
            values[5][column] = 1;
            if (column == 0 || column == 5) {
                values[1][column] = 1;
                values[2][column] = 1;
                values[3][column] = 1;
                values[4][column] = 1;
            }
            if (column == 1 || column == 4) {
                values[2][column] = 2;
                values[3][column] = 2;
            }
        }
        String message = "";
        for (int line = 0; line < 6; line++) {
            for (int column = 0; column < 6; column ++) {
                message += values[line][column] + " ";
            }
            message += "\n";
        }
        JOptionPane.showMessageDialog(null, message);
    }
}
