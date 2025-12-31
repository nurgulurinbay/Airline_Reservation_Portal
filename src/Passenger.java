public class Passenger extends Person {

    private String passportNumber;

    public Passenger() {}

    public Passenger(String name, String passportNumber) {
        super(name);
        this.passportNumber = passportNumber;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    @Override
    public String getRole() {
        return "Passenger";
    }

    @Override
    public String toString() {
        return "Passenger{name='" + name + "', passport='" + passportNumber + "'}";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Passenger)) return false;

        Passenger other = (Passenger) obj;
        return passportNumber.equals(other.passportNumber);
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + passportNumber.hashCode();
        return result;
    }
}

