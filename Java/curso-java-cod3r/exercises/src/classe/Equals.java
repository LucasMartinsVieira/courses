package classe;

public class Equals {
    public static void main(String[] args) {
        User u1 = new User();
        u1.name = "Pedro Silva";
        u1.email = "pedro.silva@ezemail.com.br";

        User u2 = new User();
        u2.name = "Pedro Silva";
        u2.email = "pedro.silva@ezemail.com.br";

        System.out.println(u1 == u2);
        System.out.println(u1.equals(u2));
        System.out.println(u2.equals(u1));

//        System.out.println(u2.equals(new Date()));
    }
}
