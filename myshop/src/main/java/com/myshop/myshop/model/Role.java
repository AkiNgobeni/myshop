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
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    public Role(){};
    public Role(String name) {
        this.name = name;
    }
}
