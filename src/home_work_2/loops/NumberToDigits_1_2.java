package home_work_2.loops;

import java.text.DecimalFormat;

public class NumberToDigits_1_2 {
    public static void main(String[] args) {
         String numberStr = args[0];
         String result;


         if (numberStr.matches("\\d*+$")){
             result = getDigitsMultiply(numberStr);
             System.out.println(numberStr + " -> " + result);
         } else if (numberStr.matches("\\d*[.,]\\d+$")){
             System.out.println("Введено дробное число");
         } else {
             System.out.println("Введено не числовое значение");
         }
    }

    /**
     * Метод вополняет поочередное умножение всех чисел, входящих в состав числа.
     * @param numberStr строка с вводными данными должна содержать целое число.
     * @return строка с отображением процесса расчета и итоговым результатом.
     *
     * Ввод:
     * "12345"
     * Возвращает:
     * "1 * 2 * 3 * 4 * 5 = 120"
     */
    static String getDigitsMultiply(String numberStr) {
        long numberLong = Long.parseLong(numberStr); // Перевод строки в число типа long
        long[] digits = new long[numberStr.length()]; // Создание массива под размер вводных данных
        String result = ""; // Создание и инициализация переменной, в которой будет хранится возвращаемая строка
        long multResult = 1; // Переменная для выполнения математической операции умножения

        if (numberLong < 0){ // Проверка на ввод отрицательного числа
            return result = "Введено отрицательное число";
        }

        for (int i = numberStr.length() - 1; i >= 0; i--){ // Разделение числа на цифры и заполнение массива
            digits[i] = numberLong % 10;
            numberLong /= 10;
        }
        for (int i = 0; i < digits.length; i++){ // Выполнение расчета и заполнение выводной строки в каждой итерации
            multResult *= digits[i];
            /**
             * Не существует числа типа long, при котором может сработать проверка
             * if (multResult < 0){
             *    return result = "Произошло переполнение на символе по очереди " + i;
             * } else
             */
            if (i == digits.length-1){
                result += digits[i] + " = " + (new DecimalFormat(",###").format(multResult));
            } else {
                    result += digits[i] + " * ";
            }
        }
        return result;
    }
}
