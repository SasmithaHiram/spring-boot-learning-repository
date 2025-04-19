package edu.icet.ecom.controller;

import edu.icet.ecom.model.Product;
import edu.icet.ecom.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@Controller + @ResponseBody + @Component
@RestController

//Common Prefix
@RequestMapping("/product")

@RequiredArgsConstructor
public class ProductController {

    final ProductService productService;

//    Old Type
//    @RequestMapping(method = RequestMethod.GET)

    @GetMapping("get-all")
    List<Product> getProducts(@RequestParam("category") String category) {
        List<Product> products = productService.getProducts(category);
        return productService.getProducts(category);
    }

    @PostMapping("/create")
    public void createProduct(@RequestBody Product product) {
        productService.createProduct(product);
    }
}
