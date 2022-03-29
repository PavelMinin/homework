package home_work_2.loops;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exponentiation_1_4 {
    public static void main(String[] args) {
        Scanner terminalIn = new Scanner (System.in);
        long a = 1;
        long b;
        long[] result = new long[2];

        // Проверка правильности ввода множителя и запись в переменную b
        System.out.println("Введите целое число");
        if (!terminalIn.hasNextLong()){
            System.out.println("Введено неверное число. Программма остановлена.");
             return;
        }
        b = terminalIn.nextLong();

        //Вызов метода для умножения до переполнения
        result = getExponentiation(a, b);
        System.out.printf("До переполнения: %d \nПосле переполнения: %d", result[0], result[1]);
    }

    /**
     * Метод умножает число на множитель до переполнения и возвращает массив из двух чисел до и после переполнения.
     * @param a умножаемое
     * @param b множитель
     * @return double
     *
     * Example:
     * Input: (a: 1, b: 10)
     * Output:
     */
    static long[] getExponentiation(long a, long b){
        long[] result = {0,a};
        if (a == 1 && b == 1){
            System.out.println("Бесконечный цикл. Выход из выполнения метода.");
            result[0] = 0;
            result[1] = 0;
            return result;

        }
        // Максимальное целое число, которое можно умножить на множитель до переполнения
        long previousMaxValue = Long.MAX_VALUE / Math.abs(b);
        do {
            result[0] = result [1];
            result[1] *= b;
        } while (Math.abs(result[0]) < previousMaxValue); // Проверка достижения предела по модулю
        return result; // Возвращаем массив из 2 элементов
    }
}
