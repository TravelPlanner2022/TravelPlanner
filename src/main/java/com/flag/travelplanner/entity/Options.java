package com.flag.travelplanner.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name ="options")
public class Options implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @ManyToOne
    @JsonIgnore
    private Cart cart;

    @OneToMany(mappedBy = "options", cascade = CascadeType.ALL, fetch=FetchType.EAGER)
    private List<Attractions> attractionsList;

    private double price;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }

    public List<Attractions> getAttractionsList() {
        return attractionsList;
    }

    public void setAttractionsList(List<Attractions> attractionsList) {
        this.attractionsList = attractionsList;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
