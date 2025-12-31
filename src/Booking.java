public class Booking {

    private Flight flight;
    private Passenger passenger;

    public Booking() {}

    public Booking(Flight flight, Passenger passenger) {
        this.flight = flight;
        this.passenger = passenger;
    }

    public void confirmBooking() {
        flight.reserveSeat();
    }

    @Override
    public String toString() {
        return "Booking{ " + passenger + ", " + flight + " }";
    }
}


