package designPatterns.observer;

public class Girlfriend implements BirthdayArrivalObserver {

    @Override
    public void arrived(BirthdayArrivalEvent event) {
        System.out.println("Notify the guests...");
        System.out.println("Turn off the lights...");
        System.out.println("Wait a little...");
        System.out.println("and... surprise!!!");
    }
}
