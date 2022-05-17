package home_work_5;

public class Person implements Comparable<Person> {
    private final String nick;
    private String password;

    public Person(String nick, String password) {
        this.nick = nick;
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public String getNick() {
        return nick;
    }

    @Override
    public int compareTo(Person person) {
        return this.nick.compareTo(person.getNick());
    }
}
