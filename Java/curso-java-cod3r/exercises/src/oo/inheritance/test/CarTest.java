package oo.inheritance.test;

import oo.composition.Car;
import oo.inheritance.challenge.Ferrari;

public class CarTest {
    public static void main(String[] args) {
        Car c1 = new Car();
        System.out.println(c1.isTurnedOn());

        c1.turnOn();
        System.out.println(c1.isTurnedOn());

        System.out.println(c1.engine.spins());

        c1.speedUp();
        c1.speedUp();
        c1.speedUp();
        c1.speedUp();

        System.out.println(c1.engine.spins());

        Ferrari c2 = new Ferrari(400);
        c2.turnTurboOn();

        c2.speedUp();
        System.out.println(c2);

        c2.speedUp();
        System.out.println(c2);

        c2.speedUp();
        System.out.println(c2);

        System.out.println(c2.airConditionerVelocity());
    }
}