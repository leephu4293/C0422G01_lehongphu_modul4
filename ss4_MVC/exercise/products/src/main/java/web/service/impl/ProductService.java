package web.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.model.Product;
import web.repository.IProductRepository;
import web.service.IProductService;

import java.util.List;

@Service
public class ProductService implements IProductService {
    @Autowired
    private IProductRepository productRepository;

    @Override
    public List<Product> display(String name) {
        List<Product> list=this.productRepository.display();
            for (int i = 0; i < list.size(); i++) {
                if (!list.get(i).getName().contains(name)){
                    list.remove(i);
                    i--;
                }
            }

        return list;
    }

    @Override
    public void create(Product product) {
       this.productRepository.create(product);
    }

    @Override
    public void update(Product product) {
     this.productRepository.update(product);
    }

    @Override
    public void delete(String id) {
      this.productRepository.delete(id);
    }

    @Override
    public Product findById(String id) {
        return this.productRepository.findById(id);
    }

    @Override
    public List<Product> search(String name) {
        return this.productRepository.search(name);
    }
}
