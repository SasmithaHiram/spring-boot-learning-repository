package edu.icet.ecom.controller;

import edu.icet.ecom.model.Product;
import edu.icet.ecom.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

    @GetMapping("all")
    List<Product> getProducts() {
        List<Product> products = productService.getProducts();
        return null;
    }
}
