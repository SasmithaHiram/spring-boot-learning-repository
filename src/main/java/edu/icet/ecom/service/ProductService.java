package edu.icet.ecom.service;

import edu.icet.ecom.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

//@Component
@Service

public class ProductService {
    @Autowired
    RestTemplate restTemplate;

    public List<Product> getProducts() {
        Product[] response = restTemplate.getForObject("https://fakestoreapi.com/products", Product[].class);
        return Arrays.stream(response).toList();
    }
}
