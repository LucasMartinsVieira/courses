package Control;

import java.util.Scanner;

public class ChallengeWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int totalGrades = 0;
        double grade = 0;
        double total = 0;

        while (grade != -1) {
            System.out.print("Enter the grade: ");
            grade = input.nextDouble();

            if (grade <= 10 && grade >= 0) {
                total += grade;
                totalGrades++;
            } else if (grade != -1) {
                System.out.println("Invalid Grade!!!");
            }
        }

        double average = total / totalGrades;
        System.out.println("Average = " + average);

        input.close();
    }
}
