import java.util.Scanner;

public class DebugFour4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String destinationCity;
        String departureCity;
        String mode;

        DebugTrip trip1;
        DebugTrip trip2;
        DebugTrip trip3;

        System.out.print("Enter destination city >> ");
        destinationCity = input.nextLine();

        System.out.print("Enter departure city >> ");
        departureCity = input.nextLine();

        System.out.print("Enter mode of transportation >> ");
        mode = input.nextLine();

        trip1 = new DebugTrip(destinationCity);
        trip2 = new DebugTrip(destinationCity, departureCity);
        trip3 = new DebugTrip(destinationCity, departureCity, mode);

        display(trip1);
        display(trip2);
        display(trip3);
    }

    public static void display(DebugTrip trip) {
        System.out.println("Going to " + trip.getDestination());
        System.out.println(" Leaving from " + trip.getDepartureCity());
        System.out.println(" Going by " + trip.getMode());
        System.out.println();
    }
}

class DebugTrip {
    private String destination;
    private String departure;
    private String mode;

    public DebugTrip(String destination) {
        this.destination = destination;
        this.departure = "Unknown";
        this.mode = "Unknown";
    }

    public DebugTrip(String destination, String departure) {
        this.destination = destination;
        this.departure = departure;
        this.mode = "Unknown";
    }

    public DebugTrip(String destination, String departure, String mode) {
        this.destination = destination;
        this.departure = departure;
        this.mode = mode;
    }

    public String getDestination() {
        return destination;
    }

    public String getDepartureCity() {
        return departure;
    }

    public String getMode() {
        return mode;
    }
}
