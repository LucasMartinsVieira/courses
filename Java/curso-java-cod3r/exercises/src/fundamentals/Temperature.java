package fundamentals;

public class Temperature {
    public static void main(String[] args) {
        final double FACTOR = 5.0 / 9.0;
        final int ADJUST = 32;

        double fahrenheit = 86;
        double celsius = (fahrenheit - ADJUST) * FACTOR;
        System.out.println("The temperature in fahrenheit is: " + fahrenheit + " in Celsius is: " + celsius);

        fahrenheit = 20;
        celsius = (fahrenheit - ADJUST) * FACTOR;
        System.out.println("The temperature in fahrenheit is: " + fahrenheit + " in Celsius is: " + celsius);
    }
}
