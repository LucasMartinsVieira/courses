package fundamentals;

public class StringType {
    public static void main(String[] args) {
        System.out.println("Hello Guys".charAt(3));

        String s = "Good Afternoon";
        System.out.println(s.concat("!!!"));
        System.out.println(s + "!!!");
        System.out.println(s.startsWith("Good"));
        System.out.println(s.endsWith("Afternoon"));
        System.out.println(s.length());
        System.out.println(s.equalsIgnoreCase("good Afternoon"));

        var name = "Lucas";
        var surname = "Vieira";
        var age = 20;
        var salary = 12345.98;
        String anotherPhrase = "Name: " + name + "\nSurname: " + surname + "\nAge: " + age + "\nSalary" + salary + "\n\n";
        System.out.println(anotherPhrase);
        System.out.printf("Name: %s, Surname %s, Age %d, Salary %.2f\n", name, surname, age, salary);

        boolean vacation = true;

        String phrase = String.format("Name: %s, Surname %s, Age %d, Salary %.2f, Vacation %b", name, surname, age, salary, vacation);
        System.out.println(phrase);

        System.out.println("Some phrase".contains("phr"));
        System.out.println("Some phrase".indexOf("phr"));
        System.out.println("Some phrase".substring(6));
        System.out.println("Some phrase".substring(6, 10));
    }
}
