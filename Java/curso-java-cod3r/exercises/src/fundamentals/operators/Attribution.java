package fundamentals.operators;

public class Attribution {
    public static void main(String[] args) {
        int a = 3;
        int b = a;
        int c = a + b;

        c += b;
        c -= a;
        c *= b;
        c /= a;
        c %= 2;

        c++; // c = c + 1;

        System.out.println(c);
    }
}
