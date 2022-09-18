package com.flag.travelplanner.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "attractions")
public class Attraction implements Serializable {
    private static final long serialVersionUID = -2455760938054036364L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int attractionsId;
    private String attractionsName;
    private int latitude;
    private int longitude;

    @ManyToOne
    @JsonIgnore
    private Option option;

    public Option getOption() {
        return option;
    }

    public int getId() { return attractionsId; }

    public void setId(int aid) {
        this.attractionsId = aid;
    }

    public String getAttractionsName() {
        return attractionsName;
    }

    public void setAttractionsName(String attractionsName) {
        this.attractionsName = attractionsName;
    }

    public int getLatitude() {
        return latitude;
    }

    public void setLatitude(int latitude) {
        this.latitude = latitude;
    }

    public int getLongitude() {
        return longitude;
    }

    public void setLongitude(int longitude) {
        this.longitude = longitude;
    }

}