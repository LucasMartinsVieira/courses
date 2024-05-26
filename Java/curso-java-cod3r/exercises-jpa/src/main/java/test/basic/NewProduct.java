package test.basic;

import infra.DAO;
import model.base.Product;

public class NewProduct {
    public static void main(String[] args) {
        Product product = new Product("Monitor 23", 789.98);

        DAO< Product> dao  = new DAO<>(Product.class);
        dao.includeAtomic(product).close();

        System.out.println("Product ID: " + product.getId());
    }
}
