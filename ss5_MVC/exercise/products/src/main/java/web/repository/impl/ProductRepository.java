package web.repository.impl;

import org.springframework.stereotype.Repository;
import web.model.Product;
import web.repository.BaseRepository;
import web.repository.IProductRepository;

import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;
import java.util.List;

@Repository
public class ProductRepository implements IProductRepository {

    @Override
    public List<Product> display() {
        TypedQuery<Product> typedQuery = BaseRepository.entityManager.createQuery("select p from Product p", Product.class);
        return typedQuery.getResultList();
    }

    @Override
    public void create(Product product) {
        EntityTransaction entityTransaction = BaseRepository.entityManager.getTransaction();
        entityTransaction.begin();
        BaseRepository.entityManager.persist(product);
        entityTransaction.commit();
    }

    @Override
    public void update(Product product) {
        EntityTransaction entityTransaction = BaseRepository.entityManager.getTransaction();
        entityTransaction.begin();
        BaseRepository.entityManager.merge(product);
        entityTransaction.commit();
    }

    @Override
    public void delete(Product product) {
        EntityTransaction entityTransaction = BaseRepository.entityManager.getTransaction();
        entityTransaction.begin();
        BaseRepository.entityManager.remove(product);
        entityTransaction.commit();
    }

    @Override
    public Product findById(String id) {
        Product product = BaseRepository.entityManager.find(Product.class, id);
        return product;
    }

    @Override
    public List<Product> search(String name) {
        TypedQuery<Product> typedQuery =
                BaseRepository.entityManager.createQuery("select p from Product p " +
                        "where p.name like :nameFind", Product.class);
        typedQuery.setParameter("nameFind", name);
        return typedQuery.getResultList();
    }
}
