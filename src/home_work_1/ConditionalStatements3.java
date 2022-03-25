package home_work_1;

import java.util.Scanner;

public class ConditionalStatements3 { // Ветвление switch. Задача 5.3
    public static void main(String[] args) {
        Scanner terminalIn = new Scanner(System.in); // Создание объекта типа Scanner

        System.out.println("Введите ваше имя");

        String nameIn = terminalIn.next(); // В переменную записывается строка до первого пробела, вызывается метод объекта

        switch (nameIn) {
            case "Вася": // Если имя Вася, то выведется две строки (захватится следующий кейс)
                System.out.println("Привет!");
            case "Анастасия": // Если имя Анастасия, то пропускаем первую строку, выводим только вторую
                System.out.println("Я тебя так долго ждал");
                break; // Выход из switch
            default: // дефлотный указатель (нет совпадения по кейсам)
                System.out.println("Добрый день. А вы кто?");
                break; // Выход из switch для страховки
        }
    }
}
