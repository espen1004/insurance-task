package com.example.insurancetaskws.agreement;

import java.util.UUID;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class AgreementResponse {

    private UUID agreementID;
    private AgreementStatus status;
}
