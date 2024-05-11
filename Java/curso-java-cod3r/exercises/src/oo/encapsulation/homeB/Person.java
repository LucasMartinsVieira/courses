package oo.encapsulation.homeB;

public class Person {
    private int age;
    private String name;

    private String surname;

    public Person(String name, String surname, int age) {
        setAge(age);
        setSurname(surname);
        setName(name);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        age = Math.abs(age);

        if (age >= 0 && age <= 130) {
            this.age = age;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Hi, my name is " + getName() + " and I'm " + getAge() + ".";
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getFullName() {
        return getName() + " " + getSurname();
    }
}
