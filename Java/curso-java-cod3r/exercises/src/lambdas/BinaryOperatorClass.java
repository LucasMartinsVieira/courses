package lambdas;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class BinaryOperatorClass {
    public static void main(String[] args) {
        BinaryOperator<Double> average = (n1, n2) -> (n1 + n2) / 2;
        System.out.println(average.apply(9.8, 5.7));

        BiFunction<Double, Double, String> result = (n1, n2) -> {
            double finalGrade = (n1 + n2) / 2;
            return finalGrade >= 7 ? "Approved" : "Not approved";
        };

        System.out.println(result.apply(9.7, 4.1));

        Function<Double, String> concept = m -> m >= 7 ? "Approved" : "Not approved";

        System.out.println(average.andThen(concept).apply(9.7, 5.1));
    }
}
