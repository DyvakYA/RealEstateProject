package estate;

import utils.RealtyUtils;

import java.io.Serializable;
import java.util.Objects;

public abstract class Realty implements Estate, Serializable {

    private static final long serialVersionUID = 7386683912412979589L;
  
    protected final long id;
    protected final long addDate;
    protected int area;
    protected String district;
    protected String street;
    protected int houseNumber;
    protected int numberOfRooms;
    protected String description;
    protected Seller seller;
    protected boolean isSold;
    
    public Realty(String district, int houseNumber) {
        this.id = RealtyUtils.getId();
        this.addDate = RealtyUtils.getDate();
        this.area = area;
        this.district = district;
        this.street = street;
        this.houseNumber = houseNumber;
        this.numberOfRooms = numberOfRooms;
        this.description = description;
        this.seller = seller;
    }

    public Realty(int area, String district, String s, String street, int numberOfRooms, String houseNumber) {
        this.id = RealtyUtils.getId();
        this.addDate = RealtyUtils.getDate();
    }

    public Realty(String street, String houseNumber) {
        this.id = RealtyUtils.getId();
        this.addDate = RealtyUtils.getDate();
    }

    public Realty(long id, long addDate, String name, String surname, String phoneNumber) {
        this.id = id;
        this.addDate = addDate;
    }

    public long getId() {
        return id;
    }

    public long getDate() {
        return addDate;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Seller getSeller() {
        return seller;
    }

    public void setSeller(Seller seller) {
        this.seller = seller;
    }

    public boolean isSold() {
        return isSold;
    }

    public void setSold(boolean sold) {
        isSold = sold;
    }

    @Override
    public String toString() {
        return "Realty{" +
                "id=" + id +
                ", addDate=" + addDate +
                ", area=" + area +
                ", district='" + district + '\'' +
                ", street='" + street + '\'' +
                ", houseNumber='" + houseNumber + '\'' +
                ", numberOfRooms=" + numberOfRooms +
                ", description='" + description + '\'' +
                ", seller=" + seller +
                ", isSold=" + isSold +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Realty)) return false;
        Realty realty = (Realty) o;
        return id == realty.id &&
                addDate == realty.addDate &&
                area == realty.area &&
                numberOfRooms == realty.numberOfRooms &&
                isSold == realty.isSold &&
                Objects.equals(district, realty.district) &&
                Objects.equals(street, realty.street) &&
                Objects.equals(houseNumber, realty.houseNumber) &&
                Objects.equals(description, realty.description) &&
                Objects.equals(seller, realty.seller);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, addDate, area, district, street, houseNumber, numberOfRooms, description, seller, isSold);
    }
}