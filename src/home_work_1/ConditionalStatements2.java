package home_work_1;

import java.util.Scanner;

public class ConditionalStatements2 {
    public static void main(String[] args) {
        Scanner terminalIn = new Scanner(System.in); // Создание объекта типа Scanner

        // Объявление и инициализация переменных, хранящих имя для сравнения
        // Позволяет быстрее вносить корректировки и избегать ошибки
        String nameEmp1 = "Вася";
        String nameEmp2 = "Анастасия";

        System.out.println("Введите ваше имя");

        String nameIn = terminalIn.next(); // В переменную записывается строка до первого пробела, вызывается метод объекта

        if (nameEmp1.equals(nameIn)){  // Сравнение и первым шаблонным именем
            System.out.println("Привет! \nЯ тебя так долго ждал");
        } else if (nameEmp2.equals(nameIn)){ // Если не совпало, сравнение со вторым шаблонным именем
            System.out.println("Я тебя так долго ждал");
        } else { //выполняется в случае отсутствия совпадений по if и по всем конструкциям else if
            System.out.println("Добрый день. А вы кто?");
        }
    }
}
