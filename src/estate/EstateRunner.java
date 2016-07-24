package estate;

import java.util.ArrayList;
import java.util.List;

public class EstateRunner {

    public static void main(String[] args) {
    List<Realty> estates = CreateEstate.createEstates();

    RealtyUtils.getAll(estates);
   
    FilterUtils.getStreet(estates, "L.Tolstoy");
    FilterUtils.getPrice(estates, 1000);
    }
}
