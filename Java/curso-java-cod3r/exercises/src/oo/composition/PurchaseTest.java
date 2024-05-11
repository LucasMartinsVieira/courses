package oo.composition;

public class PurchaseTest {
    public static void main(String[] args) {
        Purchase purchase1 = new Purchase();
        purchase1.clientName = "João Pedro";
//        purchase1.items.add(new Item("Pen", 20, 7.45));
//        purchase1.items.add(new Item("Pencil", 12, 3.89));
//        purchase1.items.add(new Item("Notebook", 3, 18.79));
        purchase1.addItem("Pen", 20, 7.45);
        purchase1.addItem(new Item("Pencil", 12, 3.89));
        purchase1.addItem(new Item("Notebook", 3, 18.79));

        System.out.println(purchase1.items.size());
        System.out.println(purchase1.getTotalValue());

        double total = purchase1.items.get(0).purchase.items.get(1).purchase.getTotalValue();
        System.out.println("The total of the purchase is: " + total);
    }
}
