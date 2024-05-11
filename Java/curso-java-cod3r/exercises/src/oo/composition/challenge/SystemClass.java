package oo.composition.challenge;

public class SystemClass {
    public static void main(String[] args) {
        Purchase purchase1 = new Purchase();
        purchase1.addItem("Pen", 9.67, 100);
        purchase1.addItem(new Product("Notebook", 1897.88), 2);

        Purchase purchase2 = new Purchase();
        purchase2.addItem("Book", 10, 10);
        purchase2.addItem(new Product("printer", 998.90), 1);

        Client client = new Client("Maria Júlia Moraes");
        client.addPurchase(purchase1);
        client.purchases.add(purchase2);

        System.out.println(client.getTotalValue());
    }
}
