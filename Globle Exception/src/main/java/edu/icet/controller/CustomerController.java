package edu.icet.controller;

import edu.icet.dto.Customer;
import edu.icet.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customer")
@RequiredArgsConstructor
@CrossOrigin

public class CustomerController {
    final CustomerService service;

    @PostMapping("/add")
    public ResponseEntity<String> addCustomer(@RequestBody Customer customer) {
        boolean isAdded = service.addCustomer(customer);

        if (isAdded) {
            return ResponseEntity.ok().body("Customer Added");
        }
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Try Again");
    }


    @GetMapping("/searchById/{id}")
    @ResponseStatus(HttpStatus.FOUND)
    public Customer searchCustomer(@PathVariable Integer id) {

        return service.searchCustomer(id);
    }

    @PutMapping("/update")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void updateCustomer(@RequestBody Customer customer) {
        service.updateCustomer(customer);
    }

    @DeleteMapping("/deleteById/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void deleteCustomer(@PathVariable Integer id){
        service.deleteCustomer(id);
    }

    @GetMapping("/getAll")
    @ResponseStatus(HttpStatus.FOUND)
    public List<Customer> getAll() {
        return service.getAll();
    }

    @GetMapping("/searchByName/{name}")
    @ResponseStatus(HttpStatus.FOUND)
    public List<Customer> searchCustomerByName(@PathVariable String name) {
        return service.searchCustomerByName(name);
    }

}
