package Control;

import java.util.Scanner;

public class WhileIndetermined {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String value = "";

        while (!value.equalsIgnoreCase("exit")) {
            System.out.print("You say: ");
            value = input.nextLine();
        }

        input.close();
    }
}
