package jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class QueryPerson1 {
    public static void main(String[] args) throws SQLException {
        Connection connection = FactoryConnection.getConnection();
        String sql = "SELECT * FROM person";

        Statement stmt = connection.createStatement();
        ResultSet result = stmt.executeQuery(sql);

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
    }
}
