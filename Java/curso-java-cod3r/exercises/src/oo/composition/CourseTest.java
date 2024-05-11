package oo.composition;

public class CourseTest {
    public static void main(String[] args) {
        Student student1 = new Student("João");
        Student student2 = new Student("Maria");
        Student student3 = new Student("Pedro");

        Course course1 = new Course("Java");
        Course course2 = new Course("Web 2023");
        Course course3 = new Course("React Native");

        course1.addStudent(student1);
        course1.addStudent(student2);

        course2.addStudent(student1);
        course2.addStudent(student3);

        student1.addCourse(course3);
        student2.addCourse(course3);
        student3.addCourse(course3);

        for (Student student : course3.students) {
            System.out.println("I'm registered in the course " + course3.name + "...");
            System.out.println("...And my name is: " + student.name);
            System.out.println();
        }

        System.out.println(student1.courses.get(0).students);

        Course foundedCourse = student1.getCourseByName("Java");

        if (foundedCourse != null) {
            System.out.println(foundedCourse.name);
            System.out.println(foundedCourse.students);
        }
    }
}
