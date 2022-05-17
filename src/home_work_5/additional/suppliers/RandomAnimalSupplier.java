package home_work_5.additional.suppliers;

import home_work_5.Animal;
import home_work_5.additional.RandomItemFromNickArray;

import java.util.concurrent.ThreadLocalRandom;
import java.util.function.Supplier;

public class RandomAnimalSupplier implements Supplier<Animal> {
    @Override
    public Animal get() {
        ThreadLocalRandom rnd = ThreadLocalRandom.current();
        return new Animal(
                rnd.nextInt(1,16),
                RandomItemFromNickArray.getRandomNick()
        );
    }
}
