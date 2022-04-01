package home_work_2.sorts;

import home_work_2.arrays.Arrays_2_4;
import home_work_2.utils.ArraysUtils;
import home_work_2.utils.SortsUtils;

public class SortsMain {

    /**
     * Выполняет поочередное выполнение тестов сортировок пузырьковым методом и шейкерным методом.
     * Инициализация массива выполняется перед каждым новым выполнением сортировки.
     * @param args
     */
    public static void main(String[] args) {
        int[] testArr1 = new int[]{1,2,3,4,5,6};
        System.out.println("Тестовый массив 1:");
        Arrays_2_4.showArray(testArr1);
        System.out.println("Сортировка пузырьком:");
        SortsUtils.bubble(testArr1);
        Arrays_2_4.showArray(testArr1);

        testArr1 = new int[]{1,2,3,4,5,6};
        System.out.println("Тестовый массив 1:");
        Arrays_2_4.showArray(testArr1);
        System.out.println("Шейкерная сортировка:");
        SortsUtils.shake(testArr1);
        Arrays_2_4.showArray(testArr1);

        int[] testArr2 = new int[]{1,1,1,1};
        System.out.println("\nТестовый массив 2:");
        Arrays_2_4.showArray(testArr2);
        System.out.println("Сортировка пузырьком:");
        SortsUtils.bubble(testArr2);
        Arrays_2_4.showArray(testArr2);

        testArr2 = new int[]{1,1,1,1};
        System.out.println("Тестовый массив 2:");
        Arrays_2_4.showArray(testArr2);
        System.out.println("Шейкерная сортировка:");
        SortsUtils.shake(testArr2);
        Arrays_2_4.showArray(testArr2);

        int[] testArr3 = new int[]{9,1,5,99,9,9};
        System.out.println("\nТестовый массив 3:");
        Arrays_2_4.showArray(testArr3);
        System.out.println("Сортировка пузырьком:");
        SortsUtils.bubble(testArr3);
        Arrays_2_4.showArray(testArr3);

        testArr3 = new int[]{9,1,5,99,9,9};
        System.out.println("Тестовый массив 3:");
        Arrays_2_4.showArray(testArr3);
        System.out.println("Шейкерная сортировка:");
        SortsUtils.shake(testArr3);
        Arrays_2_4.showArray(testArr3);

        int[] testArr4 = new int[]{};
        System.out.println("\nТестовый массив 4:");
        Arrays_2_4.showArray(testArr4);
        System.out.println("Сортировка пузырьком:");
        SortsUtils.bubble(testArr4);
        Arrays_2_4.showArray(testArr4);

        testArr4 = new int[]{};
        System.out.println("Тестовый массив 4:");
        Arrays_2_4.showArray(testArr4);
        System.out.println("Шейкерная сортировка:");
        SortsUtils.shake(testArr4);
        Arrays_2_4.showArray(testArr4);

        int[] testArr5 = new int[]{6,5,4,3,2,1};
        System.out.println("\nТестовый массив 5:");
        Arrays_2_4.showArray(testArr5);
        System.out.println("Сортировка пузырьком:");
        SortsUtils.bubble(testArr5);
        Arrays_2_4.showArray(testArr5);

        testArr5 = new int[]{6,5,4,3,2,1};
        System.out.println("Тестовый массив 5:");
        Arrays_2_4.showArray(testArr5);
        System.out.println("Шейкерная сортировка:");
        SortsUtils.shake(testArr5);
        Arrays_2_4.showArray(testArr5);

        System.out.println("\nТестовый массив ArraysUtils.arrayRandom(50,100):");
        int[] testRandomArr = ArraysUtils.arrayRandom(50,100);
        Arrays_2_4.showArray(testRandomArr);
        System.out.println("Сортировка пузырьком:");
        SortsUtils.bubble(testRandomArr);
        Arrays_2_4.showArray(testRandomArr);

        System.out.println("Тестовый массив ArraysUtils.arrayRandom(50,100):");
        testRandomArr = ArraysUtils.arrayRandom(50,100);
        Arrays_2_4.showArray(testRandomArr);
        System.out.println("Шейкерная сортировка:");
        SortsUtils.shake(testRandomArr);
        Arrays_2_4.showArray(testRandomArr);

        System.out.println("Тестовый массив ArraysUtils.arrayFromConsole():");
        int[] testFromeConsole = ArraysUtils.arrayFromConsole();
        Arrays_2_4.showArray(testFromeConsole);
        System.out.println("Сортировка пузырьком:");
        SortsUtils.bubble(testFromeConsole);
        Arrays_2_4.showArray(testFromeConsole);

        System.out.println("Тестовый массив ArraysUtils.arrayFromConsole():");
        testFromeConsole = ArraysUtils.arrayFromConsole();
        Arrays_2_4.showArray(testFromeConsole);
        System.out.println("Шейкерная сортировка:");
        SortsUtils.shake(testFromeConsole);
        Arrays_2_4.showArray(testFromeConsole);
    }
}
