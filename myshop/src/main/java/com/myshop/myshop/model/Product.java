package com.myshop.myshop.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * @author Nyiko Ngobeni
 * @since 03-2022
 */

@Getter
@Setter
@Entity
@Table(name = "product")
public class Product {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_code", nullable = false)
    private Long productCode;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "description", nullable = false)
    private String description;


    @Column(name = "price", nullable = false)
    private Double price;

    public Product(){}

    public Product(String name, String description, Double price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }
}
