package Airline.View;

import Airline.Model.Flight_DAO;

import javax.swing.*;

public class Menu_GUI {

    private static Flight_DAO[] flights = {
            new Flight_DAO(1, "Guarulhos - Brasil", "Lisboa - Portugal"),
            new Flight_DAO(2, "São Paulo - Brasil", "Cancún - México"),
            new Flight_DAO(3, "Rio de Janeiro - Brasil", "Madrid - Espanha"),
            new Flight_DAO(4, "Salvador - Brasil", "Natal - Brasil"),
            new Flight_DAO(5, "Berlin - Alemanha", "São Paulo - Brasil"),
            new Flight_DAO(6, "Natal - Brasil", "Orlando - EUA"),
            new Flight_DAO(8, "Curitiba - Brasil", "Paris - França"),
            new Flight_DAO(9, "Santa Catarina - Brasil", "Tokio - Japão"),
            new Flight_DAO(10, "Campinas - Brasil", "Los Angeles - EUA")
    };

    public static void show() {
        boolean exit = false;

        while (!exit) {
            try {
                int option = choose();
                switch (option) {
                    case 1: new Consult_GUI(flights).show(); break;
                    case 2: break;
                    case 3:
                        exit = true;
                        JOptionPane.showMessageDialog(null, "Até logo!");
                        break;
                    default:
                        error("<Erro> Digite um digito válido!");
                        break;
                }
            } catch (Exception e) {
                e.printStackTrace();
                error("<Erro>: Digite um digito ao invés de um caracter!");
            }
        }
    }

    private static int choose() {
        String[] options = {"Consultar", "Efetuar reserva", "Sair"};
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
