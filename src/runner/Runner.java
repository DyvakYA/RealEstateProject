package runner;

import estate.*;
import utils.comparison.MultiComparator;
import utils.comparison.OrderedComparator;
import utils.filtering.Filter;
import utils.filtering.RealtyPredicates;

import java.util.Collections;
import java.util.List;

import static utils.ReadFiles.createRealties;
import static utils.ReadFiles.createSellers;
import static utils.RealtyUtils.printAll;
import static utils.comparison.OrderedComparator.Order.ASC;
import static utils.comparison.OrderedComparator.Order.DESC;
import static utils.comparison.RealtyComparator.HOUSENUMBER;
import static utils.comparison.RealtyComparator.ID;
import static utils.comparison.RealtyComparator.STREET;


/**
 * Created by Dyvak on 13.08.2016.
 */
public class Runner {



    public static void main(String[] args) {
        List<Realty> realty = createRealties();
        List<Seller> sellers = createSellers();

        realty = Filter.filter(realty, RealtyPredicates.byStreet("Kievskaya"));
        realty = Filter.filter(realty, RealtyPredicates.byHouseNumber(3, 25));

        Collections.sort(realty, new MultiComparator<>(
                new OrderedComparator<>(HOUSENUMBER, DESC),
                new OrderedComparator<>(STREET, ASC),
                new OrderedComparator<>(ID, DESC)
        ));

        printAll(sellers);
        printAll(realty);
    }
}

//    public static void main(String[] args) {
//
//        // Realty
//        List<Seller> sellers = new ArrayList<>();
//
//
//
//        //Printing all Realty
//        printAll(sellers);
//        separator();
//
//        //Filter realties by price less 5000
//        List<Realty> filtered = FilterUtils.filterLowerPrice(real, 5000);
//
//        for (Realty i : filtered) {
//            System.out.println(i.getStreet() + " " + i.getHouseNumber() + " Price: " + i.getPrice());
//        }
//        separator();
//
//        //Sorting realties by price
//        Collections.sort(real, SortUtils.PRICE);
//
//        for (Realty i : real) {
//            System.out.println(i.getStreet() + " " + i.getHouseNumber() + " Price: " + i.getPrice());
//        }
//    }}

