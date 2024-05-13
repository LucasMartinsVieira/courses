package lambdas;

import java.util.function.UnaryOperator;

public class UnaryOperatorClass {
    public static void main(String[] args) {
        UnaryOperator<Integer> plusTwo = n -> n + 2;
        UnaryOperator<Integer> timesTwo = n -> n * 2;
        UnaryOperator<Integer> toSquared = n -> n * n;

        Integer result1 = plusTwo.andThen(timesTwo).andThen(toSquared).apply(0);
        System.out.println(result1);

        int result2 = toSquared.compose(timesTwo).compose(plusTwo).apply(0);
        System.out.println(result2);
    }
}
