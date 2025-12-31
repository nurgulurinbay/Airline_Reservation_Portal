public class Main {

    public static void main(String[] args) {

        Flight f1 = new Flight("FL101", 5);
        Flight f2 = new Flight("FL202", 2);
        Flight f3 = new Flight("FL303", 10);

        Passenger p1 = new Passenger("Nurgul", "P12345");
        Passenger p2 = new Passenger("Nurislam", "P67890");

        Booking b1 = new Booking(f1, p1);
        Booking b2 = new Booking(f2, p2);

        Flight[] flights = { f1, f2, f3 };

        for (int i = 0; i < flights.length; i++) {
            if (flights[i].getFlightNumber().equals("FL202")) {
                System.out.println("Found flight: " + flights[i]);
            }
        }

        System.out.println("\nFlights with more than 3 seats:");
        for (int i = 0; i < flights.length; i++) {
            if (flights[i].getAvailableSeats() > 3) {
                System.out.println(flights[i]);
            }
        }

        for (int i = 0; i < flights.length - 1; i++) {
            for (int j = 0; j < flights.length - 1 - i; j++) {
                if (flights[j].getAvailableSeats() > flights[j + 1].getAvailableSeats()) {
                    Flight temp = flights[j];
                    flights[j] = flights[j + 1];
                    flights[j + 1] = temp;
                }
            }
        }

        System.out.println("\nSorted flights:");
        for (int i = 0; i < flights.length; i++) {
            System.out.println(flights[i]);
        }

        b1.confirmBooking();
        b2.confirmBooking();
    }
}
