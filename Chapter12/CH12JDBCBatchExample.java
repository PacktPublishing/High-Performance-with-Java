import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CH12JDBCBatchExample {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost/testdb";
        String user = "root";
        String password = "password";

        String sql = "INSERT INTO staff (name, department) VALUES (?, ?)";

        try (Connection conn = DriverManager.getConnection(url, user, password);
             PreparedStatement statement = conn.prepareStatement(sql)) {

            conn.setAutoCommit(false);  // Turn off auto-commit

            // Add batch operations
            statement.setString(1, "Brenda");
            statement.setString(2, "Marketing");
            statement.addBatch();

            statement.setString(1, "Chris");
            statement.setString(2, "Warehouse");
            statement.addBatch();

            statement.setString(1, "Diana");
            statement.setString(2, "HR");
            statement.addBatch();

            int[] updateCounts = statement.executeBatch();

            conn.commit();  // Commit all the changes

            System.out.println("Rows inserted: " + updateCounts.length);
        } catch (SQLException e) {
            System.err.println("SQL Exception: " + e.getMessage());
        }
    }
}

