package edu.icet.ecom.controller;

import edu.icet.ecom.model.Product;
import edu.icet.ecom.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class ProductController {
    final ProductService service;

    @GetMapping("/get-all-products")
    public List<Product> getAllProducts() {
        return service.getProducts();
    }

    @PostMapping("/create-product")
    void createProduct() {

    }

    @DeleteMapping("/delete-product")
    void deleteProduct() {

    }

    @GetMapping("/product-filter")
    void filterProductByCategory() {

    }

    @DeleteMapping("/deactivate-product")
    void deactivateProduct() {

    }
}
