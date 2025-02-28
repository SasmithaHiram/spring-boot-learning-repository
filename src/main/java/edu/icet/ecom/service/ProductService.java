package edu.icet.ecom.service;

import edu.icet.ecom.model.Product;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {
    public List<Product> getProducts() {
        Product product = new Product();
        product.setName("Apple");
        product.setDescription("Red");
        product.setPrice(100.00);

        Product product1 = new Product("Orange", "Fruit", 100.00);
        List<Product> list = Arrays.asList(product, product1);
        return list;
    }

}
