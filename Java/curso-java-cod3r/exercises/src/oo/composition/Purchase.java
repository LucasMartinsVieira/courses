package oo.composition;

import java.util.ArrayList;

public class Purchase {
    String clientName;
    ArrayList<Item> items = new ArrayList<>();

    void addItem(String name, int quantity, double price) {
        this.addItem(new Item(name, quantity, price));
    }

    void addItem(Item item) {
        items.add(item);
        item.purchase = this;
    }

    double getTotalValue() {
        double total = 0;

        for (Item item : items) {
            total += item.quantity * item.price;
        }

        return total;
    }
}
