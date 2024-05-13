package lambdas;

import java.util.function.Predicate;

public class PredicateClass {
    public static void main(String[] args) {
        Predicate<Product> isExpensive = prod -> (prod.price * (1 - prod.discount))  >= 750;

        Product product = new Product("Notebook", 3893.89, 0.15);
        System.out.println(isExpensive.test(product));
    }
}
