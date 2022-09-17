package com.flag.travelplanner.entity;

import javax.persistence.*;

@Entity
@Table(name = "cart")
public class Cart {

    private static final long serialVersionUID = 8436097833452420298L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private double totalPrice;
}
