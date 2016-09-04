package runner;

import estate.*;
import utils.ReadFromFileAdapter;
import utils.ReadFromFileInterface;
import utils.comparison.MultiComparator;
import utils.comparison.OrderedComparator;
import utils.filtering.Filter;
import utils.filtering.RealtyPredicates;

import java.util.Collections;
import java.util.List;

import static utils.RealtyUtils.printAll;
import static utils.comparison.OrderedComparator.Order.ASC;
import static utils.comparison.OrderedComparator.Order.DESC;
import static utils.comparison.RealtyComparator.*;

/**
 * Created by Dyvak on 13.08.2016.
 */

public class Runner {

    public static void main(String[] args) {

        ReadFromFileInterface g1 = new ReadFromFileAdapter();
        List<Realty> realty = g1.createRealtiesAndLog();
        List<Seller> sellers = g1.createSellersAndLog();

        printAll(sellers);
        printAll(realty);

        realty = Filter.filter(realty, RealtyPredicates.byStreet("Kievskaya"));
        realty = Filter.filter(realty, RealtyPredicates.byHouseNumber(3, 25));

        Collections.sort(realty, new MultiComparator<>(
                new OrderedComparator<>(HOUSENUMBER, DESC),
                new OrderedComparator<>(STREET, ASC),
                new OrderedComparator<>(ID, DESC),
                new OrderedComparator<>(PRICE, DESC)
        ));

        printAll(realty);
    }
}