public class DBConnectionPerformanceTest {

    private static final int NUMBER_OF_TESTS = 3000;
    private static DBConnectObjectPool dbPool = new DBConnectObjectPool(24);

    public static void main(String[] args) {
        // Testing with the object pool
        long startTime_withPooling = System.nanoTime();
        for (int i = 0; i < NUMBER_OF_TESTS; i++) {
            DBConnect conn = dbPool.getConnection();
            conn.dbMethod();
            dbPool.releaseConnection(conn);
        }
        long endTime_withPooling = System.nanoTime();

        // Testing without using the object pool
        long startTime_withoutPooling = System.nanoTime();
        for (int i = 0; i < NUMBER_OF_TESTS; i++) {
            DBConnect conn = new DBConnect();
            conn.dbMethod();
            conn.dbConnectionClose();
        }
        long endTime_withoutPooling = System.nanoTime();

        // Calculat and output results
        long totalTime_withPooling = (endTime_withPooling - startTime_withPooling) / 1_000_000; // convert to milliseconds
        long totalTime_withoutPooling = (endTime_withoutPooling - startTime_withoutPooling) / 1_000_000; // convert to milliseconds

        System.out.println("Total time with object pooling: " + totalTime_withPooling + " ms");
        System.out.println("Total time without object pooling: " + totalTime_withoutPooling + " ms");

        // Comparing results from the two tests
        if (totalTime_withPooling < totalTime_withoutPooling) {
            System.out.println("Results with object pooling: " + totalTime_withPooling);
            System.out.println("Results without object pooling: " + totalTime_withoutPooling);
            System.out.println("Analysis: Object pooling is faster by " + (totalTime_withoutPooling - totalTime_withPooling) + " ms");
        } else if (totalTime_withPooling > totalTime_withoutPooling) {
            System.out.println("Results with object pooling: " + totalTime_withPooling);
            System.out.println("Results without object pooling: " + totalTime_withoutPooling);
            System.out.println("Analysis: Object pooling is slower by " + (totalTime_withPooling - totalTime_withoutPooling) + " ms");
        } else {
            System.out.println("Results with object pooling: " + totalTime_withPooling);
            System.out.println("Results without object pooling: " + totalTime_withoutPooling);
            System.out.println("Analysis: No significant time difference between object pooling and non-pooling.");
        }
    }
    
}
