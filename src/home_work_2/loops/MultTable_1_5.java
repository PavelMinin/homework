package home_work_2.loops;

import java.text.DecimalFormat;

public class MultTable_1_5 {
    public static void main(String[] args) {

        // Заглавие
        System.out.println("\n                           ТАБЛИЦА УМНОЖЕНИЯ\n");

        // Вывод построчно первых 4 столбцов
        for (int i = 1; i <= 10; i ++){
            for (int j = 2; j <= 5; j++){
                if (i < 10 && j * i < 10){ // Выравниваем до пробелами если множитель и значение умножения меньше 10
                    System.out.printf("%d x  %d =  %d \t\t", j, i, j * i);
                } else if (i < 10 && j * i >= 10){ // Выравниваем пробелом если только множитель меньше 10
                    System.out.printf("%d x  %d = %d \t\t", j, i, j * i);
                } else { // Не добавляем пробелов
                    System.out.printf("%d x %d = %d \t\t", j, i, j * i);
                }
            }
            System.out.println(""); // Переход на новую строку
        }

        // Дополнительная пустая строка
        System.out.println("\n");

        // Вывод построчно оставшихся 4 столбцов
        for (int i = 1; i <= 10; i ++){
            for (int j = 6; j <= 9; j++){
                if (i < 10 && j * i < 10){ // Выравниваем до пробелами если множитель и значение умножения меньше 10
                    System.out.printf("%d x  %d =  %d \t\t", j, i, j * i);
                } else if (i < 10 && j * i >= 10){ // Выравниваем пробелом если только множитель меньше 10
                    System.out.printf("%d x  %d = %d \t\t", j, i, j * i);
                } else { // Не добавляем пробелов
                    System.out.printf("%d x %d = %d \t\t", j, i, j * i);
                }
            }
            System.out.println(""); // Переход на новую строку
        }

        System.out.println("\nЭТО\nНУЖНО\t\t\t\t\t\t\t\t\t\t\t\t\t*Dinosaur.img*\nЗНАТЬ!");
    }
}
