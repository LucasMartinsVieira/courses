package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Filter {
    public static void main(String[] args) {
        Student s1 = new Student("Ana", 7.8);
        Student s2 = new Student("Bia", 5.8);
        Student s3 = new Student("Daniel", 9.8);
        Student s4 = new Student("Gui", 6.8);
        Student s5 = new Student("Rebeca", 7.1);
        Student s6 = new Student("Pedro", 8.8);

        List<Student> students = Arrays.asList(s1, s2, s3, s4, s5, s6);

        Predicate<Student> approved = s -> s.grade >= 7;
        Function<Student, String> approvedGreeting = s -> "Congratulations " + s.name + "! you are approved!";

        students.stream()
                .filter(approved)
                .map(approvedGreeting)
                .forEach(System.out::println);
    }
}
