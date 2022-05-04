package home_work_2.loops.new_version;

import java.text.DecimalFormat;

public class Exponentiation_1_3_new {

    /**
     * Метод возвращает строку с отображением исходных данных и выводом результата возведения переданного числа
     * с плавающей запятой в переданную целую положительную степень.
     * @param base Возводимое в степень
     * @param power Степень
     * @return строка с результатом
     *
     * Example:
     * Input: (base: 7.5, power: 2)
     * Output: 7.5 ^ 2 = 56.25
     */
    public static String getExponentiation(double base, int power){
        DecimalFormat df = new DecimalFormat();
        double result = 1;
        String outputStr;
        if (power < 0){
            return "Степень должна быть положительной.";
        }
        if (power == 0){// Если возводим в степень 0, возвращаем 1.
            outputStr = new DecimalFormat(",##0.0").format(base) + " ^ 0 = 1";
            return outputStr.replaceAll(",", " ");
        }
        for (int i = 0; i < power; i++) {
            result *= base;
        }
        outputStr = new DecimalFormat(",##0.0").format(base) + " ^ " + power + " = "
                + new DecimalFormat(",##0.0#").format(result);

        return outputStr.replaceAll(",", " ");
    }
}
