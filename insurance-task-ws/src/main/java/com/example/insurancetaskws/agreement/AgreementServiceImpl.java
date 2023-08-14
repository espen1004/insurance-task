package com.example.insurancetaskws.agreement;

import java.util.UUID;

import org.springframework.stereotype.Service;

import com.example.insurancetaskws.customer.Customer;
import com.example.insurancetaskws.customer.CustomerService;
import com.example.insurancetaskws.letter.LetterService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AgreementServiceImpl implements AgreementService {

    private final CustomerService customerService;
    private final LetterService letterService;

    @Override
    public AgreementResponse createAgreement(AgreementRequest agreementRequest) {
        Customer customer = customerService.createCustomer(agreementRequest.getCustomerPid(), agreementRequest.getFirstName(),
                agreementRequest.getLastName(), agreementRequest.getEmail());
        AgreementResponse agreementResponse = createAgreementInFagsystem(agreementRequest);
        letterService.sendLetterToCustomer(agreementResponse, customer);
        updateStatusInFagsystem(agreementResponse);
        return agreementResponse;
    }

    private AgreementResponse createAgreementInFagsystem(AgreementRequest agreementRequest) {
        return AgreementResponse
                .builder()
                .agreementID(UUID.randomUUID())
                .status(AgreementStatus.PENDING)
                .build();

    }

    private AgreementResponse updateStatusInFagsystem(AgreementResponse agreementResponse) {
        // Do nothing, mock implementation
        agreementResponse.setStatus(AgreementStatus.AGREEMENT_SENT);
        return agreementResponse;
    }
}
