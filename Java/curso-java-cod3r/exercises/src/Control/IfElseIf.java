package Control;

import java.util.Scanner;

public class IfElseIf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the grade: ");
        double grade = scanner.nextDouble();

        if (grade > 10 || grade < 0) {
            System.out.println("Invalid Grade!");
        } else if (grade >= 8.1) {
            System.out.println("Grade A");
        } else if (grade >= 6.1) {
            System.out.println("Grade B");
        } else if (grade >= 4.1) {
            System.out.println("Grade C");
        } else if (grade >= 2.1) {
            System.out.println("Grade D");
        } else {
            System.out.println("Grade E");
        }

        System.out.println("That's all folks!");
        scanner.close();
    }
}
