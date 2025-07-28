package com.sasmitha.streamapi.service;

import com.sasmitha.streamapi.Predicate.GenderPredicate;
import com.sasmitha.streamapi.model.Customer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class CustomerService {

    public List<Customer> getCustomers() {
        List<Customer> customers = Arrays.asList(new Customer("Sasmitha", "Male"),
                new Customer("Udayanga", "MALE"),
                new Customer("Prashansa", "FEMALE"),
                new Customer("Thakshila", "FEMALE"));

        Predicate<Customer> genderPredicate = customer -> customer.getGender().equalsIgnoreCase("MALE");

        List<String> male = customers.stream()
                .filter(customer -> customer.getGender() != null)
                .filter(customer -> customer.getGender() != null)
                .filter(customer -> customer.getGender().equalsIgnoreCase("MALE"))
                .map(Customer::getName)
                .toList();

        return null;
    }
}
