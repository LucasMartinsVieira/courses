package oo.inheritance.challenge;

public class CarTest {
    public static void main(String[] args) {

        Polo c1 = new Polo();
        c1.speedUp();
        System.out.println(c1);

        c1.speedUp();
        System.out.println(c1);

        c1.speedUp();
        System.out.println(c1);

        Car c2 = new Ferrari(400);
        c2.speedUp();
        c2.brake();
        System.out.println(c2);

        c2.speedUp();
        c2.brake();
        System.out.println(c2);

        c2.speedUp();
        System.out.println(c2);
    }
}
