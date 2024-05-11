package oo.inheritance.challenge;

public class Car {
    protected final int MAX_VELOCITY;
    protected int currentSpeed;

    private int delta = 5;

    Car(int maxVelocity) {
        MAX_VELOCITY = maxVelocity;
    }

    public void speedUp() {
        if (currentSpeed + getDelta() > MAX_VELOCITY) {
            currentSpeed = MAX_VELOCITY;
        } else {
            currentSpeed += getDelta();
        }
    }

    public void brake() {
        if (currentSpeed >= 5) {
            currentSpeed -= 5;
        } else {
            currentSpeed = 0;
        }
    }

    @Override
    public String toString() {
        return "Current speed is " + currentSpeed + " Km/h.";
    }

    public int getDelta() {
        return delta;
    }

    public void setDelta(int delta) {
        this.delta = delta;
    }


}
