package lambdas;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Challenge {
    public static void main(String[] args) {
        Product p = new Product("Ipad", 3235.89, 0.13);

        Function<Product, Double> finalPrice =
                product -> product.price * (1 - product.discount);
        UnaryOperator<Double> municipalTax =
                price -> price >= 2500 ? price * 1.085 : price;
        UnaryOperator<Double> freight =
                price -> price >= 3000 ? price + 100 : price + 50;
        UnaryOperator<Double> round =
                preco -> Double.parseDouble(String.format("%.2f", preco));
        Function<Double, String> format =
                price -> ("R$" + price).replace(".", ",");

        String price = finalPrice
                .andThen(municipalTax)
                .andThen(freight)
                .andThen(round)
                .andThen(format)
                .apply(p);
        System.out.println("O preço final é " + price);
    }
}
