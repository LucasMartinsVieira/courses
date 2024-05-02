package fundamentals;

public class ConversionPrimitiveNumericTypes {
    public static void main(String[] args) {
        double a = 1; // implicit
        System.out.println(a);

        float b = (float) 1.12345678888888; // explicit
        System.out.println(b);

        int c = 340;
        byte d = (byte) c; // explicit
        System.out.println(d);

        double e = 1.9999999999;
        int f = (int) e; // explicit
        System.out.println(f);
    }
}
