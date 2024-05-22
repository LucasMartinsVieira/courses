package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestConnection {
    public static void main(String[] args) throws SQLException {
        final String url = "jdbc:mysql://localhost:3306/?verifyServerCertificate=false&useSSL=true";
        final String user = "user";
        final String password = "example";

        Connection connection = DriverManager.getConnection(url, user, password);

        System.out.println("Connection established with success!");
        connection.close();
    }
}
