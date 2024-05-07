package classe;

public class ProductTest {
    public static void main(String[] args) {
        Product p1 = new Product("Notebook", 4356.89);

        var p2 = new Product();
        p2.name = "Pen";
        p2.price = 12.56;
//        p2.discount = 0.29;

        System.out.println(p2.name);
        System.out.println(p1.name);

        double finalPrice1 = p1.priceWithDiscount();
        double finalPrice2 = p2.priceWithDiscount(0.1);
        double averageCart = (finalPrice1 + finalPrice2) / 2;

        System.out.printf("Average of the cart = $%.2f", averageCart);


    }
}
