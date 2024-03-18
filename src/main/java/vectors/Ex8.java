package vectors;

import javax.swing.*;

public class Ex8 {
    public static void main(String[] args) {
        int[] a = new int[4], b = new int[4], res = new int[4];
        String message = "Vetor resultante: ";
        for (int i = 0; i < 4; i++) {
            int aValue = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite p valor " + ( i + 1) + " do vetor a", "Tap a value", -1 ));
            a[i] = aValue;
            int bValue = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite p valor " + ( i + 1) + " do vetor b", "Tap a value", -1 ));
            b[i] = bValue;
            res[i] = a[i] * b[i];
            message += res[i] + " | ";
        }
        JOptionPane.showMessageDialog(null, message, "Result", -1);
    }
}
