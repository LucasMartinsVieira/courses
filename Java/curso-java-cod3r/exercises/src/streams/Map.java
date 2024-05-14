package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class Map {
    public static void main(String[] args) {
        Consumer<String> print = System.out::print;

        List<String> brands = Arrays.asList("BMW ", "Audi ", "Honda ");
        brands.stream().map(m -> m.toUpperCase()).forEach(print);

//        UnaryOperator<String> uppercase = n -> n.toUpperCase();
        UnaryOperator<String> firstLetter = n -> n.charAt(0) + "";
//        UnaryOperator<String> scream = n -> n + "!!! ";

        System.out.println("Using composition...");

        brands.stream()
                .map(Utils.uppercase)
                .map(firstLetter)
                .map(Utils::scream)
                .forEach(print);
    }
}
