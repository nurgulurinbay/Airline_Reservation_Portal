public class Flight {

    private String flightNumber;
    private int availableSeats;

    public Flight() {}

    public Flight(String flightNumber, int availableSeats) {
        this.flightNumber = flightNumber;
        this.availableSeats = availableSeats;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public int getAvailableSeats() {
        return availableSeats;
    }

    public void reserveSeat() {
        if (availableSeats > 0) {
            availableSeats--;
        }
    }

    @Override
    public String toString() {
        return "Flight[number=" + flightNumber + ", seats=" + availableSeats + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Flight)) return false;

        Flight other = (Flight) obj;
        return flightNumber.equals(other.flightNumber);
    }

    @Override
    public int hashCode() {
        int result = 19;
        result = 31 * result + flightNumber.hashCode();
        return result;
    }
}
