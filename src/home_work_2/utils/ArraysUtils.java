package home_work_2.utils;

import java.util.Random;
import java.util.Scanner;

public class ArraysUtils {

    /**
     * Создает массив через ввод данных в консоль.
     * Встроена проверка ввода. Пока не будет введено корректное значение,
     * ввод будет зациклен.
     *
     * @return массив типа int размера n (ввод с клавиатуры). Значения элементов вводятся с клавиатуры.
     */
    public static int[] arrayFromConsole() {
        int n;

        Scanner terminalIn = new Scanner(System.in);
        System.out.println("Введите размер массива (больше 0):");
        while (true) { // Проверка на то, что введено значение типа int
            if (!terminalIn.hasNextInt()) {
                System.out.println("Введено неверное значение.");
                terminalIn.next();
            }
            else break;
        }
        n = terminalIn.nextInt();

        if (n == 0) { // Если ввели 0, то принимаем размер массива равный 1
            System.out.println("Введено значение 0. Размер массива принят равным 1.");
            n = 1;
        } else if (n < 0) { // Если введено отрицательное значение, делаем его положительным
            n = n * -1;
            System.out.println("Введено отрицательное значение. Размер массива принят равным " + n + ".");
        }

        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Введите значение");
            while (!terminalIn.hasNextInt()) { // Проверка на то, что введено значение типа int
                System.out.println("Введено неверное значение.");
                terminalIn.next();
            }
            result[i] = terminalIn.nextInt();
        }
        return result;
    }

    /**
     * Создает массив заданного размера и заполняет его произвольными значениями
     * типа int в диапазоне от 0 до заданного значения.
     *
     * @param size размер массива
     * @param maxValueExclusion максимальное значение
     * @return массив типа int размером size с произвольными значениями от 0 до maxValueExclusion
     */
    public static int[] arrayRandom(int size, int maxValueExclusion) {
        int[] result = new int[size];
        Random randomValue = new Random();
        for(int i = 0; i < result.length; i++) {
            result[i] = randomValue.nextInt(maxValueExclusion);
        }
        return result;
    }
}
