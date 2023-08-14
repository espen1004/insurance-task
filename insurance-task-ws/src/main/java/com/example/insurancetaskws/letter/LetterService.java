package com.example.insurancetaskws.letter;

import com.example.insurancetaskws.agreement.AgreementResponse;
import com.example.insurancetaskws.customer.Customer;

public interface LetterService {
    void sendLetterToCustomer(AgreementResponse agreementResponse, Customer customer);
}
