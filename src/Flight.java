import java.util.Date;
import java.util.Calendar;

// Creating a java class to represent each of our flights
// Each flight has a unique id, origin, destination, departure time, arrival time, and duration
// We're using Date objects for the departure and arrival times to make time calculations easier
public class Flight {
    int id;
    String origin;
    String destination;
    Date departureTime;
    Date arrivalTime;
    int duration;

    boolean booked = false;

    public Flight(int id, String origin, String destination, int departureDay, int departureMonth, int departureYear,
            int departureHour, int departureMinute, int arrivalDay, int arrivalMonth, int arrivalYear, int arrivalHour,
            int arrivalMinute) {
        this.id = id;
        this.origin = origin;
        this.destination = destination;

        Calendar calendar = Calendar.getInstance();

        calendar.set(departureYear, departureMonth, departureDay, departureHour, departureMinute);
        this.departureTime = calendar.getTime();

        calendar.set(arrivalYear, arrivalMonth, arrivalDay, arrivalHour, arrivalMinute);
        this.arrivalTime = calendar.getTime();

        this.duration = (int) ((this.arrivalTime.getTime() - this.departureTime.getTime()) / 1000 / 60);
    }
}
