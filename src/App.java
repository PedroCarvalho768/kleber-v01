import java.util.ArrayList;
import java.util.Scanner;

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

        // Initializes a Scanner to read user input
        Scanner scanner = new Scanner(System.in);
        // Loop to keep the program running until the user decides to quit
        while (true) {
        System.out.print("Enter the Flight ID to book (or 'q' to quit): ");
            String input = scanner.next();

     // Check if the user wants to quit
        if (input.equalsIgnoreCase("q")) {
            System.out.println("Exiting the booking system. Goodbye!");
             break;
    }

        try {
        // Attempt to parse the input as an integer for the flight ID
        int flightId = Integer.parseInt(input);

        // Variable to track if the flight with the specified ID is found
        boolean flightFound = false;

        // Iterate through the list of flights to find a match
        for (Flight flight : flights) {
            if (flight.id == flightId) {
                // Check if the flight is not already booked
                if (!flight.booked) {
                    // Mark the flight as booked and display success message
                    flight.booked = true;
                    System.out.println("Successfully booked flight ID " + flightId + " from " 
                                       + flight.origin + " to " + flight.destination);
                } else {
                    // If already booked, notify the user
                    System.out.println("Flight ID " + flightId + " is already booked.");
                }
                flightFound = true;
                break;
            }
        }

        // If no matching flight ID was found, inform the user
        if (!flightFound) {
            System.out.println("Flight ID not found.");
        }

    } catch (NumberFormatException e) {
        System.out.println("Invalid input. Please enter a valid flight ID or 'q' to quit.");
    }
}

// Close the Scanner to prevent resource leaks
scanner.close();
}
}

