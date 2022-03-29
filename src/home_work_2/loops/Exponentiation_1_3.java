package home_work_2.loops;

import java.sql.SQLOutput;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Exponentiation_1_3 {
    public static void main(String[] args) {
        Scanner terminalIn = new Scanner (System.in);
        double base;
        int power;
        double result;

        // Проверка правильности ввода возводимого в степень числа и запись в переменную base
        System.out.println("Введите возводимое в степень число (число с плавающей точкой)");
        if (!terminalIn.hasNextDouble()){
            System.out.println("Введено неверное число. Программа остановлена.");
            return;
        }
        base = terminalIn.nextDouble();

        // Проверка правильности ввода степени и запись в переменную power
        System.out.println("Введите степень (целая положительная)");
        if (!terminalIn.hasNextInt()){
            System.out.println("Введено неверное число. Программма остановлена.");
             return;
        }
        power = terminalIn.nextInt();
        if (power < 0){
            System.out.println("Степень должна быть положительной. Программа остановлена.");
            return;
        }

        //Вызов метода для возведения в степень
        result = getExponentiation(base, power);
        // Вывод ответа в форматированном виде
        System.out.printf("%s ^ %s = %s",new DecimalFormat(",##0.0").format(base),new DecimalFormat(",###").format(power),new DecimalFormat(",##0.0#").format(result));
    }

    /**
     * Метод возводит переданное число с плавающей запятой в переданную целую положительную степень.
     * @param base Возводимое в степень
     * @param power Степень
     * @return double
     *
     * Example:
     * Input: (base: 7.5, power: 2)
     * Output: 56.25
     */
    static double getExponentiation(double base, int power){
        double result = 1;
        if (power == 0){// Если возводим в степень 0, возвращаем 1.
            return 1;
        }
        for (int i = 0; i < power; i++) {
            result *= base;
        }
        return result;
    }
}
