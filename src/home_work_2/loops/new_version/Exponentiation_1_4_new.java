package home_work_2.loops.new_version;

import java.text.DecimalFormat;

public class Exponentiation_1_4_new {
    /**
     * Метод умножает 1 на множитель до переполнения и возвращает строку со значением до переполнения и после,
     * а также количеством итераций.
     * @param b множитель
     * @return Значение до переполнения: x, значение после переполнения: y, количество итераций: z
     */
    public static String getExponentiation(long b){
        if(-1 <= b && b <= 1) {
            return "Бесконечный цикл. невозможно рассчитать.";
        }

        long a = 1;
        long[] result = {0,a};
        int count = 0;
        // Максимальное целое число, которое можно умножить на множитель до переполнения
        long previousMaxValue = Long.MAX_VALUE / Math.abs(b);
        while(Math.abs(result[0]) <= previousMaxValue) { // Проверка достижения предела по модулю
            result[0] = result [1];
            result[1] *= b;
            count++;
        }
        String beforeOverflow = new DecimalFormat(",###").format(result[0]);
        beforeOverflow = beforeOverflow.replaceAll(",", " ");
        String afterOverflow = new DecimalFormat(",###").format(result[1]);
        afterOverflow = afterOverflow.replaceAll(",", " ");
        String counter = new DecimalFormat(",###").format(count);
        counter = counter.replaceAll(",", " ");
        return "Значение до переполнения: " + beforeOverflow +
                "\nЗначение после переполнения: " + afterOverflow +
                "\nКоличество итераций: " + counter;
    }
}
