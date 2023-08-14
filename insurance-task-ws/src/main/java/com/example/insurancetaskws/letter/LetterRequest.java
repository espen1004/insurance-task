package com.example.insurancetaskws.letter;

import lombok.Data;

@Data
public class LetterRequest {

    private String agreementNumber;
    private String customerPid;
    private String firstName;
    private String lastName;
}
