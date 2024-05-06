package Control;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String value = "";

        do {
            System.out.print("You need to say the magic word\n");
            System.out.print("Want to exit? ");
            value = input.nextLine();
        } while (!value.equalsIgnoreCase("please"));

        input.close();
    }
}
