package cpfValidator.View;

import javax.swing.*;

public class Menu_GUI {

    public static void show() {
        int value = Integer.parseInt(JOptionPane.showInputDialog(null, "Escolha uma opção:\n1. Gerar cpf\n2. Validar cpf\n3. Sair"));
        switch (value) {
            case 1:
                GenerateCPF_GUI.show();
                break;
            case 2:
                break;
            case 3:
                break;
            default:
                break;
        }
    }

}
