import java.sql.*;
import java.util.ArrayList;
import java.util.List;
public class FlightDAO {
    public void addFlight(String flightNumber, int seats) {
        String sql = "INSERT INTO flights(flight_number, available_seats) VALUES (?, ?)";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, flightNumber);
            stmt.setInt(2, seats);
            stmt.executeUpdate();
            System.out.println("Flight added!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<String> getAllFlights() {
        List<String> flights = new ArrayList<>();
        String sql = "SELECT * FROM flights";

        try (Connection conn = DBConnection.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                flights.add(rs.getInt("id") + " | " +
                        rs.getString("flight_number") + " | " +
                        rs.getInt("available_seats"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return flights;
    }
    public void updateSeats(int id, int newSeats) {
        String sql = "UPDATE flights SET available_seats = ? WHERE id = ?";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, newSeats);
            stmt.setInt(2, id);
            stmt.executeUpdate();
            System.out.println("Seats updated!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteFlight(int id) {
        String sql = "DELETE FROM flights WHERE id = ?";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, id);
            stmt.executeUpdate();
            System.out.println("Flight deleted!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
