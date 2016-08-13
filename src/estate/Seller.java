package estate;

import utils.RealtyUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Created by Dyvak on 13.08.2016.
 */

public class Seller{

    private final long id;
    private final long adDate;
    protected String name;
    protected String surname;
    protected String phoneNumber;
    protected List<Realty> realties = new ArrayList<>();

    public Seller(String name, String surname, String phoneNumber) {
        this.id = RealtyUtils.getId();
        this.adDate = RealtyUtils.getDate();
        this.name = name;
        this.surname = surname;
        this.phoneNumber = phoneNumber;
    }

    public long getId() {
        return id;
    }

    public long getAdDate() {
        return adDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPhoneNamber() {
        return phoneNumber;
    }

    public void setPhoneNamber(String phoneNamber) {
        this.phoneNumber = phoneNamber;
    }

    public  List<Realty> getRealties() {
        return realties;
    }

    public void addRealties(Realty realty) {
        this.realties.add(realty);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Seller)) return false;
        Seller seller = (Seller) o;
        return Objects.equals(name, seller.name) &&
                Objects.equals(surname, seller.surname) &&
                Objects.equals(phoneNumber, seller.phoneNumber) &&
                Objects.equals(realties, seller.realties);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, phoneNumber, realties);
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Seller{");
        sb.append("id=").append(id);
        sb.append(", adDate=").append(adDate);
        sb.append(", name='").append(name).append('\'');
        sb.append(", surname='").append(surname).append('\'');
        sb.append(", phoneNamber='").append(phoneNumber).append('\'');

        sb.append('}');
        return sb.toString();
    }
}
