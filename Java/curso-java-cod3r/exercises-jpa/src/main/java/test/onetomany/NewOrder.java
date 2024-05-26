package test.onetomany;

import infra.DAO;
import model.base.Product;
import model.onetomany.Order;
import model.onetomany.OrderItem;

public class NewOrder {
    public static void main(String[] args) {
        DAO<Object> dao = new DAO<>();

        Order order = new Order();
        Product product = new Product("Refrigerator", 2789.99);
        OrderItem item = new OrderItem(order, product, 10);

        dao.openT()
                .include(product)
                .include(order)
                .include(item)
                .closeT()
                .close();
    }
}
