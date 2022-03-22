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
@Table(name = "purchase_order")
public class PurchaseOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "purchase_order_code",nullable = false)
    private Long purchaseOrderCode;

    @Column(name = "product_name", nullable = false)
    private String productName;

    @Column(name = "product_description", nullable = false)
    private String productDescription;

    @Column(name = "quantity", nullable = false)
    private int quantity;

    @Column(name = "unit_price", nullable = false)
    private double unitPrice;

     @Column(name = "total_amount", nullable = false)
    private double totalAmount;

    @Column(name = "grand_total",nullable = false)
    private double grandTotal;

    public PurchaseOrder(){}

    public PurchaseOrder(String productName, String productDescription, int quantity, double unitPrice, double totalAmount, double grandTotal) {
        this.productName = productName;
        this.productDescription = productDescription;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
        this.totalAmount = totalAmount;
        this.grandTotal = grandTotal;
    }
}
