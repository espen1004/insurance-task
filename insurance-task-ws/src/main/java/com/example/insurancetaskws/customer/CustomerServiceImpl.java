package com.example.insurancetaskws.customer;

import java.util.UUID;

import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Override
    public Customer createCustomer(String customerPid, String firstName, String lastName, String email) {
        return Customer
                .builder()
                .firstName(firstName)
                .lastName(lastName)
                .customerPid(customerPid)
                .email(email)
                .customerNumber(UUID.randomUUID())
                .build();
    }

}
