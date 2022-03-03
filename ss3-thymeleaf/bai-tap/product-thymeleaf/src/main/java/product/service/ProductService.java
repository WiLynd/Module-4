package product.service;

import org.springframework.stereotype.Service;
import product.model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ProductService implements IProductService{
    private static final Map<Integer, Product> products;

    static {
        products = new HashMap<>();
        products.put(1, new Product(1,"ASUS TUF DASH F15",25000000,"LAPTOP", "ASUS"));
        products.put(2, new Product(2,"ASUS ROG SCAR",26000000,"LAPTOP", "ASUS"));
        products.put(3, new Product(3,"ACER NITRO 5 EAGLE",23000000,"LAPTOP", "ACER"));
        products.put(4, new Product(4,"IPHONE 13 PRO MAX",35000000,"PHONE", "APPLE"));
        products.put(5, new Product(5,"ROG PHONE 5",22000000,"PHONE", "ASUS"));
        products.put(6, new Product(6,"SAMSUNG GALAXY S22 ULTRA",25000000,"PHONE", "SAMSUNG"));
        products.put(7, new Product(7,"OPPO RENO 6",13000000,"PHONE", "OPPO"));
        products.put(8, new Product(8,"XIAOMI 11T PRO",14000000,"PHONE", "XIAOMI"));
    }

    @Override
    public List<Product> findAll() {
        return new ArrayList<>(products.values());
    }

    @Override
    public void add(Product product) {
        products.put(product.getId(), product);
    }

    @Override
    public Product findById(int id) {
        return products.get(id);
    }

    @Override
    public void edit(int id, Product product) {
        products.put(id, product);
    }

    @Override
    public void delete(int id) {
        products.remove(id);
    }

    @Override
    public List<Product> searchByName(String name) {
        List<Product> productList = new ArrayList<>();
        for (Map.Entry<Integer, Product> entry : products.entrySet()) {
            if (entry.getValue().getName().contains(name)) {
                productList.add(entry.getValue());
            }
        }
        return productList;
    }
}
