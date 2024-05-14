package ExceptionPackage.personalizedA;

import ExceptionPackage.Student;

public class ValidationsTest {
    public static void main(String[] args) {
        try {
            Student student = new Student("Ana", 7);
            Validate.student(student);

            Validate.student(null);
        } catch (EmptyStringException e) {
            System.err.println(e.getMessage());
        } catch (NumberOutOfBoundsException | IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }

        System.out.println("That's all folks! :)");
    }
}
