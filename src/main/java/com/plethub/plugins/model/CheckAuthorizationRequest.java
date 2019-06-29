package com.plethub.plugins.model;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class CheckAuthorizationRequest {

    private BigDecimal amount;

    private String email;

    private String authorization_code;

    public CheckAuthorizationRequest(BigDecimal amount, String email, String authorization_code) {
        this.amount = amount;
        this.email = email;
        this.authorization_code = authorization_code;
    }

    @Override
    public String toString() {
        return "CheckAuthorizationRequest{" +
                "amount=" + amount +
                ", email='" + email + '\'' +
                ", authorization_code='" + authorization_code + '\'' +
                '}';
    }
}
