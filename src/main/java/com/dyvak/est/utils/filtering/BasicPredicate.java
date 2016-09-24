package com.dyvak.est.utils.filtering;

/**
 * Created by Dyvak on 13.08.2016.
 */
public class BasicPredicate<T> implements Predicate<T> {

    private T value;

    public BasicPredicate(T value) {
        this.value = value;
    }

    @Override
    public boolean apply(T value) {
        return value.equals(this.value);
    }
}