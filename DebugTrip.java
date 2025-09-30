public class DebugTrip {
    private String destination;
    private String departure;
    private String mode;

    private static final String DEFAULT_CITY = "Atlanta";
    private static final String DEFAULT_MODE = "car";

    // Constructor with one argument
    public DebugTrip(String destination) {
        this(destination, DEFAULT_CITY, DEFAULT_MODE);
    }

    // Constructor with two arguments
    public DebugTrip(String destination, String departure) {
        this(destination, departure, DEFAULT_MODE);
    }

    // Constructor with three arguments
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

    // Optional: main method for testing
    public static void main(String[] args) {
        DebugTrip trip1 = new DebugTrip("Miami");
        DebugTrip trip2 = new DebugTrip("Miami", "New York");
        DebugTrip trip3 = new DebugTrip("Miami", "New York", "plane");

        System.out.println("Trip 1: To " + trip1.getDestination() + " from " + trip1.getDepartureCity() + " by " + trip1.getMode());
        System.out.println("Trip 2: To " + trip2.getDestination() + " from " + trip2.getDepartureCity() + " by " + trip2.getMode());
        System.out.println("Trip 3: To " + trip3.getDestination() + " from " + trip3.getDepartureCity() + " by " + trip3.getMode());
    }
}
