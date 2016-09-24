package com.dyvak.est.utils.filtering;

import java.util.ArrayList;
import java.util.List;

/**
 * @author bvanchuhov
 */
public final class Filter {

    private Filter() {}

    public static <T> List<T> filter(List<T> values, Predicate<T> predicate) {
        List<T> result = new ArrayList<T>();

        for (T value : values) {
            if (predicate.apply(value)) {
                result.add(value);
            }
        }

        return result;
    }
}