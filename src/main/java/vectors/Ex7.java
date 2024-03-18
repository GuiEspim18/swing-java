package vectors;

import javax.swing.*;

public class Ex7 {
    public static void main(String[] args) {
        int[] evenVector = new int[5];
        int[] oddVector = new int[5];
        int lengthEven = 0;
        int lengthOdd = 0;
        for (int i = 0; i<10; i++) {
            int value = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um valor", "Type a value", -1));
            if (value % 2 == 0) {
                if (lengthEven == 5) {
                    JOptionPane.showMessageDialog(null, "Vetor par cheio", "Alert error", -1);
                } else {
                    evenVector[lengthEven] = value;
                    lengthEven++;
                }
            } else {
                if (lengthOdd == 5) {
                    JOptionPane.showMessageDialog(null, "Vetor ímpar cheio", "Alert error", -1);
                } else {
                    oddVector[lengthOdd] = value;
                    lengthOdd++;
                }
            }
        }
        String message = "";
        message += "Números pares: ";
        for (int i = 0; i < lengthEven; i++) {
            message +=  " " + evenVector[i];
        }
        message += "\nNúmeros ímpares: ";
        for (int i = 0; i < lengthOdd; i++) {
            message += " " + oddVector[i];
        }
        JOptionPane.showMessageDialog(null, message, "Result", -1);
    }
}
