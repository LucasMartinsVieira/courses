package streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MinMax {
    public static void main(String[] args) {
        Student s1 = new Student("Ana", 7.1);
        Student s2 = new Student("Luna", 6.2);
        Student s3 = new Student("Gui", 8.1);
        Student s4 = new Student("Gabi", 10);

        List<Student> students = Arrays.asList(s1, s2, s3, s4);

        Comparator<Student> betterGrade = (student1, student2) -> {
            if (student1.grade > student2.grade) return 1;
            if (student1.grade < student2.grade) return -1;
            return 0;
        };

        Comparator<Student> worstGrade = (student1, student2) -> {
            if (student1.grade > student2.grade) return -1;
            if (student1.grade < student2.grade) return 1;
            return 0;
        };

        System.out.println(students.stream().max(betterGrade).get());
        System.out.println(students.stream().min(worstGrade).get());

        System.out.println(students.stream().min(betterGrade).get());
        System.out.println(students.stream().max(worstGrade).get());
    }
}
