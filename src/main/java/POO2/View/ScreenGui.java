package POO2.View;

import POO2.Model.StudentDAO;

import javax.swing.*;

public class ScreenGui {

    public static int value = 0;
    public static void screen() {
        String x = JOptionPane.showInputDialog(null, "Opções\n1. Cadastrar\n2. Alterar\n3. Consultar\n4. Excluir\n5.Sair");
        int op = Integer.parseInt(x);
        switch (op) {
            case 1:
                StudentDAO.registerStudent();
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
        }
    }

}
