package oo.composition.challenge;

import java.util.ArrayList;
import java.util.List;

public class Client {
    final String name;
    final List<Purchase> purchases = new ArrayList<>();

    Client(String name) {
        this.name = name;
    }

    void addPurchase(Purchase purchase) {
        this.purchases.add(purchase);
    }

    double getTotalValue() {
        double total = 0;

        for (Purchase purchase : purchases) {
            total += purchase.getTotalValue();
        }

        return total;
    }
}
