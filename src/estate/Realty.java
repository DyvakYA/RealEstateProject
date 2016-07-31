package estate;

import java.util.Objects;

public abstract class Realty implements Estate{
  
    protected final long id;
    protected final long adDate;
    protected int area;
    protected String district;
    protected String street;
    protected String houseNumber;
    protected int numberOfRooms;
    protected String description;
    protected Seller seller;
    protected boolean isSold;
    
    public Realty() {
        this.id = estate.RealtyUtils.getId();
        this.adDate = RealtyUtils.getData();
    }
   
    public long getId() {
        return id;
    }

    public long getData() {
        return adDate;
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

    public String getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Realty)) return false;
        Realty realty = (Realty) o;
        return id == realty.id &&
                adDate == realty.adDate &&
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
        return Objects.hash(id, adDate, area, district, street, houseNumber, numberOfRooms, description, seller, isSold);
    }
}