package arrays;

import java.util.Arrays;

public class Exercise {
    public static void main(String[] args) {
        double[] gradesStudentA = new double[4];
        gradesStudentA[0] = 7.9;
        gradesStudentA[1] = 8;
        gradesStudentA[2] = 6.7;
        gradesStudentA[3] = 9.7;

//        System.out.println(gradesStudentA);
        System.out.println(Arrays.toString(gradesStudentA));

        double totalStudentA = 0;

        for (int i = 0; i < gradesStudentA.length; i++) {
            totalStudentA += gradesStudentA[i];
        }

        System.out.println(totalStudentA / gradesStudentA.length);

        final double gradeSaved = 5.9;

        double[] gradeStudentB = { 6.9, 8.9, gradeSaved, 10 };
        double totalStudentB = 0;

        for (int i = 0; i < gradeStudentB.length; i++) {
            totalStudentB += gradeStudentB[i];
        }

        System.out.println(totalStudentB / gradeStudentB.length);
    }
}
