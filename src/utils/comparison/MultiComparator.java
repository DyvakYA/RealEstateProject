package utils.comparison;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * Created by Dyvak on 13.08.2016.
 */

public class MultiComparator<T> implements Comparator<T> {

    private List<Comparator<T>> comparators;

    public MultiComparator(List<Comparator<T>> comparators) {
        this.comparators = comparators;
    }

    public MultiComparator(Comparator<T>... comparators) {
        this.comparators = Arrays.asList(comparators);
    }

    @Override
    public int compare(T a, T b) {
        for (Comparator<T> comparator : comparators) {
            int cmp = comparator.compare(a, b);

            if (cmp != 0) {
                return cmp;
            }
        }

        return 0;
    }
}

