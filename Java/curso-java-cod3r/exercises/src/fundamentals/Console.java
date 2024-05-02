package fundamentals;

import java.util.Scanner;

public class Console {
    public static void main(String[] args) {
        System.out.print("Good");
        System.out.print(" Morning\n");

        System.out.println("Good");
        System.out.println("Morning!");

        System.out.printf("Megasena: %d %d %d %d %d %d%n", 1, 2, 3, 4, 5, 6);
        System.out.printf("Name: %s\n", "Lucas");

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = input.nextLine();

        System.out.print("Enter your surname: ");
        String surname = input.nextLine();

        System.out.print("Enter your age: ");
        int age = input.nextInt();

        System.out.println("\n\nName = " + name + " " + surname + ", I'm " + age + " years old.");
        input.close();
    }
}
