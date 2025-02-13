package JDBCUtil;
import java.sql.Connection;
import java.sql.DriverManager;

public class JDBCUtil {
    public static Connection getConnection() {
        Connection c = null;
        try {
            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
            // Thông tin của mysql => Phục vụ cho kết nối đến database
            String url = "jdbc:mysql://127.0.0.1:3306/QLMB";
            String username = "root";
            String password = "phuc123tp"; // Nhập pass

            // dùng getConnection để kết nối đến mysql
            // getConnection() ở đây khác với tên method() nghe, DriverManager.getConnection là method có sẵn
            c = DriverManager.getConnection(url, username, password);

            System.out.println("Connect successful");
        }catch (Exception e) {
            System.out.println("Connect fail");
            e.printStackTrace();
        }
        return c;
    }

    public static void closeConnection(Connection c) {
        try {
            // Kiểm tra nếu connection != null, tức là đang có kết nối
            // Gọi close() để đóng kết nối
            if (c != null) c.close();
            System.out.println("Connect close...");
        }catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }
}
