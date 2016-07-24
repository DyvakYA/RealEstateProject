package estate;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EstateRunner {

    public static void main(String[] args) {

        List<Realty>  estates = CreateEstate.createEstates();

        FilterUtils.getPrice(estates, 1000);

        RealtyUtils.getAll(estates);


    }


        private static void testSortByAgeAsc(List<Realty> initRealty) {
            List<Realty> realties = new ArrayList<>(initRealty);

            Collections.sort(realties, RealtyComparator.PRICE);
        RealtyUtils.printList("Sorted realties list (AGE, ACS):", realties);
        }

        private static void testSortByNameDesc(List<Realty> initRealty) {
            List<Realty> realties = new ArrayList<>(initRealty);

            Collections.sort(realties, Collections.reverseOrder(RealtyComparator.STREET));
           RealtyUtils.printList("Sorted realties list (NAME, DESC):", realties);
        }


    //List<Realty> estates = CreateEstate.createEstates();

   // RealtyUtils.getAll(estates);
   
    //FilterUtils.getStreet(estates, "L.Tolstoy");
    //FilterUtils.getPrice(estates, 1000);
    }

