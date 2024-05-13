package lambdas;

import java.util.Arrays;
import java.util.List;

public class Foreach {
    public static void main(String[] args) {
        List<String> approved = Arrays.asList("Ana", "Bia", "Lia", "Gui");

        System.out.println("Traditional way...");
        for (String name : approved) {
            System.out.println(name);
        }

        System.out.println("\nLambda #01...");
        approved.forEach(name -> System.out.println(name + "!!!"));

        System.out.println("\nMethod Reference #01...");
        approved.forEach(System.out::println);

        System.out.println("\nLambda #02...");
        approved.forEach(name -> myPrint(name));

        System.out.println("\nMethod Reference #02...");
        approved.forEach(Foreach::myPrint);

    }

    static void myPrint(String name) {
        System.out.println("Hi! My name is " + name);
    }
}
