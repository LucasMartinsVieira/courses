package lambdas;

public class CalculationTest2 {
    public static void main(String[] args) {
        Calculation calc = (x, y) -> {
          return x + y;
        };
        System.out.println(calc.execute(2, 3));

        calc = (x, y) -> x * y;
        System.out.println(calc.execute(2, 3));

        System.out.println(calc.cool());
        System.out.println(Calculation.veryCool());
    }
}
