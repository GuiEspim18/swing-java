import javax.swing.*;

public class App {
    public static void main(String[] args) {
//        getName();
//        sum();
        vector();
    }

    private static void getName() {
        String name = JOptionPane.showInputDialog(null, "Digite o seu nome", "Tap name", -1);
        String message = "Olá, " + name + " !";
        JOptionPane.showMessageDialog(null, message, "Name", -1);
    }

    private static void sum() {
        String num = JOptionPane.showInputDialog(null, "Digite um número: ", "Tap a number", -1);
        double x = Double.parseDouble(num);
        num = JOptionPane.showInputDialog(null, "Digite mais um número: ", "Tap another number", -1);
        double y = Double.parseDouble(num);
        double result = x + y;
        JOptionPane.showMessageDialog(null, "O resultado de " + x + " + " + y + " é " + result, "Result", -1);
    }

    private static void vector() {
        int[] values = new int[5];
        for (int item = 0; item <= 4; item++) {
            int position = item + 1;
            String num = JOptionPane.showInputDialog(null, "Digite o número da posição " + position + " :", "Position " + position, -1);
            values[item] = Integer.parseInt(num);
        }
        String message = "";
        for (int item = 0; item <= 4; item++) {
            String val = " | " + values[item];
            message += val;
        }
        message += " | ";
        JOptionPane.showMessageDialog(null, message, "Values", -1);
    }
}
