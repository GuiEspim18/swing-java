package Airline.View;

import javax.swing.*;

public class Menu_GUI {

    public static void show() {
        boolean exit = false;
        while (!exit) {
            try {
                int option = choose();
                switch (option) {
                    case 1:
                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                    case 4:
                        break;
                    case 5:
                        exit = true;
                        JOptionPane.showMessageDialog(null, "Até logo!");
                        break;
                    default:
                        error("<Erro> Digite um digito válido!");
                        break;
                }
            } catch (Exception e) {
                error("<Erro>: Digite um digito ao invés de um caracter!");
            }
        }
    }

    private static int choose() {
        String[] options = {"Cadastrar um voo", "Listar voos", "Editar um voo", "Excluir voo", "Sair"};
        String message = "";
        for (int i = 0; i < options.length; i++) {
            int index = i + 1;
            message += "(" + index + ") " + options[i] + "\n";
        }
        return Integer.parseInt(JOptionPane.showInputDialog(null, message));
    }

    private static void error(String message) {
        JOptionPane.showMessageDialog(null, message);
    }

}
