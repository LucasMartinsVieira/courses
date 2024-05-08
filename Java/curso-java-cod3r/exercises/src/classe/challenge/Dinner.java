package classe.challenge;

public class Dinner {
    public static void main(String[] args) {
        Food f1 = new Food("Rice", 0.180);
        Food f2 = new Food("Beans", 0.300);

        Person p = new Person("Lucas", 99.8);
        System.out.println(p.introduceYourself());
        p.eat(f1);

        System.out.println(p.introduceYourself());

        p.eat(f2);
        System.out.println(p.introduceYourself());
    }
}
