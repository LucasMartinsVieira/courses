package lambdas;

import java.util.function.Function;

public class FunctionClass {
    public static void main(String[] args) {
        Function<Integer, String> evenOrOdd = n -> n % 2 == 0 ? "Even" : "Odd";

        System.out.println(evenOrOdd.apply(32));

        Function<String, String> theResultIs = value -> "The result is: " + value;

        Function<String, String> excited = value -> value + "!!!";
        Function<String, String> doubt = value -> value + "???";

        String finalResult1 = evenOrOdd.andThen(theResultIs).andThen(excited).apply(32);
        String finalResult2 = evenOrOdd.andThen(theResultIs).andThen(doubt).apply(32);

        System.out.println(finalResult1);
        System.out.println(finalResult2);
    }
}
