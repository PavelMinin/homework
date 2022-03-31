package home_work_2.arrays;

import home_work_2.utils.ArraysUtils;

import java.util.Scanner;

public class Arrays_2_4 {

    /**
     * По очереди вызывает все методы класса с выводом текстовых пояснений.
     * @param args не используются
     */
    public static void main(String[] args) {
        int[] range;
        int[] array = ArraysUtils.arrayRandom(50,100);

        System.out.println("Массив произвольных чисел размером 50 элементов со значениями от 0 до 99 включительно:");
        showArray(array);
        System.out.println("Задание 2.4.6. Сумма цифр элементов массива: " + getSumOfDigitsOfElements(array) + "\n");

        System.out.println("Задание 2.4.1. Сумма четных положительных элементов массива: "
                + getSumOfEvenElements(array) + "\n");

        System.out.println("Задание 2.4.2. Максимальный элемент массива с четным индексом: "
                + getMaxElementWithEvenIndex(array) + "\n");

        System.out.println("Задание 2.4.3. Элементы массива, меньшие среднего арифметического:\n");
        showArray(getLessThenAverageElements(array));

        System.out.println("\nЗадание 2.4.4. Два наименьших элемента массива (по возрастанию либо равные):\n");
        showArray(getTwoLeastElements(array));

        System.out.println("\nЗадание 2.4.5. Сжатый массив с удаленными элементами в заданном диапазоне:\n");
        System.out.println("Введите диапазон удаляемых значений 0 до 99 включительно:");
        range = getRangeFrom_0_To_100();
        showArray(removeArrayElementsInRange(array, range[0], range[1]));
    }

    /**
     * Считает сумму всех четных положительных элементов массива
     * @param array целочисленный массив
     * @return значение суммы четных положительных элементов int sum
     */
    public static int getSumOfEvenElements (int[] array) {
        int sum = 0;
        for (int i : array) {
            if ((i % 2 == 0) && (i > 0)) { // Условие про положительность в ТЗ
                sum += i;
            }
        }
        return sum;
    }

    /**
     * Находит максимальный элемент массива с четным индексом.
     * @param array целочисленный массив
     * @return значение максимального элемента с четным индексом int maxValueOfEvenIndexElement
     */
    public static int getMaxElementWithEvenIndex (int[] array) {
        int maxValueOfEvenIndexElement = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i += 2) {
            if (array[i] > maxValueOfEvenIndexElement) {
                maxValueOfEvenIndexElement = array[i];
            }
        }
        return maxValueOfEvenIndexElement;
    }

    /**
     * Считает среднего арифметического всех элементов входного массива,
     * сравнивает и считает количество элементов массива, которые меньше
     * среднего арифметического значения, создает новый массив размером
     * равным количеству элементов меньших среднего арифметического и
     * заполняет его.
     * @param array входной целочисленный массив
     * @return целочисленный массив элементов, меньших мреднего арифметического
     */
    public static int[] getLessThenAverageElements (int[] array) {
        int sum = 0;
        int average;
        int[] arrayLessThenAverageElements;
        int arrayLessThenAverageElementsLength = 0;

        for (int i : array) {
            sum += i;
        }
        average = sum / array.length;

        System.out.println("Среднее арифметическое элементов входного массива: " + average);

        for (int i : array) {
            if (i < average) arrayLessThenAverageElementsLength++;
        }

        arrayLessThenAverageElements = new int[arrayLessThenAverageElementsLength];

        int count = 0, i = 0;
        while (i < array.length) {
            if (array[i] < average) {
                arrayLessThenAverageElements[count] = array[i];
                count++;
            }
            i++;
        }
        return arrayLessThenAverageElements;
    }

    /**
     * Возвращает массив из двух наименьших элементов массива по возврастанию
     * либо равных (если повторяется значение).
     * @param array целочисленный массив
     * @return массив int[] twoLeastElements = {minElement,nextMinElement}
     */
    public static int[] getTwoLeastElements (int[] array) {
        int [] twoLeastElements = {Integer.MAX_VALUE,Integer.MAX_VALUE};
        for (int i : array) {
            if (i < twoLeastElements[0]) {
                twoLeastElements[0] = i;
            } else if (i < twoLeastElements[1]) {
                twoLeastElements[1] = i;
            }
        }
        return twoLeastElements;
    }

    /**
     * Удаляет из массива элементы заданного диапазона значений между startRange и endRange
     * со сдвигом элементов влево. Свободные ячейки заполняются 0.
     *
     * ВНИМАНИЕ! Не создает нового массива. Происходят изменения в передаваемом массиве.
     *
     * @param array целочисленный массив
     * @param startRange начало диапазона удаляемых элементов включительно
     * @param endRange конец диапазона удаляемых значений включительно
     * @return ссылка на измененный массив
     */
    public static int [] removeArrayElementsInRange(int[] array, int startRange, int endRange) {
        int count = 0;
        int newSize = array.length;
        while (count < newSize) { // Перезаписываем ячейки со значением, попавшим в диапазон со сдвишом элементов массива влево
            if (startRange <= array[count] && array[count] <= endRange) {
                newSize--;
                for (int i = count; i < newSize; i++) {
                    array[i] = array[i+1];
                    array[array.length - 1] = 0; // Заполняем последний элемент массива 0
                }
            } else {
                count++;
            }
        }
        return array;
    }

    /**
     * Считает сумму цифр всех элементов массива array.
     * @param array массив целочисленных элементов.
     * @return int sum - сумма цифр каждого элемента массива.
     */
    public static int getSumOfDigitsOfElements (int[] array) {
        int sum = 0, num;
        for (int j : array) {
            num = j;
            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }
        }
        return sum;
    }

    /**
     * Выводит в консоль значения массива array по 10 элементов в строке с форматированием.
     * Форматирование расчитано на элементы со значением от 0 до 99 включительно.
     * @param array массив целочисленных элементов.
     */
    public static void showArray (int[] array) {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 10) {
                str.append(" ").append(array[i]).append("    ");
            } else {
                str.append(array[i]).append("    ");
            }
            if ((i + 1) % 10 == 0) {
                str.append("\n");
            }
        }
        System.out.println(str);
    }

    /**
     * Проверяет корректность ввода данных при задании интервала с клавиатуры
     * в диапазоне от 0 до 99 включительно. Если начало интервала больше, чем конец интервала,
     * то значения меняются местами.
     * @return массив int[] rangeFrom_0_To_99 = {startRange, endRange}
     */
    public static int[] getRangeFrom_0_To_100() {
        int[]  rangeFrom_0_To_99 = {0,0};
        Scanner console = new Scanner(System.in);

        for (int i = 0; i < rangeFrom_0_To_99.length; i++) {
            if (i == 0) System.out.println("Введите начало диапазона от 0 до 99 включительно:");
            else System.out.println("Введите конец диапазона от 0 до 99 включительно:");
             do {
                while (true) { // Проверка на то, что введено значение типа int
                    if (!console.hasNextInt()) {
                        System.out.println("Введено неверное значение.");
                        console.next();
                    }
                    else break;
                }
                rangeFrom_0_To_99[i] = console.nextInt();
                if (rangeFrom_0_To_99[i] < 0) System.out.println("Введено значение меньше 0.");
                if (rangeFrom_0_To_99[i] > 99) System.out.println("Введено значение больше 99.");
            } while ((rangeFrom_0_To_99[i] < 0) || (rangeFrom_0_To_99[i] > 99));
        }
        if (rangeFrom_0_To_99[0] > rangeFrom_0_To_99[1]) {
            System.out.println("Нижняя граница диапазона больше верхней границы диапазона." +
                    " Значения были заменены друг другом автоматически.");
            int buf = rangeFrom_0_To_99[0];
            rangeFrom_0_To_99[0] = rangeFrom_0_To_99[1];
            rangeFrom_0_To_99[1] = buf;
        }
        return rangeFrom_0_To_99;
    }
}
