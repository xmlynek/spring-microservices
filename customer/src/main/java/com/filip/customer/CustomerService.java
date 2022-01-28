package com.filip.customer;

import org.springframework.stereotype.Service;

@Service
public record CustomerService (CustomerRepository customerRepository) {
    public void registerCustomer(CustomerRequest customerRequest) {
        Customer customer = Customer.builder()
                .firstName(customerRequest.firstName())
                .lastName(customerRequest.lastName())
                .email(customerRequest.email())
                .build();

        // todo: check if email is valid
        // todo: check if email is not taken

        customerRepository.save(customer);
    }
}
