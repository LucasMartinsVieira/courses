package oo.abstractPackage;

public class AbstractTest {
    public static void main(String[] args) {
        Mammal a = new Dog();

        System.out.println(a.toMove());
        System.out.println(a.breastFeed());
        System.out.println(a.breath());
    }
}
