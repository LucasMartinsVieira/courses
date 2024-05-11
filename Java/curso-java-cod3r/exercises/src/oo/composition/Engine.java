package oo.composition;

public class Engine {
    public Car car;
    boolean turnedOn = false;
    double injectionFactor = 1;

    Engine(Car car) {
        this.car = car;
    }

    public int spins() {
        if (!turnedOn) {
            return 0;
        } else {
            return (int) Math.round(injectionFactor * 3000);
        }
    }
}
