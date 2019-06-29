package com.plethub.plugins.model;

import lombok.Data;

@Data
public class PaystackResponse {

    private String message;

    private String status;

    private PaymentData data;
}
