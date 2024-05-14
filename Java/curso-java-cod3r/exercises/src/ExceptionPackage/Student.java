package ExceptionPackage;

import java.util.Objects;

public class Student {
    public final String name;
    public final double grade;
    public final boolean goodBehaviour;

    public Student(String name, double grade) {
        this(name, grade, true);
    }

    public Student(String name, double grade, boolean goodBehaviour) {
        this.name = name;
        this.grade = grade;
        this.goodBehaviour = goodBehaviour;
    }

    @Override
    public String toString() {
        return name + " has the grade " + grade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Double.compare(grade, student.grade) == 0 && goodBehaviour == student.goodBehaviour && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, grade, goodBehaviour);
    }
}
