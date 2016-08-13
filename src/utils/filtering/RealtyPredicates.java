package utils.filtering;

import estate.Realty;

import java.util.Objects;

/**
 * Created by Dyvak on 13.08.2016.
 */
public final class RealtyPredicates {

    private RealtyPredicates() {}

    public static Predicate<Realty> byId(int id) {
        return new Predicate<Realty>() {
            @Override
            public boolean apply(Realty realty) {
                if (realty == null) {
                    return false;
                }

                return realty.getId() == id;
            }
        };
    }

    public static Predicate<Realty> byStreet(String street) {
        return new Predicate<Realty>() {
            @Override
            public boolean apply(Realty realty) {
                if (realty == null) {
                    return false;
                }

                return Objects.equals(realty.getStreet(), street);
            }
        };
    }

    public static Predicate<Realty> byHouseNumber(int minHouseNumber, int maxHouseNumber) {
        return new Predicate<Realty>() {
            @Override
            public boolean apply(Realty person) {
                if (person == null) {
                    return false;
                }

                return person.getHouseNumber() >= minHouseNumber && person.getHouseNumber() <= maxHouseNumber;
            }
        };
    }
}