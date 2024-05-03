package Airline.View;

import Airline.Model.Flight;

import javax.swing.*;

public class Menu_GUI {

    private static int max = 10;
    private static Flight[] flights = new Flight[max];
    private static int flightsRegistered = 0;

    public static void show() {
        boolean exit = false;

        while (!exit) {
            try {
                int option = choose();
                switch (option) {
                    case 1: register(); break;
                    case 2: findAll(); break;
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
                e.printStackTrace();
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

    public static void register() {
        if (flightsRegistered < max) {
            Flight flight = Register_GUI.show();
            flights[flightsRegistered] = flight;
            flightsRegistered++;
        } else {
            error("<Erro> Você só pode cadastrar até " + max + " voos!");
        }
    }

    public static void findAll() {
        String message = "";
        for (int i = 0; i < flights.length; i++) {
            if (flights[i] == null) {
                break;
            }
            message += "Origem: " + flights[i].origin + " | Duração: " + flights[i].duration + "H | Destino: " + flights[i].destination;
        }
        JOptionPane.showMessageDialog(null, message);
    }

    private static void error(String message) {
        JOptionPane.showMessageDialog(null, message);
    }

}
