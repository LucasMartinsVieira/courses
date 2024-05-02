package fundamentals.operators;

public class Logics {
    public static void main(String[] args) {
        boolean condition1 = true;
        boolean condition2 = 3 > 7;
        System.out.println(condition1 && !condition2);
        System.out.println(condition1 || condition2);
        System.out.println(condition1 ^ condition2);
        System.out.println(!!condition1);
        System.out.println(!condition2);
    }
}