package web.service;

import web.model.Product;

import java.util.List;

public interface IProductService {
    List<Product> display();
    void create (Product product);
    void update (Product product);
    void delete (String id);
    Product findById(String id);
    List<Product> search (String name);
}
