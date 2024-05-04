package Airline.View;

import Airline.Model.Flight_DAO;

import javax.swing.*;

public class Consult_GUI {

    public Flight_DAO[] flights;

    public Consult_GUI(Flight_DAO[] flights) {
        this.flights = flights;
    }

    public void show() {
        try {
            int option = choose();
            switch (option) {
                case 1: perFlightNumber(); break;
                case 2: perOrigin(); break;
                case 3: perDestination(); break;
                default: error("<Erro> Digite um dígito válido!"); break;
            }
        } catch(Exception e) {
            error("<Erro> Digite um dígito!");
        }
    }

    private void perFlightNumber() {
        try {
            int number = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o número do voo: "));
            boolean found = false;
            for (int i = 0; i < flights.length; i++) {
                if (flights[i].number == number) {
                    found = true;
                    show(flights[i]);
                    break;
                }
            }
            if (!found) {
                error("<Erro> Voo não encontrado!");
            }
        } catch (Exception e) {
            error("<Erro> Digite um dígito!");
        }
    }

    private void perOrigin() {
        try {
            String origin = JOptionPane.showInputDialog(null, "Digite a origem do voo:");
            if (origin.isBlank() || origin.isEmpty()) {
                throw new Exception();
            }
            boolean found = false;
            for (int i = 0; i < flights.length; i++) {
                if (flights[i].origin.equals(origin)) {
                    found = true;
                    show(flights[i]);
                    break;
                }
            }
            if (!found) {
                error("<Erro> Voo não encontrado!");
            }
        } catch (Exception e) {
            error("<Erro> Digite uma origem!");
        }
    }

    private void perDestination() {
        try {
            String destination = JOptionPane.showInputDialog(null, "Digite o destino do voo:");
            if (destination.isBlank() || destination.isEmpty()) {
                throw new Exception();
            }
            boolean found = false;
            for (int i = 0; i < flights.length; i++) {
                if (flights[i].destination.equals(destination)) {
                    found = true;
                    show(flights[i]);
                    break;
                }
            }
            if (!found) {
                error("<Erro> Voo não encontrado!");
            }
        } catch (Exception e) {
            error("<Erro> Digite um destino!");
        }
    }

    private void show(Flight_DAO flight) {
        String message = "Número: " + flight.number + "\nOrigem: " + flight.origin + "\nDestino: " + flight.destination + "\n\nAssentos:\n";
        String line = "";
        for (int i = 0; i < 6; i++) {
            int index = i + 1;
            if (index % 2 == 0) {
                line += index + " [ ]\n";
            } else {
                line += index + " [ ]  ";
            }
        }
        message += line;
        JOptionPane.showMessageDialog(null, message);
    }

    private int choose() {
        String[] options = { "Por número de voo", "Por origem", "Por dentino" };
        String message = "";
        for (int i = 0; i < options.length; i++) {
            int index = i + 1;
            message += "(" + index + ") " + options[i] + "\n";
        }
        return Integer.parseInt(JOptionPane.showInputDialog(null, message));
    }

    private void error(String message) {
        JOptionPane.showMessageDialog(null, message);
    }

}
