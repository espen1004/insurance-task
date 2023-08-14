package com.example.insurancetaskws.customer;

import java.util.UUID;

import lombok.Builder;

@Builder
public class Customer {

    private String firstName;
    private String lastName;
    private String email;
    private String customerPid;
    private UUID customerNumber;

}
