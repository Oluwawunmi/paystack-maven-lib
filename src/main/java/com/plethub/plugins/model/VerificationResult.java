package com.plethub.plugins.model;

import lombok.Data;

@Data
public class VerificationResult {

    private boolean verified;
    private PaymentData paymentData;
}
