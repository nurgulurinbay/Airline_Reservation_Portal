import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class TestDB {
    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/postgres";
        String user = "postgres";
        String pass = "Qiopuk0009";

        try {
            Connection conn = DriverManager.getConnection(url, user, pass);
            System.out.println("Connected successfully!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

