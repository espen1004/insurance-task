package com.example.insurancetaskws.agreement;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("agreements")
public class AgreementResource {

    private final AgreementService agreementService;

    @PostMapping()
    public AgreementResponse getProductsByCategory(@RequestBody AgreementRequest agreementRequest) {
        return agreementService.createAgreement(agreementRequest);
    }
}
