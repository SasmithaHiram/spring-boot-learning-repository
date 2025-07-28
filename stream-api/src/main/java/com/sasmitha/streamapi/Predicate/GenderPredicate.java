package com.sasmitha.streamapi.Predicate;

import com.sasmitha.streamapi.model.Customer;

import java.util.function.Predicate;

public class GenderPredicate implements Predicate<Customer> {
    @Override
    public boolean test(Customer customer) {
        return "FEMALE".equalsIgnoreCase(customer.getGender());
    }
}
