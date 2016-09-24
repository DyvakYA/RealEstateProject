package com.dyvak.est.utils.filtering;

import com.dyvak.est.estate.Realty;

import java.util.Objects;

/**
 * Created by Dyvak on 13.08.2016.
 */
public class StreetPredicate implements Predicate<Realty> {

    private String street;

    public StreetPredicate(String street) {
        this.street = street;
    }

    @Override
    public boolean apply(Realty p) {
        return Objects.equals(p.getStreet(), street);
    }
}
