package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("How many students? ");
        int qtdStudents = input.nextInt();

        System.out.print("How many grades per student? ");
        int qtdGrades = input.nextInt();

        double[][] classGrades = new double[qtdStudents][qtdGrades];

        double total = 0;
        for (int a = 0; a < classGrades.length; a++) {
            for (int n = 0; n < classGrades[a].length; n++) {
                System.out.printf("Enter the grade %d of student %d: ", n + 1, a + 1);
                classGrades[a][n] = input.nextDouble();
                total += classGrades[a][n];
            }
        }

        double average = total / (qtdStudents * qtdGrades);
        System.out.println("Class average is " + average);

        for (double[] studentGrades : classGrades) {
            System.out.println(Arrays.toString(studentGrades));
        }

        input.close();
    }
}
