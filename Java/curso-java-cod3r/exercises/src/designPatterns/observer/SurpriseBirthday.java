package designPatterns.observer;

public class SurpriseBirthday {
    public static void main(String[] args) {
        Doorman doorman = new Doorman();

        Girlfriend girlfriend = new Girlfriend();
        doorman.registerObservers(girlfriend);

        doorman.registerObservers(e -> {
            System.out.println("Surprise via Lambda!");
            System.out.println("Happened on: " + e.getMoment());
        });
        doorman.monitor();
    }
}
