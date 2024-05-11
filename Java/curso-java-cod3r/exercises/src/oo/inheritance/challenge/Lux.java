package oo.inheritance.challenge;

public interface Lux {
    void turnAirConditionerOn();
    void turnAirConditionerOff();
    default int airConditionerVelocity() {
        return 1;
    };
}
