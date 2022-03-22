package com.myshop.myshop.web.dto;


import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * @author Nyiko Ngobeni
 * @since 03-2022
 */

@Getter
@Setter
@AllArgsConstructor(access = AccessLevel.PUBLIC)
public class CustomerRegistrationDto {

    private String firstName;
    private String lastName;
    private String email;
    private String password;

    public CustomerRegistrationDto() {
    }

}
