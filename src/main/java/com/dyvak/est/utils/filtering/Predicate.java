package com.dyvak.est.utils.filtering;

/**
 * Created by Dyvak on 13.08.2016.
 */
public interface Predicate<T> {
    boolean apply(T value);
}
