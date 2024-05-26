package model.inheritance;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("SS")
public class ScholarshipStudent extends Student {
    private double scholarshipValue;

    public ScholarshipStudent() {
    }

    public ScholarshipStudent(Long registration, String name, double scholarshipValue) {
        super(registration, name);
        this.scholarshipValue = scholarshipValue;
    }

    public double getScholarshipValue() {
        return scholarshipValue;
    }

    public void setScholarshipValue(double scholarshipValue) {
        this.scholarshipValue = scholarshipValue;
    }
}
