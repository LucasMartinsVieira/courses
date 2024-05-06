package Control;

import javax.swing.*;

public class IfElse {
    public static void main(String[] args) {
        String value = JOptionPane.showInputDialog("Enter the number:");
        int number = Integer.parseInt(value);

        if (number % 2 == 0) {
            System.out.println("The number is even.");
        } else {
            System.out.println("The number is not even.");
        }
    }
}
