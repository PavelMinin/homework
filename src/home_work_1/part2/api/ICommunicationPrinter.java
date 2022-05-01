package home_work_1.part2.api;

public interface ICommunicationPrinter {

    String[] names = {"Вася", "Анастасия"};

    /**
     * Приветствие в зависимости от переданного имени.
     * Имя сверяется со списком, объявленным и инициализированным здесь.
     * @param name имя
     * @return приветствие.
     */
    String welcome(String name);
}
