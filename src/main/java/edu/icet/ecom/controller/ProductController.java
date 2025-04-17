package edu.icet.ecom.controller;

import edu.icet.ecom.model.Product;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@Controller + @ResponseBody + @Component
@RestController

//Common Prefix
@RequestMapping("/product")
public class ProductController {

//    Old Type
//    @RequestMapping(method = RequestMethod.GET)

    @GetMapping("all")
    List<Product> getProducts() {
        return null;
    }
}
