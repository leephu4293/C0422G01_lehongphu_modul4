package web.repository.impl;

import org.springframework.stereotype.Repository;
import web.model.Product;
import web.repository.IProductRepository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class ProductRepository implements IProductRepository {
    private static Map<String, Product> productMap = new HashMap<>();

    static {
        productMap.put("1", new Product("1", "coca", "2000", "12", "no sugar"));
        productMap.put("2", new Product("2", "coca", "6000", "10", "classic"));
        productMap.put("3", new Product("3", "beer", "2000", "15", "12% ancohol"));
        productMap.put("4", new Product("4", "pepsi", "2000", "22", "new form"));
        productMap.put("5", new Product("5", "wine", "2000", "9", "whisky"));
        productMap.put("6", new Product("6", "Trung", "200000", "10", "Dep trai"));
    }

    @Override
    public List<Product> display() {
        return new ArrayList<>(productMap.values());
    }

    @Override
    public void create(Product product) {
        int id = (int) (Math.random() * 1000);
        product.setId(String.valueOf(id));
        productMap.put(product.getId(), product);
    }

    @Override
    public void update(Product product) {
        productMap.put(product.getId(), product);
    }

    @Override
    public void delete(String id) {
        productMap.remove(id);
    }

    @Override
    public Product findById(String id) {
        Product product = null;
        if (productMap.containsKey(id)) {
            product = productMap.get(id);
        }
        return product;
    }

    @Override
    public List<Product> search(String name) {
        List<Product> productList = new ArrayList<>();
        List<Product> list = display();
        for (Product product : list) {
            if (name.contains(product.getName())) {
                productList.add(product);
            }
        }
        return productList;
    }
}
