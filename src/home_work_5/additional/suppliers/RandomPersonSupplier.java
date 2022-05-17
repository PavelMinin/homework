package home_work_5.additional.suppliers;

import home_work_5.Person;
import home_work_5.additional.StringRandomGenerator;

import java.util.function.Supplier;

public class RandomPersonSupplier implements Supplier<Person> {
    @Override
    public Person get() {
        return new Person(
                StringRandomGenerator.getRandomString(5,21),
                StringRandomGenerator.getRandomString(5, 10)
        );
    }
}
