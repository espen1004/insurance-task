package com.example.insurancetaskws.agreement;

import lombok.Data;

@Data
public class AgreementRequest {
    private String carRegistrationNumber;
    private String customerPid;
    private String firstName;
    private String lastName;
    private String email;
}
