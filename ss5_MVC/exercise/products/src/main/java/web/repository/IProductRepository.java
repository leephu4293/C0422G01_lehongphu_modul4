package web.repository;

import web.model.Product;

import java.util.List;

public interface IProductRepository {
    List<Product> display();

    void create(Product product);

    void update(Product product);

    void delete(Product product);

    Product findById(String id);

    List<Product> search(String name);
}
