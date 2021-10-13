package com.ecommerce.shop.data.model;

import javax.persistence.*;

@Entity
public class Newsletter {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(nullable = true)
    private String email;

}
