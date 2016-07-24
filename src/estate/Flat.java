package estate;

import java.util.Objects;

public class Flat extends Realty{
    
    private int Floor;
    private boolean isPrimary;
    private int buildingFloor;
   
    public Flat() {
    }
    
    public int getFloor() {
        return Floor;
    }

    public void setFloor(int Floor) {
        this.Floor = Floor;
    }

    public boolean isIsPrimary() {
        return isPrimary;
    }

    public void setIsPrimary(boolean isPrimary) {
        this.isPrimary = isPrimary;
    }

    public int getBuildingFloor() {
        return buildingFloor;
    }

    public void setBuildingFloor(int buildingFloor) {
        this.buildingFloor = buildingFloor;
    }
    
    @Override
    public double getPrice() {
        return area*2;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), Floor, isPrimary, buildingFloor);
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
        if (this.isPrimary != other.isPrimary) {
            return false;
        }
        if (this.buildingFloor != other.buildingFloor) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Flat{");
        sb.append("id=").append(id);
        sb.append(", adDate=").append(adDate);
        sb.append(", area=").append(area);
        sb.append(", district='").append(district).append('\'');
        sb.append(", street='").append(street).append('\'');
        sb.append(", houseNumber='").append(houseNumber).append('\'');
        sb.append(", numberOfRooms=").append(numberOfRooms);
        sb.append(", description='").append(description).append('\'');
        sb.append(", seller=").append(seller);
        sb.append(", isSold=").append(isSold);
        sb.append("\n ----------- \n");
        sb.append("Floor=").append(Floor);
        sb.append(", isPrimary=").append(isPrimary);
        sb.append(", buildingFloor=").append(buildingFloor);
        sb.append('}');
        return sb.toString();
    }
}