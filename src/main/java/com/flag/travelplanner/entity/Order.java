package com.flag.travelplanner.entity;

import javax.persistence.*;

@Entity
@Table(name ="order")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
}
