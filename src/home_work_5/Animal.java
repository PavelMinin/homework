package home_work_5;

public class Animal implements Comparable<Animal> {
    private int age;
    private final String nick;

    public Animal(int age, String nick) {
        this.age = age;
        this.nick = nick;
    }

    public int getAge() {
        return age;
    }

    public String getNick() {
        return nick;
    }

    @Override
    public int compareTo(Animal animal) {
        return this.nick.compareTo(animal.getNick());
    }
}
