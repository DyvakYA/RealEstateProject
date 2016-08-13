package utils.comparison;

import estate.Realty;

import java.util.Comparator;

/**
 * Created by Dyvak on 13.08.2016.
 */
public enum RealtyComparator implements Comparator<Realty> {
    ID {
        @Override
        public int compare(Realty a, Realty b) {
            return Long.compare(a.getId(), b.getId());
        }
    },
    STREET {
        @Override
        public int compare(Realty a, Realty b) {
            return a.getStreet().compareTo(b.getStreet()) != 0 ?
                    a.getStreet().compareTo(b.getStreet()) :
                    HOUSENUMBER.compare(a, b);
        }
    },
    HOUSENUMBER {
        @Override
        public int compare(Realty a, Realty b) {
            return Integer.compare(a.getHouseNumber(), b.getHouseNumber());
        }
    },
    PRICE {
        @Override
        public int compare(Realty a, Realty b) {
            return  Integer.compare(a.getPrice(), b.getPrice()) != 0 ?
                    Integer.compare(a.getPrice(), b.getPrice()) :
                    STREET.compare(a, b);
        };
}
}
