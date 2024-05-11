package oo.composition;

public class Car {
    public Engine engine;

    public Car() {
        this.engine = new Engine(this);
    }

    public void speedUp() {
        if (engine.injectionFactor < 2.6) {
            engine.injectionFactor += 0.4;
        }
    }

    public void brake() {
        if (engine.injectionFactor > 0.5) {
            engine.injectionFactor -= 0.4;
        }
    }

    public void turnOn() {
        engine.turnedOn = true;
    }

    void turnOff() {
        engine.turnedOn = false;
    }

    public boolean isTurnedOn() {
        return engine.turnedOn;
    }
}
