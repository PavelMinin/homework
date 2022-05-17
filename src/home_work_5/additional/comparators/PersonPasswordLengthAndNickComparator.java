package home_work_5.additional.comparators;

import home_work_5.Person;
import java.util.Comparator;

public class PersonPasswordLengthAndNickComparator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        if(o1 == null && o2 == null) {
            return 0;
        } else if(o1 == null) {
            return -1;
        } else if(o2 == null) {
            return 1;
        }

        int passwordLengthCompare = Integer.compare(o1.getPassword().length(), o2.getPassword().length());
        if(passwordLengthCompare != 0) {
            return passwordLengthCompare;
        }

        return o1.getNick().compareTo(o2.getNick());
    }
}