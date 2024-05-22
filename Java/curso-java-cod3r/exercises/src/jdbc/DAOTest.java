package jdbc;

public class DAOTest {
    public static void main(String[] args) {
        DAO dao = new DAO();

        String sql = "INSERT INTO person (name, id) VALUES (?, ?)";

        System.out.println(dao.include(sql, "Monkey D. Luffy", 1000));
        System.out.println(dao.include(sql, "Naruto Uzumaki", 1001));
        System.out.println(dao.include(sql, "Ichigo Kurosaki", 1002));
        System.out.println(dao.include(sql, "Son Goku", 1003));

        dao.close();
    }
}
