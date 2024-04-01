package vectors;

import javax.swing.*;

public class Ex9 {
    public static void main(String[] args) {
        int [][] value = new int[2][2];
        String result = "";
        for (int line = 0; line < 2; line++) {
            for (int column = 0; column < 2; column++) {
                String message  = "Digite o valor da linha " + line + " e da coluna " + column ;
                String x = JOptionPane.showInputDialog(null, message);
                value[line][column] = Integer.parseInt(x);
                result += value[line][column] + " | ";
            }
            result += "\n";
        }
        JOptionPane.showMessageDialog(null, result);
    }
}
