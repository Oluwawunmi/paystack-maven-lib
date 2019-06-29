package com.plethub.plugins.model;


import lombok.Data;

@Data
public class PaymentData {
    private String status;

    private String transaction_date;

    private Authorization authorization;

    private String fees;

    private PaystackCustomer customer;

    private String reference;

    private String currency;

    private String amount;

    private String message;

    private String ip_address;

    private String plan;

    private String domain;

    private String gateway_response;

    private String channel;

}
