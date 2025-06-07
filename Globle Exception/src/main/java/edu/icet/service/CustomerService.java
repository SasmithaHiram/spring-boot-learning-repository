package edu.icet.service;

import edu.icet.dto.Customer;

import java.util.List;

public interface CustomerService {
    boolean addCustomer(Customer customer);

    Customer searchCustomer(Integer id);

    void updateCustomer(Customer customer);

    void deleteCustomer(Integer id);

    List<Customer> getAll();

    List<Customer> searchCustomerByName(String name);

    Integer cal(Integer a, Integer b);

}
