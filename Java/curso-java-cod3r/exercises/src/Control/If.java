package Control;

import java.util.Scanner;

public class If {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the average: ");
        double average = scanner.nextDouble();

        if (average <= 10 && average >= 7) {
            System.out.println("Approved");
            System.out.println("Congratulations!");
        }

        if (average < 7 && average >= 4.5) {
            System.out.println("Second Chance");
        }

        boolean isReproved = average < 4.5 && average >= 0;
        if (isReproved) {
            System.out.println("Not approved");
        }

        scanner.close();
    }
}
