package Airline.Model;

public class Flight {

    public String destination;
    public String origin;
    public int number;
    public boolean[][] reservation = {
            {false}, {false},
            {false}, {false},
            {false}, {false}
    };

    public Flight(int number, String origin, String destination) {
        this.number = number;
        this.origin = origin;
        this.destination = destination;
    }

    public Flight() {
    }

}
