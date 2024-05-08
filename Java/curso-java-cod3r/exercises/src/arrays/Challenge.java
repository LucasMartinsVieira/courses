package arrays;

import java.util.Scanner;

public class Challenge {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("How many grades: ");
        int qtdGrades = input.nextInt();

        double[] grades = new double[qtdGrades];

        for (int i = 0; i < grades.length; i++) {
            System.out.print("Enter the grade " + (i + 1) + ": ");
            grades[i] = input.nextDouble();
        }

        double total = 0;
        for (double grade: grades) {
            total += grade;
        }

        double average = total / grades.length;
        System.out.println("The average is " + average + "!");
        input.close();
    }
}
