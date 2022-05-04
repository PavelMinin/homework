package home_work_2.loops.new_version;

import java.text.DecimalFormat;

public class NumberToDigits_1_2_new {

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
    public static String getDigitsMultiply(String numberStr) {
        if (numberStr.matches("\\d*[.,]\\d+$")) {
            return "Введено дробное число";
        } else if(!numberStr.matches("\\d*+$")) {
            return "Введено не числовое значение";
        } else {
            long numberLong = Long.parseLong(numberStr); // Перевод строки в число типа long
            long[] digits = new long[numberStr.length()]; // Создание массива под размер вводных данных
            String result = ""; // Создание и инициализация переменной, в которой будет хранится возвращаемая строка
            long multResult = 1; // Переменная для выполнения математической операции умножения

            if (numberLong < 0) { // Проверка на ввод отрицательного числа
                return result = "Введено отрицательное число";
            }

            for (int i = numberStr.length() - 1; i >= 0; i--) { // Разделение числа на цифры и заполнение массива
                digits[i] = numberLong % 10;
                numberLong /= 10;
            }
            for (int i = 0; i < digits.length; i++) { // Выполнение расчета и заполнение выводной строки в каждой итерации
                multResult *= digits[i];
                if (i == digits.length - 1) {
                    result += digits[i] + " = " + (new DecimalFormat(",###").format(multResult));
                } else {
                    result += digits[i] + " * ";
                }
            }

            result = result.replaceAll(",", " ");
            return result;
        }
    }
}
