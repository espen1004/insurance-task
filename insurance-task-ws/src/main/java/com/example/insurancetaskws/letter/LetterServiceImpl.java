package com.example.insurancetaskws.letter;

import org.springframework.stereotype.Service;

import com.example.insurancetaskws.agreement.AgreementResponse;
import com.example.insurancetaskws.customer.Customer;

@Service
public class LetterServiceImpl implements LetterService{

    @Override
    public void sendLetterToCustomer(AgreementResponse agreementResponse, Customer customer) {
        // Do nothing, mock implementation
    }
}
