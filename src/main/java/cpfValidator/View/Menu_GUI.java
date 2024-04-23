package cpfValidator.View;

import javax.swing.*;

public class Menu_GUI {

    public static void show() {
        boolean finish = false;
        while (!finish) {
            int value = Integer.parseInt(JOptionPane.showInputDialog(null, "Escolha uma opção:\n1. Gerar cpf\n2. Validar cpf\n3. Sair"));
            switch (value) {
                case 1:
                    GenerateCPF_GUI.show();
                    break;
                case 2:
                    
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Até mais!");
                    finish = true;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Erro opção inválida!");
                    break;
            }
        }
    }

}
