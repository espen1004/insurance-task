package com.example.insurancetaskws.customer;

public interface CustomerService {
    Customer createCustomer(String customerPid, String firstName, String lastName, String email);

}
