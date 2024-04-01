package vectors;

import javax.swing.*;

public class Ex10Jonh {
    public static void main(String[] args) {
        String message = "";
        int value[][] = new int [6][6];
        for(int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (j == 0 || i == 0 || j == 5 || i == 5) {
                    value[i][j] = 1;
                }
                else if ((j == 3 || j == 2) && (i == 2 || i == 3)) {
                    value[i][j] = 3;
                }
                else {
                    value[i][j] = 2;
                }
                message = message + value[i][j];
            }
            message = message + "\n";
        }
        JOptionPane.showMessageDialog(null, message);
    }

}
