package home_work_2.arrays;

import home_work_2.utils.ArraysUtils;

public class ArraysIteration {
    public static void main(String[] args) {
        int[] container = ArraysUtils.arrayFromConsole(); // Ввод данных
        System.out.println("\n");
        showArrayElements(container); // Вывод всех элементов массива
        System.out.println("\n");
        showEachSecondArrayElement(container); // Вывод каждого второго элемента массива
        System.out.println("\n");
        showInvertedArrayElements(container); // Вывод элементов массива в обратном порядке
    }

    public static void showArrayElements(int[] array) {
        System.out.println("Вывод каждого элемента массива в строку.");

        System.out.println("\ndo ... while");
        int i = 0;
        String arrayStr = "";
        do {
            arrayStr += array[i] + "\t";
            i++;
        } while (i < array.length);
        System.out.println(arrayStr);

        System.out.println("\nwhile");
        i=0;
        arrayStr = "";
        while (i < array.length) {
            arrayStr += array[i] + "\t";
            i++;
        }
        System.out.println(arrayStr);

        System.out.println("\nfor");
        arrayStr = "";
        for(i = 0; i < array.length; i++) {
            arrayStr += array[i] + "\t";
        }
        System.out.println(arrayStr);

        System.out.println("\nforeach");
        arrayStr = "";
        for(int j : array) {
            arrayStr += j + "\t";
        }
        System.out.println(arrayStr);
    }

    public static void showEachSecondArrayElement(int[] array) {
        System.out.println("Вывод каждого второго элемента массива в строку.");

        System.out.println("\ndo ... while");
        int i = 0;
        String arrayStr = "";
        do {
            if ((i+1) % 2 == 0){
                arrayStr += array[i] + "\t";
            }
            i++;
        } while (i < array.length);
        System.out.println(arrayStr);

        System.out.println("\nwhile");
        i=0;
        arrayStr = "";
        while (i < array.length) {
            if ((i+1) % 2 == 0){
                arrayStr += array[i] + "\t";
            }
            i++;
        }
        System.out.println(arrayStr);

        System.out.println("\nfor");
        arrayStr = "";
        for(i = 0; i < array.length; i++) {
            if ((i+1) % 2 == 0){
                arrayStr += array[i] + "\t";
            }
        }
        System.out.println(arrayStr);

        System.out.println("\nforeach");
        arrayStr = "";
        i = 0;
        for(int j : array) {
            if ((i+1) % 2 == 0) {
                arrayStr += j + "\t";
            }
            i++;
        }
        System.out.println(arrayStr);
    }

    public static void showInvertedArrayElements(int[] array) {
        System.out.println("Вывод элементов массива в строку в обратном порядке.");

        System.out.println("\ndo ... while");
        int i = array.length - 1;
        String arrayStr = "";
        do {
            arrayStr += array[i] + "\t";
            i--;
        } while (i >= 0);
        System.out.println(arrayStr);

        System.out.println("\nwhile");
        i = array.length - 1;
        arrayStr = "";
        while (i >= 0) {
            arrayStr += array[i] + "\t";
            i--;
        }
        System.out.println(arrayStr);

        System.out.println("\nfor");
        arrayStr = "";
        for(i = array.length - 1; i >= 0; i--) {
            arrayStr += array[i] + "\t";
        }
        System.out.println(arrayStr);

        System.out.println("\nforeach");
        StringBuffer sb = new StringBuffer(); // Создаем объект типа StringBufer
        for(int j : array) {
            sb.insert(0, j + "\t"); // Добавляем в положение 0 (начало строки) текущее значение элемента массива
        }
        System.out.println(sb);
    }
}
