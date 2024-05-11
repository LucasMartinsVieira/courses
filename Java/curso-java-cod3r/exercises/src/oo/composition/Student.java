package oo.composition;

import java.util.ArrayList;
import java.util.List;

public class Student {
    final String name;
    final List<Course> courses = new ArrayList<>();

    Student(String name) {
        this.name = name;
    }

    void addCourse(Course course) {
        this.courses.add(course);
        course.students.add(this);
    }

    Course getCourseByName(String name) {
        Course searchable = null;
        for (Course course : this.courses) {
            if (course.name.equalsIgnoreCase(name)) {
                return course;
            }
        }
        return searchable;
    }

    @Override
    public String toString() {
        return name;
    }
}
