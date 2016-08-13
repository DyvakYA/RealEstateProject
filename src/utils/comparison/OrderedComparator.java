package utils.comparison;

import java.util.Comparator;

/**
 * Created by Dyvak on 13.08.2016.
 */
public class OrderedComparator<T> implements Comparator<T> {

    private Comparator<T> comparator;
    private Order order;

    public OrderedComparator(Comparator<T> comparator) {
        this(comparator, Order.ASC);
    }

    public OrderedComparator(Comparator<T> comparator, Order order) {
        this.comparator = comparator;
        this.order = order;
    }

    @Override
    public int compare(T a, T b) {
        if (order == Order.ASC) {
            return comparator.compare(a, b);
        }
        return comparator.compare(b, a);
    }

    public enum Order {
        ASC,
        DESC;
    }
}
