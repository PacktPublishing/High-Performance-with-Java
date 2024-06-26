import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CH18Example5 {
    private static final Logger logger = LogManager.getLogger(CH18Example5.class);

    public static void main(String[] args) {
        double cpuUsage = 80.0;
        double memoryUsage = 90.0;
        double responseTime = 600;

        if (isAnomalous(cpuUsage, memoryUsage, responseTime)) {
            logger.warn("Anomalous activity detected: CPU Usage: {}, Memory Usage: {}, Response Time: {}", cpuUsage, memoryUsage, responseTime);
        } else {
            logger.info("System operating normally.");
        }
    }

    private static boolean isAnomalous(double cpuUsage, double memoryUsage, double responseTime) {
        return cpuUsage > 75.0 && memoryUsage > 85.0 && responseTime > 500;
    }
}

