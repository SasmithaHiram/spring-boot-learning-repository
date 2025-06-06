package org.example.controller;

import lombok.RequiredArgsConstructor;
import org.example.model.Product;
import org.example.service.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
@RequiredArgsConstructor
public class ProductController {
    private final ProductService productService;

    @GetMapping("/filter")
    List<Product> productByCategory(@RequestParam(value = "category", required = false) String category) {
        return productService.productByCategory(category);
    }

    @PostMapping("/create")
    Product createProduct(@RequestBody Product product) {
        System.out.println(product);
        return productService.persist(product);
    }
}
