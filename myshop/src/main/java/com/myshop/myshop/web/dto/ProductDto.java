package com.myshop.myshop.web.dto;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;

/**
 * @author Nyiko Ngobeni
 * @since 03-2022
 */

@Getter
@Setter
@AllArgsConstructor(access = AccessLevel.PUBLIC)
public class ProductDto {

    @NotEmpty(message = "Product name can't be empty")
    private String name;

    @NotEmpty(message = "Product description can't be empty")
    private String description;

    @Min(value = 1,message = "Product price can't be less than 0")
    private double price;

    public ProductDto() {
    }
}
