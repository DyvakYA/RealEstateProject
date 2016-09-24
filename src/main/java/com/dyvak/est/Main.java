package com.dyvak.est;

import com.dyvak.est.estate.*;
import com.dyvak.est.utils.ReadFromFileAdapter;
import com.dyvak.est.utils.ReadFromFileInterface;
import com.dyvak.est.utils.comparison.MultiComparator;
import com.dyvak.est.utils.comparison.OrderedComparator;
import com.dyvak.est.utils.filtering.Filter;
import com.dyvak.est.utils.filtering.RealtyPredicates;

import java.util.Collections;
import java.util.List;

import static com.dyvak.est.utils.RealtyUtils.printAll;
import static com.dyvak.est.utils.comparison.OrderedComparator.Order.ASC;
import static com.dyvak.est.utils.comparison.OrderedComparator.Order.DESC;
import static com.dyvak.est.utils.comparison.RealtyComparator.*;

/**
 * Created by Dyvak on 13.08.2016.
 */

public class Main {

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