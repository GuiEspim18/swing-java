import javax.swing.*;

public class App {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog(null, "Digite o seu nome", "Tap name", -1);
        String message = "Olá, " + name + " !";
        JOptionPane.showMessageDialog(null, message, "Name", -1);
    }
}
