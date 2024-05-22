package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class ChangePersonName {
    public static void main(String[] args) throws SQLException {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the id of the person: ");
        int id = scanner.nextInt();

        String selectSQL = "SELECT id, name FROM person WHERE id = ?";
        String updateSQL = "UPDATE person SET NAME = ? WHERE id = ?";

        Connection connection = FactoryConnection.getConnection();
        PreparedStatement stmt = connection.prepareStatement(selectSQL);
        stmt.setInt(1, id);
        ResultSet r = stmt.executeQuery();

        if (r.next()) {
            Person p = new Person(r.getInt(1), r.getString(2));
            System.out.println("The current name is: " + p.getName());
            scanner.nextLine();

            System.out.print("Enter the new name: ");
            String newName = scanner.nextLine();

            stmt.close();
            stmt = connection.prepareStatement(updateSQL);
            stmt.setString(1, newName);
            stmt.setInt(2, id);
            stmt.execute();

            System.out.println("Person changed successfully");
        } else {
            System.err.println("Person not found!");
        }


        connection.close();
        scanner.close();
    }
}
