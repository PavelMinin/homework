package home_work_5.additional.comparators;

import home_work_5.Person;

import java.util.Comparator;

public class PersonPasswordLengthComparator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        if(o1 == null && o2 == null) {
            return 0;
        } else if(o1 == null) {
            return -1;
        } else if(o2 == null) {
            return 1;
        }

        return Integer.compare(o1.getPassword().length(), o2.getPassword().length());
    }
}
