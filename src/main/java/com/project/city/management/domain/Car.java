package com.project.city.management.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "carObj")
@Table(name = "car")
public class Car extends Vehicle{

    @Id
    private String id;

    private String city;

    private boolean isParked;

    private String parkFacilityId;

    @Override
    public String getId() {
        return id;
    }

    @Override
    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String getCity() {
        return city;
    }

    @Override
    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public boolean getIsParked() {
        return isParked;
    }

    @Override
    public void setIsParked(boolean parked) {
        this.isParked = parked;
    }

    @Override
    public String getParkFacilityId() {
        return parkFacilityId;
    }

    @Override
    public void setParkFacilityId(String parkFacilityId) {
        this.parkFacilityId = parkFacilityId;
    }
}
