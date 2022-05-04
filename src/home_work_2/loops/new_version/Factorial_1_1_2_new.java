package home_work_2.loops.new_version;

import static home_work_2.loops.new_version.Factorial_1_1_1_new.multiplyExact;

public class Factorial_1_1_2_new {
    private static boolean needMultSign = false;
    private static final StringBuilder sb = new StringBuilder();
    private static int count = 1;


    /**
     * Метод возаращает строку с отображением процесса расчета и результатом расчета факториала.
     * @param nFactorial значение факториала
     * @return строка формата 1 * 2 * ... * n = n!
     */
    public static String getFactorialRes(int nFactorial) {
        sb.delete(0, sb.length());
        count = 1;
        needMultSign = false;
        if (nFactorial <= 0) { // Проверка выхода за пределы диапазона допустимых значений
            return "Введен неверный аргумент n = " + nFactorial + ". Необходимо ввести целое положительное число.";
        } else if(nFactorial == 1) {
            return "1 = 1";
        } else if(nFactorial >= 21) {
            return "Для типа long можно рассчитать максимум 20 факториал.";
        } else {
            long currentValue = getMult(nFactorial);
            sb.append(" = ").append(currentValue);

            return sb.toString();
        }
    }

    public static long getMult(int n) {
        if(needMultSign) {
            sb.append(" * ");
        } else {
            needMultSign = true;
        }
        sb.append(count);
        count++;
        return n == 1 ? 1 : multiplyExact(getMult(n-1), n);
    }
}
