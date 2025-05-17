package edu.icet.ecom.service;

import edu.icet.ecom.model.Product;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

//@Component
@Service
@Slf4j
public class ProductService {
    @Autowired
    RestTemplate restTemplate;

    ModelMapper modelMapper;

    public List<Product> getProducts(String category) {
        Product[] response = restTemplate.getForObject("https://fakestoreapi.com/products", Product[].class);

        return Arrays.stream(response).filter(product ->
                category.equalsIgnoreCase(product.getCategory())).toList();
    }

    @Scheduled(cron = "0 0/30 23 L * *")
    public void sendSeasonalGreetings() {
        // Get Customer from DB
        // Get Contact Numbers
        // Create SMS Message
        String message = "Happy New Year";
        // Call SMS REST API with Msg and Contact Numbers

//        String response = restTemplate.getForObject("https://fakestoreapi.com/products?mobile", String.class);
//
//        if ("Ok".equalsIgnoreCase(response)) {
//    }
        log.info(message);

    }
}
