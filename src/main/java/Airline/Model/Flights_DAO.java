package Airline.Model;

import javax.swing.*;

public class Flights_DAO {

    private Flight_DAO[] flights = {
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

    public Flight_DAO perFlightNumber() {
        try {
            int number = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o número do voo: "));
            boolean found = false;
            Flight_DAO flight = new Flight_DAO();
            for (int i = 0; i < flights.length; i++) {
                if (flights[i].number == number) {
                    found = true;
                    flight = flights[i];
                    break;
                }
            }
            if (!found) {
                error("<Erro> Voo não encontrado!");
            } else {
                return flight;
            }
        } catch (Exception e) {
            error("<Erro> Digite um dígito!");
        }
        return null;
    }

    public Flight_DAO perOrigin() {
        try {
            String origin = JOptionPane.showInputDialog(null, "Digite a origem do voo:");
            if (origin.isBlank() || origin.isEmpty()) {
                throw new Exception();
            }
            boolean found = false;
            Flight_DAO flight = new Flight_DAO();
            for (int i = 0; i < flights.length; i++) {
                if (flights[i].origin.equals(origin)) {
                    found = true;
                    flight = flights[i];
                    break;
                }
            }
            if (!found) {
                error("<Erro> Voo não encontrado!");
            } else {
                return flight;
            }
        } catch (Exception e) {
            error("<Erro> Digite uma origem!");
        }
        return null;
    }

    public Flight_DAO perDestination() {
        try {
            String destination = JOptionPane.showInputDialog(null, "Digite o destino do voo:");
            if (destination.isBlank() || destination.isEmpty()) {
                throw new Exception();
            }
            boolean found = false;
            Flight_DAO flight = new Flight_DAO();
            for (int i = 0; i < flights.length; i++) {
                if (flights[i].destination.equals(destination)) {
                    found = true;
                    flight = flights[i];
                    break;
                }
            }
            if (!found) {
                error("<Erro> Voo não encontrado!");
            } else {
                return flight;
            }
        } catch (Exception e) {
            error("<Erro> Digite um destino!");
        }
        return null;
    }

    private void error(String message) {
        JOptionPane.showMessageDialog(null, message);
    }

    public void updateFlights(Flight_DAO flight) {
        for (int i = 0; i < flights.length; i++) {
            if (flights[i].number == flight.number) {
                flights[i] = flight;
            }
        }
    }

}
