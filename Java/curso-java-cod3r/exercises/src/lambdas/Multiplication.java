package lambdas;

public class Multiplication implements Calculation {
    @Override
    public double execute(double a, double b) {
        return a * b;
    }
}
