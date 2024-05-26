package test.inheritance;

import infra.DAO;
import model.inheritance.ScholarshipStudent;
import model.inheritance.Student;

public class NewStudent {
    public static void main(String[] args) {
        DAO<Student> studentDAO = new DAO<>();

        Student student1 = new Student(123L, "João");
        ScholarshipStudent student2 = new ScholarshipStudent(245L, "Maria", 1000);

        studentDAO.includeAtomic(student1);
        studentDAO.includeAtomic(student2);

        studentDAO.close();
    }
}
