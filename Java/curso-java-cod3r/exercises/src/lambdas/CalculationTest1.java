package lambdas;

public class CalculationTest1 {
    public static void main(String[] args) {
        Calculation calculation = new Sum();

        System.out.println(calculation.execute(2, 3));

        calculation = new Multiplication();
        System.out.println(calculation.execute(2, 3));
    }
}
