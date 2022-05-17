package home_work_6.additional.comparators;

import java.util.Comparator;
import java.util.Map;

public class MapEntryValueComparator implements Comparator<Map.Entry<String, Integer>> {
    @Override
    public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
        return Integer.compare(o1.getValue(), o2.getValue());
    }
}
