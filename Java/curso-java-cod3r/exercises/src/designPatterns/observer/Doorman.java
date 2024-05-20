package designPatterns.observer;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Doorman {
    private List<BirthdayArrivalObserver> observers = new ArrayList<>();

    public void registerObservers(BirthdayArrivalObserver observer) {
        observers.add(observer);
    }

    public void monitor() {
        Scanner input = new Scanner(System.in);
        String value = "";

        while (!"quit".equalsIgnoreCase(value)) {
            System.out.print("The birthday persion arrived? ");
            value = input.nextLine();

            if ("yes".equalsIgnoreCase(value)) {
                // Create the event
                BirthdayArrivalEvent event = new BirthdayArrivalEvent(new Date());

                // notify observers
                observers.stream().forEach(o -> o.arrived(event));

                value = "quit";
            } else {
                System.out.println("False alarm!");
            }
        }

        input.close();
    }
}
