package com.sasmitha.stateful.service;

import com.sasmitha.stateful.model.Customer;
import com.sasmitha.stateful.model.CustomerAddress;
import com.sasmitha.stateful.model.CustomerProfile;
import org.springframework.stereotype.Service;

@Service
public class KYCServiceImp {
    private Customer customer = new Customer();

    public void saveProfile(CustomerProfile profile) {
        customer.setProfile(profile);
    }

    public void saveAddress(CustomerAddress address) {
        customer.setAddress(address);
    }

    public Customer approve() {
        return this.customer;
    }
}
