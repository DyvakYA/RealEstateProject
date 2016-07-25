package estate;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public abstract class Seller <T extends Realty & Estate> {

    protected final long id;
    protected final long adDate;
    protected String name;
    protected String surname;
    protected String phoneNamber;
    protected List<T> realties = new ArrayList<>();

    public Seller() {
        this.id = RealtyUtils.getId();
        this.adDate = RealtyUtils.getData();
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
        return phoneNamber;
    }

    public void setPhoneNamber(String phoneNamber) {
        this.phoneNamber = phoneNamber;
    }

    public List<T> getRealties() {
        return realties;
    }

    public void addRealties(T realty) {
        this.realties.add(realty);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Seller)) return false;
        Seller<?> seller = (Seller<?>) o;
        return id == seller.id &&
                adDate == seller.adDate &&
                Objects.equals(name, seller.name) &&
                Objects.equals(surname, seller.surname) &&
                Objects.equals(phoneNamber, seller.phoneNamber) &&
                Objects.equals(realties, seller.realties);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, adDate, name, surname, phoneNamber, realties);
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Seller{");
        sb.append("id=").append(id);
        sb.append(", adDate=").append(adDate);
        sb.append(", name='").append(name).append('\'');
        sb.append(", surname='").append(surname).append('\'');
        sb.append(", phoneNamber='").append(phoneNamber).append('\'');

        sb.append('}');
        return sb.toString();
    }
}


