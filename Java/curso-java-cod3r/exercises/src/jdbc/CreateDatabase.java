package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateDatabase {
    public static void main(String[] args) throws SQLException {
        final String url = "jdbc:mysql://localhost:3306/?verifyServerCertificate=false&useSSL=true";
        final String user = "user";
        final String password = "example";

        Connection connection = DriverManager.getConnection(url, user, password);

        Statement stmt = connection.createStatement();

        stmt.execute("DROP DATABASE course_java");
        System.out.println("Database create successfully");
        connection.close();
    }
}
