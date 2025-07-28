package com.sasmitha.streamapi.service;

import com.sasmitha.streamapi.Predicate.GenderPredicate;
import com.sasmitha.streamapi.model.Customer;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class CustomerService {

    public List<Customer> getCustomers() {
        List<Customer> customers = Arrays.asList(new Customer("Sasmitha", "Male"),
                new Customer("Udayanga", "MALE"),
                new Customer("Prashansa", "FEMALE"),
                new Customer("Thakshila", "FEMALE"));

        Set<Customer> collect = customers.stream()
                .filter(new GenderPredicate())
                .collect(Collectors.toSet());

        System.out.println(collect);


        return null;
    }
}
