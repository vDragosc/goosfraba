package com.project.city.management.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "carObj")
@Table(name = "car")
public class Car {

    @Id
    private String id;

    private String city;

    private boolean isParked;

    private String parkFacilityId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public boolean isParked() {
        return isParked;
    }

    public void setParked(boolean parked) {
        isParked = parked;
    }

    public String getParkFacilityId() {
        return parkFacilityId;
    }

    public void setParkFacilityId(String parkFacilityId) {
        this.parkFacilityId = parkFacilityId;
    }

}
