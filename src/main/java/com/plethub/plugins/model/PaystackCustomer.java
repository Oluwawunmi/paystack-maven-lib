package com.plethub.plugins.model;

import lombok.Data;

@Data
public class PaystackCustomer {

    private String id;

    private String first_name;

    private String phone;

    private String customer_code;

    private String email;

    private String last_name;

    private String risk_action;
}
