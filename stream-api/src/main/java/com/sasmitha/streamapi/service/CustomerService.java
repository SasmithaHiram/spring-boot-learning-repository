package com.sasmitha.streamapi.service;

import com.sasmitha.streamapi.model.Customer;

import java.util.Arrays;
import java.util.List;

public class CustomerService {

    public List<Customer> getCustomers() {
        Arrays.asList(new Customer("Sasmitha", "Male"),
                new Customer("Udayanga", "MALE"),
                new Customer("Vishmitha", "FEMALE"));

        return null;
    }
}
