public class DriverTest {
    public static void main(String[] args) {
        try {
            String className = "oracle.jdbc.driver.OracleDriver";
            Class driverObject = Class.forName(className);
            System.out.println("driverObject=" + driverObject);
            System.out.println("your JDBC Driver OK.");
        } catch (Exception e) {
            System.out.println("Failed: " + e.getMessage());
        }
    }
}
