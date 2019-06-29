package com.plethub.plugins.model;

import lombok.Data;

@Data
public class CheckAuthorization {

    private String message;

    private Boolean status;

    private CheckAuthorizationData data;
}
