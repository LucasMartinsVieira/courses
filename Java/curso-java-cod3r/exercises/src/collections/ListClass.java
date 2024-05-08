package collections;

import java.util.ArrayList;

public class ListClass {
    public static void main(String[] args) {
        ArrayList<User> list = new ArrayList<>();

        User u1 = new User("Lucas");

        list.add(u1);
        list.add(new User("Thiago"));
        list.add(new User("Carlos"));
        list.add(new User("Bia"));
        list.add(new User("Manu"));

        System.out.println(list.get(3));
        list.remove(1);

        System.out.println(">>>>>>>>> " + list.remove(1));
        System.out.println(list.remove(new User("Manu")));

        System.out.println("Has? " + list.contains(new User("Bia")));

        for (User u : list) {
            System.out.println(u.toString());
        }
    }
}
