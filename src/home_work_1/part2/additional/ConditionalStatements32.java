package home_work_1.part2.additional;

import home_work_1.part2.api.ICommunicationPrinter;

public class ConditionalStatements32 implements ICommunicationPrinter {

    /**
     * Приветствие в зависимости от переданного имени.
     * Имя сверяется со списком, объявленным и инициализированным здесь.
     * @param name имя
     * @return приветствие.
     */
    @Override
    public String welcome(String name) {
        if(name != null) {
            switch (name) {
                case "Вася":
                    return "Привет! \nЯ тебя так долго ждал";
                case "Анастасия":
                    return "Я тебя так долго ждал";
                default:
                    return "Добрый день. А вы кто?";
            }
        }

        return null;
    }
}
