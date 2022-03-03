package product.service;

import product.model.Product;

import java.util.List;

public interface IProductService {

    List<Product> findAll();

    void add(Product product);

    Product findById(int id);

    void edit(int id, Product product);

    void delete(int id);

    List<Product> searchByName (String name);
}
