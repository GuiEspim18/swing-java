package Airline.View;

import Airline.Model.Flight;

import javax.swing.*;

public class Register_GUI {

    public static Flight show() {
        Flight flight = new Flight();
        flight.origin = origin();
        flight.destination = destination();
        flight.duration = duration();
        return flight;
    }

    private static String origin() {
        return JOptionPane.showInputDialog(null, "Digite a origem do voo: ");
    }

    private static int duration() {
        return Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a duração do voo: "));
    }

    private static String destination() {
        return JOptionPane.showInputDialog(null, "Digite p destino do voo: ");
    }

}
