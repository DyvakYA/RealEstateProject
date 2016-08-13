package estate;

import java.util.Objects;

public class House extends Realty {

    private int numberOfFloors;
    private boolean hasGarage;
    private int courtyardArea;

    public House(int area, String district, String street, int houseNumber, int numberOfRooms, String description) {
        super(street, houseNumber);
        this.area = area;
        this.district = district;
        this.street = street;
        this.houseNumber = houseNumber;
        this.numberOfRooms = numberOfRooms;
        this.description = description;

    }


    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    public boolean isHasGarage() {
        return hasGarage;
    }

    public void setHasGarage(boolean hasGarage) {
        this.hasGarage = hasGarage;
    }

    public int getCourtyardArea() {
        return courtyardArea;
    }

    public void setCourtyardArea(int courtyardArea) {
        this.courtyardArea = courtyardArea;
    }

    @Override
    public int getPrice() {
        return area*3;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof House)) return false;
        if (!super.equals(o)) return false;
        House house = (House) o;
        return numberOfFloors == house.numberOfFloors &&
                hasGarage == house.hasGarage &&
                courtyardArea == house.courtyardArea;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), numberOfFloors, hasGarage, courtyardArea);
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("House{");
        sb.append("id=").append(id);
        sb.append(", addDate=").append(addDate);
        sb.append(", area=").append(area);
        sb.append(", district='").append(district).append('\'');
        sb.append(", street='").append(street).append('\'');
        sb.append(", houseNumber='").append(houseNumber).append('\'');
        sb.append(", numberOfRooms=").append(numberOfRooms);
        sb.append(", description='").append(description).append('\'');
        sb.append(", seller=").append(seller);
        sb.append(", isSold=").append(isSold);
        sb.append("\n");
        sb.append("numberOfFloors=").append(numberOfFloors);
        sb.append(", hasGarage=").append(hasGarage);
        sb.append(", courtyardArea=").append(courtyardArea);
        sb.append('}');
        sb.append("\n");
        return sb.toString();
    }
}