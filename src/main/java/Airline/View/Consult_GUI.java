package Airline.View;

import Airline.Model.Flight_DAO;
import Airline.Model.Flights_DAO;

import javax.swing.*;

public class Consult_GUI {

    Flights_DAO flights;

    public Consult_GUI(Flights_DAO flights) {
        this.flights = flights;
    }

    public void show() {
        try {
            int option = choose();
            switch (option) {
                case 1: showFlight(flights.perFlightNumber()); break;
                case 2: showFlight(flights.perOrigin()); break;
                case 3: showFlight(flights.perDestination()); break;
                default: error("<Erro> Digite um dígito válido!"); break;
            }
        } catch(Exception e) {
            error("<Erro> Digite um dígito!");
        }
    }

    private void showFlight(Flight_DAO flight) {
        if (flight != null) {
            String message = "Número: " + flight.number + "\nOrigem: " + flight.origin + "\nDestino: " + flight.destination + "\n\nAssentos:\n";
            String line = "";
            for (int i = 0; i < 6; i++) {
                int index = i + 1;
                String status = flight.reservation[i] ? "X" : " ";
                if (index % 2 == 0) {
                    line += index + " [" + status + "]\n";
                } else {
                    line += index + " [" + status + "]  ";
                }
            }
            message += line;
            JOptionPane.showMessageDialog(null, message);
        }
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
