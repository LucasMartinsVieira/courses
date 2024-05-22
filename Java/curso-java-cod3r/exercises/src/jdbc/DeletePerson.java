package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DeletePerson {
    public static void main(String[] args) throws SQLException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the id: ");
        int id = scanner.nextInt();

        Connection connection = FactoryConnection.getConnection();
        String sql = "DELETE FROM person WHERE id = ?";


        PreparedStatement stmt = connection.prepareStatement(sql);
        stmt.setInt(1, id);

        int count = stmt.executeUpdate();

        if (count > 0) {
            System.out.println("Person deleted successfully");
        } else {
            System.out.println("Something went wrong!");
        }

        System.out.println("Line(s) affected: " + count);

        scanner.close();
        connection.close();
    }
}
