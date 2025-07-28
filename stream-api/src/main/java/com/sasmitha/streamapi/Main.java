package com.sasmitha.streamapi;

import com.sasmitha.streamapi.service.CustomerService;

public class Main {
    public static void main(String[] args) {
        CustomerService customerService = new CustomerService();
        customerService.getCustomers();
    }
}