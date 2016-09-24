package com.dyvak.est.estate;

import java.util.Objects;

/**
 * Created by Dyvak on 13.08.2016.
 */

public  class Flat extends Realty {

    private int Floor;
    private boolean Primary;
    private int buildingFloors;


    public Flat(int area, String district, String street, int houseNumber, int numberOfRooms, String description) {
        super(street, houseNumber);
        this.area = area;
        this.district = district;
        this.street = street;
        this.houseNumber = houseNumber;
        this.numberOfRooms = numberOfRooms;
        this.description = description;

    }

    public int getFloor() {
        return Floor;
    }

    public void setFloor(int Floor) {
        this.Floor = Floor;
    }

    public boolean getPrimary() {
        return Primary;
    }

    public void setPrimary(boolean isPrimary) {
        this.Primary = isPrimary;
    }

    public int getBuildingFloors() {
        return buildingFloors;
    }

    public void setBuildingFloors(int buildingFloor) {
        this.buildingFloors = buildingFloor;
    }

    @Override
    public int getPrice() {
        return area * 8000;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), Floor, Primary, buildingFloors);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Flat other = (Flat) obj;
        if (this.Floor != other.Floor) {
            return false;
        }
        if (this.Primary != other.Primary) {
            return false;
        }
        if (this.buildingFloors != other.buildingFloors) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Flat{");
        sb.append("id=").append(id);
        sb.append(", adDate=").append(addDate);
        sb.append(", area=").append(area);
        sb.append(", district='").append(district).append('\'');
        sb.append(", street='").append(street).append('\'');
        sb.append(", houseNumber='").append(houseNumber).append('\'');
        sb.append(", numberOfRooms=").append(numberOfRooms);
        sb.append(", description='").append(description).append('\'');
        sb.append(", seller=").append(seller);
        sb.append(", isSold=").append(isSold);
        sb.append("\n");
        sb.append("Floor=").append(Floor);
        sb.append(", isPrimary=").append(Primary);
        sb.append(", buildingFloor=").append(buildingFloors);
        sb.append('}');
        return sb.toString();
    }

}