package home_work_2.loops.new_version;

public class Factorial_1_1_1_new {

    /**
     * Метод возаращает строку с отображением процесса расчета и результатом расчета факториала.
     * @param nFactorial значение факториала
     * @return строка формата 1 * 2 * ... * n = n!
     */
    public static String getFactorialRes(int nFactorial) {
        StringBuilder sb = new StringBuilder();
        long currentValue = 1;

        if (nFactorial <= 0) { // Проверка выхода за пределы диапазона допустимых значений
            return "Введен неверный аргумент n = " + nFactorial + ". Необходимо ввести целое положительное число.";
        } else if(nFactorial == 1) {
            return "1 = 1";
        } else {
            boolean needMultSign = false;
            for (int i = 1; i <= nFactorial; i++){ // Расчет значения факториала
                if(needMultSign) {
                    sb.append(" * ");
                } else {
                    needMultSign = true;
                }
                sb.append(i);
                long tmp = multiplyExact(currentValue, i);
                if(tmp == -1) {
                    return "Произошло переполнение на шаге: " + i + ".\nЗначение до переполнения: " + currentValue;
                } else {
                    currentValue = tmp;
                }
                if(i >= nFactorial) {
                    sb.append(" = ").append(currentValue);
                }
            }
        }

        return sb.toString();
    }

    /**
     * Метод производиь умножение двух чисел с контролем переполнения.
     * @param prev первый множитель.
     * @param n второй множитель.
     * @return значение умножения, либо -1, если произошло переполнение.
     */
    public static long multiplyExact(long prev, int n) {
        long result = prev * n;
        long ax = Math.abs(prev);
        long ay = Math.abs(n);
        if ((ax | ay) >>> 31 == 0L || (n == 0L || result / n == prev) && (prev != -9223372036854775808L || n != -1L)) {
            return result;
        } else {
            return -1;
        }
    }
}
