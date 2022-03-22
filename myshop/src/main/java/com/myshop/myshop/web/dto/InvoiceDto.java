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
public class InvoiceDto {

    private String billNo;

    private CustomerRegistrationDto customer;

    private double grandTotal;

    private int quantity;

    public InvoiceDto() {
    }

}
