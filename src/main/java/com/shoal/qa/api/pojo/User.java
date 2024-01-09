package com.shoal.qa.api.pojo;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.jackson.Jacksonized;

@Getter
@Setter
@Jacksonized
@Builder(toBuilder = true)
public class User {

    private String customerID;
    private String accountNumber;
    private String phone;
    private String emailID;
    private String nationalID;

}
