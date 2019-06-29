package com.plethub.plugins.model;

import lombok.Data;

@Data
public class Authorization {

    private String exp_year;

    private String exp_month;

    private String card_type;

    private Boolean reusable;

    private String brand;

    private String bank;

    private String bin;

    private String last4;

    private String authorization_code;

    private String country_code;

    private String channel;

    private String signature;
}
