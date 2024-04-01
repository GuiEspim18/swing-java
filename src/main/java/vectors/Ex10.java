package vectors;

import javax.swing.*;

public class Ex10 {
    public static void main(String[] args) {
        int[][] values = new int[6][6];
        String result = "";

        for (int line = 0; line < 6; line++) {
            for (int column = 0; column < 6; column++) {
                if (line == 0 || line == 5) {
                    values[line][column] = 1;
                    result += values[line][column] + " ";
                }
                if (line == 1 || line == 4) {
                    if (column == 0 || column == 5) {
                        values[line][column] = 1;
                    } else {
                        values[line][column] = 2;
                    }
                    result += values[line][column] + " ";
                }
                if (line == 2 || line == 3) {
                    if (column == 0 || column == 5) {
                        values[line][column] = 1;
                    }else if (column == 1 || column == 4) {
                        values[line][column] = 2;
                    } else {
                        values[line][column] = 3;
                    }
                    result += values[line][column] + " ";
                }
            }
            result += "\n";
        }
        JOptionPane.showMessageDialog(null, result);
    }
}
