public class ObjectPoolDemoApp {
    public static void main(String[] args) {
        DBConnectObjectPool objectPool = new DBConnectObjectPool(8);

        // Simulating usage of connections
        for (int i = 0; i < 10; i++) {
            DBConnect conn = objectPool.getConnection();
            conn.dbMethod();
            objectPool.releaseConnection(conn);
        }
    }
}
