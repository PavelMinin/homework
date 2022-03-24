package home_work_1;

import java.util.Scanner;

public class SmartAlarm {
    public static void main(String[] args) {
        Scanner terminalIn = new Scanner(System.in);

        // инициализация переменных по умолчанию: не в отпуске, будний день
        boolean weekday = true; // переменная статуса будний день / выходной
        boolean vocation = false; // переменная статуса отпуск / рабочий период
        String answerWeekday, answerVocation;

        System.out.println("Сегодня рабочий день? (да / нет)");
        answerWeekday = terminalIn.next();

        // проверка статуса дня
        if (answerWeekday.equals("да") || answerWeekday.equals("Да") || answerWeekday.equals("ДА")) { // 3 варианта ответа по шаблону
            weekday = true;
        } else if (answerWeekday.equals("нет") || answerWeekday.equals("Нет") || answerWeekday.equals("НЕТ")){
            weekday = false; // если не совпало - выходной
        } else {
            System.out.println("Ответ не распознан. По умодчанию рабочий день.");
        }

        System.out.println("Вы в отпуске? (да / нет)");
        answerVocation = terminalIn.next();

        // проверка статуса нахождения в отпуске
        if (answerVocation.equals("да") || answerVocation.equals("Да") || answerVocation.equals("ДА")) { // 3 варианта ответа по шаблону
            vocation = true;
        } else if (answerVocation.equals("нет") || answerVocation.equals("Нет") || answerVocation.equals("НЕТ")){
            vocation = false; // если не совпало - выходной
        } else {
            System.out.println("Ответ не распознан. По умодчанию вы не в отпуске.");
        }

        if (sleepIn(weekday, vocation)){
            System.out.println("Поздравляю, вы можете спать дальше!");
        } else {
            System.out.println("Эх, собирайся и топай на работу, друг.");
        }
    }

    // Проверка на возможность спать дальше. true - можно спать дальше, false - нужно вставать
    public static boolean sleepIn (boolean weekday, boolean vocation){
        if (!weekday || vocation){
            return true; // выход из метода с возвратом значения true
        }

        return false; // выход из метода с возвратом значения true
    }
}
