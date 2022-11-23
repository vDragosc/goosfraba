package com.project.city.management.domain;

public abstract class Vehicle {

    String type;



    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public abstract String getId();

    public abstract void setId(String id);

    public abstract String getCity();

    public abstract void setCity(String city);

    public abstract boolean getIsParked();

    public abstract void setIsParked(boolean parked);

    public abstract String getParkFacilityId();

    public abstract void setParkFacilityId(String parkFacilityId);

}
