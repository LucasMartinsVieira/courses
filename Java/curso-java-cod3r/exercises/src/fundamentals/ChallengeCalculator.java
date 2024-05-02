package fundamentals;

import java.util.Scanner;

public class ChallengeCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the fist number: ");
        double num1 = input.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = input.nextDouble();

        System.out.print("Enter the operator: ");
        String operator = input.next();

        double result = "+".equals(operator) ? num1 + num2 : 0;
        result = "-".equals(operator) ? num1 - num2 : result;
        result = "*".equals(operator) ? num1 * num2 : result;
        result = "/".equals(operator) ? num1 / num2 : result;
        result = "%".equals(operator) ? num1 % num2 : result;

        System.out.printf("%.2f %s %.2f = %.2f", num1, operator, num2, result);
        input.close();
    }
}
