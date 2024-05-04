package Airline.View;

import Airline.Model.Flight_DAO;
import Airline.Model.Flights_DAO;

import javax.swing.*;

public class Reservation_GUI {

    public Flights_DAO flights;

    public Reservation_GUI(Flights_DAO flights) {
        this.flights = flights;
    }

    public void show() {
        reservation();
    }

    private void reservation() {
        try {
            boolean isCrowded = true;
            Flight_DAO flight = flights.perFlightNumber();
            for (int i = 0; i < flight.reservation.length; i++) {
                if (!flight.reservation[i]) {
                    isCrowded = false;
                    break;
                }
            }
            if (!isCrowded) {
                int seat = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o número do assento que deseja reservar:"));
                if (seat > 6 || seat < 1) {
                    throw new Exception();
                }
                if (!flight.reservation[seat - 1]) {
                    flight.reservation[seat - 1] = true;
                    JOptionPane.showMessageDialog(null, "Assento reservado com sucesso!");
                } else {
                    error("<Erro> Assento já reservado!");
                }
            } else {
                error("<Erro> Voo lotado!");
            }
        } catch (Exception e) {
            error("<Erro> Digite um número de assento válido!");
        }
    }

    private void error(String message) {
        JOptionPane.showMessageDialog(null, message);
    }

}
