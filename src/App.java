import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {

        ArrayList<Flight> flights = new ArrayList<Flight>();
        flights.add(new Flight(1, "LAX", "DFW", 5, 5, 2020, 11, 0, 5, 5, 2020, 11, 30));
        flights.add(new Flight(2, "DFW", "JFK", 7, 7, 2020, 11, 0, 7, 7, 2020, 12, 0));
        flights.add(new Flight(3, "JFK", "SFO", 8, 8, 2020, 12, 0, 8, 8, 2020, 13, 0));
        flights.add(new Flight(4, "SFO", "LAX", 9, 9, 2020, 13, 0, 9, 9, 2020, 14, 0));
        flights.add(new Flight(5, "LAX", "ORD", 10, 10, 2020, 14, 0, 10, 10, 2020, 15, 0));
        flights.add(new Flight(6, "ORD", "DEN", 11, 11, 2020, 15, 0, 11, 11, 2020, 16, 0));
        flights.add(new Flight(7, "DEN", "IAH", 12, 12, 2020, 16, 0, 12, 12, 2020, 17, 0));
        flights.add(new Flight(8, "IAH", "MIA", 13, 13, 2020, 17, 0, 13, 13, 2020, 18, 0));
        flights.add(new Flight(9, "MIA", "LAX", 14, 14, 2020, 18, 0, 14, 14, 2020, 19, 0));

        for (Flight flight : flights) {
            if (flight.booked == false) {
                System.out.println(flight.id + " " + flight.origin + " " + flight.destination + " "
                        + flight.departureTime + " " + flight.arrivalTime + " " + flight.duration);
            }
        }

    }
}
