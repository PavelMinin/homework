package home_work_5.additional.comparators;

import home_work_5.Animal;
import java.util.Comparator;

public class AnimalAgeAndNickComparator implements Comparator<Animal> {
    @Override
    public int compare(Animal o1, Animal o2) {
        if(o1 == null && o2 == null) {
            return 0;
        } else if(o1 == null) {
            return -1;
        } else if(o2 == null) {
            return 1;
        }

        int ageCompare = Integer.compare(o1.getAge(), o2.getAge());
        if(ageCompare != 0) {
            return ageCompare;
        }

        return o1.getNick().compareTo(o2.getNick());
    }
}