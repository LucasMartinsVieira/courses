package Control;

import java.util.Scanner;

public class SwitchWithBreak {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String concept = "";
        System.out.print("Enter the grade: ");
        int grade = input.nextInt();

        switch (grade) {
            case 10, 9:
                concept = "A";
                break;
            case 8, 7:
                concept = "B";
                break;
            case 6, 5:
                concept = "C";
                break;
            case 4, 3:
                concept = "D";
                break;
            case 2, 1, 0:
                concept = "E";
                break;
            default:
                concept = "not found";
//                break;
        }


        System.out.println("You grade is: " + concept);
        input.close();
    }
}
