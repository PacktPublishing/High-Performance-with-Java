public class DBConnect {
    static int dbConnectionCount = 0;
    private int dbConnectID;

    public DBConnect() {
        this.dbConnectID = ++dbConnectionCount;
        System.out.println("Database connection created: DBConnect" + dbConnectID + ".");
    }

    public void dbMethod() {
        // placeholder
    }

    public void dbConnectionClose() {
        System.out.println("Database connection closed: DBConnect" + dbConnectID + ".");
    }
}
