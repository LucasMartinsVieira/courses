package ExceptionPackage;

public class Basic {
    public static void main(String[] args) {
        Student s1 = null;


        try {
            printStudentName(s1);
        } catch (Exception exception) {
            System.out.println("A error happened in the moment of printing the name of the student");
        }

        try {
            System.out.println(7 / 0);
        } catch (ArithmeticException e) {
            System.out.println("A error happened: "  + e.getMessage());
        }

        System.out.println("That's all folks :)");
    }

    public static void printStudentName(Student student) {
        System.out.println(student.name);
    }
}
