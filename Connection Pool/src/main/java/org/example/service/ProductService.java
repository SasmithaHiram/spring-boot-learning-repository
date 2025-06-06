package org.example.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.example.entity.ProductEntity;
import org.example.model.Product;
import org.example.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {
    private final ProductRepository productRepository;
    private final ObjectMapper objectMapper;

    public List<Product> productByCategory(String category) {
        return null;
    }

    public Product persist(Product product) {
        ProductEntity saved = productRepository.save(objectMapper.convertValue(product, ProductEntity.class));
        return objectMapper.convertValue(saved, Product.class);
    }
}
