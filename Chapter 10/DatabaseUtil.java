import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.sql.DataSource;

public class DatabaseUtil {
    
    private DataSource dataSource; // Assume dataSource has been initialized elsewhere

    public void executeQuery(String query) {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        try {
            conn = dataSource.getConnection();
            stmt = conn.createStatement();
            rs = stmt.executeQuery(query);
            
            // Process the result set
            while (rs.next()) {
                // Handle data
            }
        } catch (Exception e) {
            // Handle exception
            e.printStackTrace();
        } finally {
            // Ensure resources are closed in finally block to avoid leaks
            if (rs != null) {
                try {
                    rs.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            if (stmt != null) {
                try {
                    stmt.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
