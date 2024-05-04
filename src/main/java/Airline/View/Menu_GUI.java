package Airline.View;

import Airline.Model.Flight_DAO;
import Airline.Model.Flights_DAO;

import javax.swing.*;

public class Menu_GUI {

    public static void show() {
        boolean exit = false;
        Flights_DAO flights = new Flights_DAO();

        while (!exit) {
            try {
                int option = choose();
                switch (option) {
                    case 1: new Consult_GUI(flights).show(); break;
                    case 2: new Reservation_GUI(flights).show(); break;
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
