package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QueryPerson2 {
    public static void main(String[] args) throws SQLException {
        Scanner scanner = new Scanner(System.in);

        Connection connection = FactoryConnection.getConnection();
        String sql = "SELECT * FROM person WHERE name like ?";

        System.out.print("Enter the value for the query: ");
        String query = scanner.nextLine();

        PreparedStatement stmt = connection.prepareStatement(sql);
        stmt.setString(1, "%" + query + "%");
        ResultSet result = stmt.executeQuery();

        List<Person> persons = new ArrayList<>();
        while (result.next()) {
            int id = result.getInt("id");
            String name = result.getString("name");
            persons.add(new Person(id, name));
        }

        for (Person p : persons) {
            System.out.println(p.getId() + " ==> " + p.getName());
        }

        stmt.close();
        connection.close();
        scanner.close();
    }
}
