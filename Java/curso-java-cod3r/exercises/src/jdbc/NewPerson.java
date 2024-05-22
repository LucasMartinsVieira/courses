package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class NewPerson {
    public static void main(String[] args) throws SQLException {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the name: ");
        String name = scanner.nextLine();

        Connection connection = FactoryConnection.getConnection();

        String sql = "INSERT INTO person (name) VALUES (?)";
        PreparedStatement stmt =  connection.prepareStatement(sql);
        stmt.setString(1, name);

        stmt.execute();
        System.out.println("Person inserted successfully");

        scanner.close();
    }
}
