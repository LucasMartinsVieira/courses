package control;

import java.util.Scanner;

public class ChallengeWeekDay {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the day of the week");

        String dia = input.next();

        if ("sunday".equalsIgnoreCase(dia)) {
            System.out.println(1);
        } else if ("monday".equalsIgnoreCase(dia)) {
            System.out.println(2);
        } else if ("tuesday".equalsIgnoreCase(dia)) {
            System.out.println(3);
        } else if ("wednesday".equalsIgnoreCase(dia)) {
            System.out.println(4);
        } else if ("thursday".equalsIgnoreCase(dia)) {
            System.out.println(5);
        } else if ("friday".equalsIgnoreCase(dia)) {
            System.out.println(6);
        } else if ("saturday".equalsIgnoreCase(dia)) {
            System.out.println(7);
        } else {
            System.out.println("Invalid day!");
        }

        input.close();
    }
}
