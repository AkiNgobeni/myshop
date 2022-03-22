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
@Table(name = "invoice")
public class Invoice {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "invoice_no", nullable = false)
    private Long invoiceNo;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "customer_id")
    private Customer customer;

    @Column(name = "grand_total", nullable = false)
    private double grandTotal;

    @Column(name = "quantity", nullable = false)
    private int quantity;

}
