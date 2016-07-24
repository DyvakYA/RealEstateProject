package estate;

import java.util.Comparator;

/**
 * Created by Dyvak on 24.07.2016.
 */
public class SortUtils {

    class PriceComparator implements Comparator<Realty> {
        @Override
        public int compare(Realty a, Realty b) {
            return Integer.compare(a.getPrice(), b.getPrice());
        }
    }

    class StreetComparator implements Comparator<Realty> {

    @Override
    public int compare(Realty a, Realty b) {
        return Integer.compare(
                a.getStreet().length(),
                b.getStreet().length());
    }
}


}
