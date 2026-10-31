import java.sql.*;

public class DBConnection {
    public static void main(String[] args) {
        String driver = "oracle.jdbc.driver.OracleDriver";
        String user = "hr";
        String pwd = "hr";
        String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
        Connection conn = null;
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, user, pwd);
            System.out.println("loading success");
        } catch (Exception e) {
            System.out.println("driver error:" + e);
        } finally {
            try {
                if (conn != null) conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
