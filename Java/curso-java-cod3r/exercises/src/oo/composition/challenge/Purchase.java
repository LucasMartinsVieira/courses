package oo.composition.challenge;

import java.util.ArrayList;
import java.util.List;

public class Purchase {
    final List<Item> items = new ArrayList<>();

    void addItem(Product p, int qtd) {
        this.items.add(new Item(p, qtd));
    }

    void addItem(String name, double price, int qtd) {
        var product = new Product(name, price);
        this.items.add(new Item(product, qtd));
    }

    double getTotalValue() {
        double total = 0;

        for (Item item : this.items) {
            total += item.quantity * item.product.price;
        }

        return total;
    }
}
