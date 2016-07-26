package estate;

import java.util.ArrayList;
import java.util.List;

public class FilterUtils {

    public static List<Realty> filterLowerPrice(List<Realty> realties, int price){

        List<Realty> results = new ArrayList<>();
        for (Realty realty : realties){
            if (realty.getPrice() < price){
                results.add(realty);
            }
        }
        return results;
    }

    public static List<Realty> filterByStreet(List<Realty> realties, String street){

        List<Realty> results = new ArrayList<>();
        for (Realty realty: realties){
            if (realty.getStreet().equals(street))
                results.add(realty);
        }
        return results;
    }
}