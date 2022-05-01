package home_work_1.part2.additional;

import home_work_1.part2.api.ICommunicationPrinter;

public class ConditionalStatements12 implements ICommunicationPrinter {
    private String name;

    /**
     * Приветствие в зависимости от переданного имени.
     * Имя сверяется со списком, объявленным и инициализированным здесь.
     * @param name имя
     * @return приветствие.
     */
    @Override
    public String welcome(String name) {
        if(name != null) {
            if (name.equals(ICommunicationPrinter.names[0])){
                return "Привет! \nЯ тебя так долго ждал";
            }

            if (name.equals(ICommunicationPrinter.names[1])){
                return "Я тебя так долго ждал";
            }

            return "Добрый день. А вы кто?";
        }

        return null;
    }
}
