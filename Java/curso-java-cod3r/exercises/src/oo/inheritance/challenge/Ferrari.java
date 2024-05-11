package oo.inheritance.challenge;

public class Ferrari extends Car implements Sporting, Lux {

    boolean turnTurboOn;
    boolean turnAirConditionerOn;

    public Ferrari() {
        this(315);
    }

    public Ferrari(int maxVelocity) {
        super(maxVelocity);
        setDelta(15);
    }

    @Override
    public void turnTurboOn() {
        turnTurboOn = true;
    }

    @Override
    public void turnTurboOff() {
        turnTurboOn = false;
    }

    @Override
    public void turnAirConditionerOn() {
        turnAirConditionerOn = true;
    }

    @Override
    public void turnAirConditionerOff() {
        turnAirConditionerOn = false;
    }

    @Override
    public int getDelta() {
        if (turnTurboOn && !turnAirConditionerOn) {
            return 35;
        } else if (turnTurboOn && turnAirConditionerOn) {
            return 30;
        } else if (!turnTurboOn && !turnAirConditionerOn) {
            return 20;
        } else {
            return 15;
        }
    }

    //    @Override
//    void speedUp() {
//        super.speedUp();
//    }
}
