package lambdas;

@FunctionalInterface
public interface Calculation {
    double execute(double a, double b);

    default String cool() {
        return "cool";
    }

    static String veryCool() {
        return "Very cool";
    }
}
