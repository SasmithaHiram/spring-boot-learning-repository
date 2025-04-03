package edu.icet.ecom.service;

import edu.icet.ecom.model.Product;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    RestTemplate restTemplate;

    public List<Product> getAllProducts() {
        ResponseEntity<Product[]> response = restTemplate.getForEntity("https://fakestoreapi.com/products", Product[].class);
        return Arrays.stream(response).toList();
    }

}
