package web.service;

import web.model.Product;

import java.util.List;

public interface IProductService {
    List<Product> display(String name);

    void create(Product product);

    void update(Product product);

    void delete(Product product);

    Product findById(String id);

    List<Product> search(String name);
}
