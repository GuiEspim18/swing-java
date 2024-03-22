package tests;

import javax.swing.*;

public class Test extends JFrame {
    private JPanel header;
    private JTextField textField1;

    public Test() {
        setTitle("Testing swing");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(300, 300);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Test();
    }
}
