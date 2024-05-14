package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class FilterChallenge {
    public static void main(String[] args) {
        Product p1 = new Product("Pencil", 1.99, 0.35, 0);
        Product p2 = new Product("Notebook", 4899.89, 0.32, 0);
        Product p3 = new Product("Book", 30, 0.45, 0);
        Product p4 = new Product("Printer", 1200, 0.40, 0);
        Product p5 = new Product("iPad", 3100, 0.29, 0);
        Product p6 = new Product("CLock", 1900, 0.12, 0);
        Product p7 = new Product("Monitor", 800, 0.31, 0);

        List<Product> products = Arrays.asList(p1, p2, p3, p4, p5, p6, p7);

        // Filter, filter, map
        Predicate<Product> superPromotion = p -> p.discount >= 0.3;
        Predicate<Product> freeShipping = p -> p.freightValue == 0;
        Predicate<Product> relevantPrice = p -> p.price >= 500;
        Function<Product, String> promotionalCall = p -> "Enjoy! " + p.name + " por R$" + p.price;

        products.stream()
                .filter(superPromotion)
                .filter(freeShipping)
                .filter(relevantPrice)
                .map(promotionalCall)
                .forEach(System.out::println);
    }
}
