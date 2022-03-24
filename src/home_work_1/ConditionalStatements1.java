package home_work_1;

import java.util.Scanner;

public class ConditionalStatements1 {
    public static void main(String[] args) {
        Scanner terminalIn = new Scanner(System.in); // Создание объекта типа Scanner

        // Объявление и инициализация переменных, хранящих имя для сравнения
        // Позволяет быстрее вносить корректировки и избегать ошибки
        String nameEmp1 = "Вася";
        String nameEmp2 = "Анастасия";

        System.out.println("Введите ваше имя");

        String nameIn = terminalIn.next(); // В переменную записывается строка до первого пробела, вызывается метод объекта

        // Сравнение введенного имени с первым шаблоном имени
        if (nameEmp1.equals(nameIn)){
            System.out.println("Привет! \nЯ тебя так долго ждал");
        }

        // Сравнение введенного имени со вторым шаблоном имени
        if (nameEmp2.equals(nameIn)){
            System.out.println("Я тебя так долго ждал");
        }

        // Проверка, что нет совпадений в условиях выше
        if (!nameEmp1.equals(nameIn) && !nameEmp2.equals(nameIn)){
            System.out.println("Добрый день. А вы кто?");
        }
    }
}
