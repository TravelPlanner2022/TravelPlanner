package com.flag.travelplanner.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "options")
public class Option implements Serializable {

    private static final long serialVersionUID = 7551999649936522523L;

    @Id
    private int routeId;
    private int customerId;
    private String attractions;
    private String routeType;
    private int days;
    private String startPoint;
    private String destination;
    private double price;
    private String imageUrl;

    @OneToMany(mappedBy = "Options",  cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Attraction> attractionsList;

    public List<Attraction> getAttractionsList() {
        return attractionsList;
    }
    public int getRouteId() {
        return routeId;
    }

    public void setRouteId(int routeId) {
        this.routeId = routeId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getAttractions() {
        return attractions;
    }

    public void setAttractions(String attractions) {
        this.attractions = attractions;
    }


    public String getRouteType() {return routeType; }

    public void setRouteType(String routeType) { this.routeType = routeType;}

    public int getDays() { return days;}

    public void setDays(int days) {this.days = days; }

    public String getStartPoint() {return startPoint; }

    public void setStartPoint(String startPoint) {
        this.startPoint = startPoint;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}