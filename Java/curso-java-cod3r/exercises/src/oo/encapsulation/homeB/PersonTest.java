package oo.encapsulation.homeB;

public class PersonTest {
    public static void main(String[] args) {
        Person p1 = new Person("Lucas", "Vieira", 20);
        p1.setAge(235); // change

        System.out.println(p1.getAge()); // read
        System.out.println(p1);
        System.out.println(p1.getFullName());
    }
}
