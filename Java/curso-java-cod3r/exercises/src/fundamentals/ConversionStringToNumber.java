package fundamentals;

import javax.swing.*;

public class ConversionStringToNumber {
    public static void main(String[] args) {
        String value1 = JOptionPane.showInputDialog("Enter the first number:");
        String value2 = JOptionPane.showInputDialog("Enter the second number:");

        System.out.println(value1 + value2);

        double number1 = Double.parseDouble(value1);
        double number2 = Double.parseDouble(value2);

        double sum = number1 + number2;
        System.out.println("The sum is " + sum);
        System.out.println("The average is  " + sum / 2);
    }
}
