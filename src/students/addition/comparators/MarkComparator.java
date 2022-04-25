package students.addition.comparators;

import students.Student;

import java.util.Comparator;

public class MarkComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return Double.compare(o2.getMark(), o1.getMark());
    }
}
