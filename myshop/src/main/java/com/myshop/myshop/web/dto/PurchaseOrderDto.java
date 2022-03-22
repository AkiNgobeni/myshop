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
public class PurchaseOrderDto {

    private String productName;

    private String productDescription;

    private int quantity;

    private double unitPrice;

    private double totalAmount;

    private double grandTotal;

    public PurchaseOrderDto() {
    }
}
