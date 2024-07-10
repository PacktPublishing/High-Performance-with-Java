import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

public class DatabaseConfig {

    private static HikariDataSource dataSource;

    static {
        HikariConfig config = new HikariConfig();
        config.setJdbcUrl("jdbc:postgresql://localhost:5432/mydatabase"); // Your database URL
        config.setUsername("databaseUser"); // Your database username
        config.setPassword("databasePassword"); // Your database password

        // Pool configuration
        config.setMaximumPoolSize(10); // Maximum number of connections in the pool
        config.setMinimumIdle(5); // Minimum number of idle connections in the pool
        config.setIdleTimeout(600000); // 10 minutes
        config.setMaxLifetime(1800000); // 30 minutes
        config.setConnectionTimeout(30000); // 30 seconds

        dataSource = new HikariDataSource(config);
    }

    public static HikariDataSource getDataSource() {
        return dataSource;
    }
}
