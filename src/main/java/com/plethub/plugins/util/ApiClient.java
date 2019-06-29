package com.plethub.plugins.util;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ApiClient {

    private String secretKey;
    private String publicKey;

}
