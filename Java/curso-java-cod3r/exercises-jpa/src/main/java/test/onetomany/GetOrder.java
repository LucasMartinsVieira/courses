package test.onetomany;

import infra.DAO;
import model.onetomany.Order;
import model.onetomany.OrderItem;

public class GetOrder {
    public static void main(String[] args) {

        DAO<Order> dao = new DAO<>(Order.class);

        Order order = dao.getById(1L);
        for (OrderItem item : order.getItems()) {
            System.out.println(item.getQuantity());
            System.out.println(item.getProduct().getName());
        }

        dao.close();
    }
}
