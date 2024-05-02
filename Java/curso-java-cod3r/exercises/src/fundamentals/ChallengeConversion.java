package fundamentals;

import java.util.Scanner;

public class ChallengeConversion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first salary:");
        String value1 = input.next().replace(",", ".");

        System.out.print("Enter the second salary:");
        String value2 = input.next().replace(",", ".");

        System.out.print("Enter the third salary:");
        String value3 = input.next().replace(",", ".");

        double salary1 = Double.parseDouble(value1);
        double salary2 = Double.parseDouble(value1);
        double salary3 = Double.parseDouble(value1);

        double average = (salary1 + salary2 + salary3) / 3;
        System.out.println("The average of the Salaries is " + average);

        input.close();
    }
}
