package home_work_5.additional.comparators;

import java.util.Comparator;

public class ComparableComparator <T extends Comparable<T>> implements Comparator<T> {
    @Override
    public int compare(T o1, T o2) {
        if(o1 == null && o2 == null) {
            return 0;
        } else if(o1 == null) {
            return -1;
        } else if(o2 == null) {
            return 1;
        }

        return o1.compareTo(o2);
    }
}