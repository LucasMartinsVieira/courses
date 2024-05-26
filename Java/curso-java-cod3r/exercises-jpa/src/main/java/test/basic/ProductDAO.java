package test.basic;

import infra.DAO;
import model.base.Product;

public class ProductDAO extends DAO<Product> {
    public ProductDAO() {
        super(Product.class);
    }
}
