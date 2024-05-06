package Control;

public class For1 {
    public static void main(String[] args) {
//        int i = 1;
//        while (i <= 10) {
//            System.out.printf("i = %d\n", i);
//            i++;
//        }

        for (int i = 0; i <= 20; i++) {
            System.out.printf("i = %d\n", i);
        }

        int x = 2;
        for (; x < 10;) {
            System.out.println("x = " + x);
            x++;
        }
    }
}
