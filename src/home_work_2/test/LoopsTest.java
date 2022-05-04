package home_work_2.test;

import home_work_2.loops.new_version.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class LoopsTest {

    @Test
    @DisplayName("Тест расчета факториала в цикле.")
    public void factorial_1_1_1_newTest() {
        int n1 = 5;
        int n2 = 10;
        int n3 = 0;
        int n4 = 1;
        int n5 = 20;
        int n6 = 21;
        int n7 = 50;
        int n8 = -1;
        int n9 = -50;

        String expected1 = "1 * 2 * 3 * 4 * 5 = 120";
        String expected2 = "1 * 2 * 3 * 4 * 5 * 6 * 7 * 8 * 9 * 10 = 3628800";
        String expected3 = "Введен неверный аргумент n = 0. Необходимо ввести целое положительное число.";
        String expected4 = "1 = 1";
        String expected5 = "1 * 2 * 3 * 4 * 5 * 6 * 7 * 8 * 9 * 10 * 11 * 12 * 13 * 14 * 15 * 16 * 17 * 18 * 19 * 20 " +
                "= 2432902008176640000";
        String expected6 = "Произошло переполнение на шаге: 21.\nЗначение до переполнения: 2432902008176640000";
        String expected7 = "Произошло переполнение на шаге: 21.\nЗначение до переполнения: 2432902008176640000";
        String expected8 = "Введен неверный аргумент n = -1. Необходимо ввести целое положительное число.";
        String expected9 = "Введен неверный аргумент n = -50. Необходимо ввести целое положительное число.";

        Assertions.assertEquals(expected1, Factorial_1_1_1_new.getFactorialRes(n1));
        Assertions.assertEquals(expected2, Factorial_1_1_1_new.getFactorialRes(n2));
        Assertions.assertEquals(expected3, Factorial_1_1_1_new.getFactorialRes(n3));
        Assertions.assertEquals(expected4, Factorial_1_1_1_new.getFactorialRes(n4));
        Assertions.assertEquals(expected5, Factorial_1_1_1_new.getFactorialRes(n5));
        Assertions.assertEquals(expected6, Factorial_1_1_1_new.getFactorialRes(n6));
        Assertions.assertEquals(expected7, Factorial_1_1_1_new.getFactorialRes(n7));
        Assertions.assertEquals(expected8, Factorial_1_1_1_new.getFactorialRes(n8));
        Assertions.assertEquals(expected9, Factorial_1_1_1_new.getFactorialRes(n9));
    }

    @Test
    @DisplayName("Тест расчета факториала рекурсией.")
    public void factorial_1_1_2_newTest() {
        int n1 = 5;
        int n2 = 10;
        int n3 = 0;
        int n4 = 1;
        int n5 = 20;
        int n6 = 21;
        int n7 = 50;
        int n8 = -1;
        int n9 = -50;

        String expected1 = "1 * 2 * 3 * 4 * 5 = 120";
        String expected2 = "1 * 2 * 3 * 4 * 5 * 6 * 7 * 8 * 9 * 10 = 3628800";
        String expected3 = "Введен неверный аргумент n = 0. Необходимо ввести целое положительное число.";
        String expected4 = "1 = 1";
        String expected5 = "1 * 2 * 3 * 4 * 5 * 6 * 7 * 8 * 9 * 10 * 11 * 12 * 13 * 14 * 15 * 16 * 17 * 18 * 19 * 20 " +
                "= 2432902008176640000";
        String expected6 = "Для типа long можно рассчитать максимум 20 факториал.";
        String expected7 = "Для типа long можно рассчитать максимум 20 факториал.";
        String expected8 = "Введен неверный аргумент n = -1. Необходимо ввести целое положительное число.";
        String expected9 = "Введен неверный аргумент n = -50. Необходимо ввести целое положительное число.";

        Assertions.assertEquals(expected1, Factorial_1_1_2_new.getFactorialRes(n1));
        Assertions.assertEquals(expected2, Factorial_1_1_2_new.getFactorialRes(n2));
        Assertions.assertEquals(expected3, Factorial_1_1_2_new.getFactorialRes(n3));
        Assertions.assertEquals(expected4, Factorial_1_1_2_new.getFactorialRes(n4));
        Assertions.assertEquals(expected5, Factorial_1_1_2_new.getFactorialRes(n5));
        Assertions.assertEquals(expected6, Factorial_1_1_2_new.getFactorialRes(n6));
        Assertions.assertEquals(expected7, Factorial_1_1_2_new.getFactorialRes(n7));
        Assertions.assertEquals(expected8, Factorial_1_1_2_new.getFactorialRes(n8));
        Assertions.assertEquals(expected9, Factorial_1_1_2_new.getFactorialRes(n9));
    }

    @Test
    @DisplayName("Тест метода расчета перемножения всех цифр числа.")
    public void getDigitsMultiplyTest() {
        String n1 = "181232375";
        String n2 = "9223372036854775807"; // max long value
        String n3 = "1111111111111111111";
        String n4 = "12345";
        String n5 = "8888888888888888888";
        String n6 = "8999999999999999999"; // max long value with max quantity of max digits
        String n7 = "99.2"; // double value
        String n8 = "99,2"; // comma separator
        String n9 = ".92"; // double value
        String n10 = "Привет"; // cyrillic text
        String n11 = "jsdnfojsdnf"; // text
        String n12 = "9.9,2"; // two separators

        String expected1 = "1 * 8 * 1 * 2 * 3 * 2 * 3 * 7 * 5 = 10 080";
        String expected2 = "9 * 2 * 2 * 3 * 3 * 7 * 2 * 0 * 3 * 6 * 8 * 5 * 4 * 7 * 7 * 5 * 8 * 0 * 7 = 0";
        String expected3 = "1 * 1 * 1 * 1 * 1 * 1 * 1 * 1 * 1 * 1 * 1 * 1 * 1 * 1 * 1 * 1 * 1 * 1 * 1 = 1";
        String expected4 = "1 * 2 * 3 * 4 * 5 = 120";
        String expected5 = "8 * 8 * 8 * 8 * 8 * 8 * 8 * 8 * 8 * 8 * 8 * 8 * 8 * 8 * 8 * 8 * 8 * 8 * 8" +
                " = 144 115 188 075 855 872";
        String expected6 = "8 * 9 * 9 * 9 * 9 * 9 * 9 * 9 * 9 * 9 * 9 * 9 * 9 * 9 * 9 * 9 * 9 * 9 * 9" +
                " = 1 200 757 082 375 992 968";
        String expected7 = "Введено дробное число";
        String expected8 = "Введено дробное число";
        String expected9 = "Введено дробное число";
        String expected10 = "Введено не числовое значение";
        String expected11 = "Введено не числовое значение";
        String expected12 = "Введено не числовое значение";

        Assertions.assertEquals(expected1, NumberToDigits_1_2_new.getDigitsMultiply(n1));
        Assertions.assertEquals(expected2, NumberToDigits_1_2_new.getDigitsMultiply(n2));
        Assertions.assertEquals(expected3, NumberToDigits_1_2_new.getDigitsMultiply(n3));
        Assertions.assertEquals(expected4, NumberToDigits_1_2_new.getDigitsMultiply(n4));
        Assertions.assertEquals(expected5, NumberToDigits_1_2_new.getDigitsMultiply(n5));
        Assertions.assertEquals(expected6, NumberToDigits_1_2_new.getDigitsMultiply(n6));
        Assertions.assertEquals(expected7, NumberToDigits_1_2_new.getDigitsMultiply(n7));
        Assertions.assertEquals(expected8, NumberToDigits_1_2_new.getDigitsMultiply(n8));
        Assertions.assertEquals(expected9, NumberToDigits_1_2_new.getDigitsMultiply(n9));
        Assertions.assertEquals(expected10, NumberToDigits_1_2_new.getDigitsMultiply(n10));
        Assertions.assertEquals(expected11, NumberToDigits_1_2_new.getDigitsMultiply(n11));
        Assertions.assertEquals(expected12, NumberToDigits_1_2_new.getDigitsMultiply(n12));
    }

    @Test
    @DisplayName("Тест метода возведения числа в целую положительную степень getExponentiation.")
    public void getExponentiationTest() {
        double base1 = 18.;
        int power1 = 5;

        double base2 = 7.5;
        int power2 = 2;

        double base3 = .1;
        int power3 = 1;

        double base4 = 2.;
        int power4 = 2;

        double base5 = -2.;
        int power5 = 2;

        double base6 = -2.;
        int power6 = 3;

        double base7 = -2.;
        int power7 = 0;

        double base8 = -2.;
        int power8 = -2;

        double base9 = 1_000_000_000.;
        int power9 = 0;

        String expected1 = "18.0 ^ 5 = 1 889 568.0";
        String expected2 = "7.5 ^ 2 = 56.25";
        String expected3 = "0.1 ^ 1 = 0.1";
        String expected4 = "2.0 ^ 2 = 4.0";
        String expected5 = "-2.0 ^ 2 = 4.0";
        String expected6 = "-2.0 ^ 3 = -8.0";
        String expected7 = "-2.0 ^ 0 = 1";
        String expected8 = "Степень должна быть положительной.";
        String expected9 = "1 000 000 000.0 ^ 0 = 1";

        Assertions.assertEquals(expected1, Exponentiation_1_3_new.getExponentiation(base1,power1));
        Assertions.assertEquals(expected2, Exponentiation_1_3_new.getExponentiation(base2,power2));
        Assertions.assertEquals(expected3, Exponentiation_1_3_new.getExponentiation(base3,power3));
        Assertions.assertEquals(expected4, Exponentiation_1_3_new.getExponentiation(base4,power4));
        Assertions.assertEquals(expected5, Exponentiation_1_3_new.getExponentiation(base5,power5));
        Assertions.assertEquals(expected6, Exponentiation_1_3_new.getExponentiation(base6,power6));
        Assertions.assertEquals(expected7, Exponentiation_1_3_new.getExponentiation(base7,power7));
        Assertions.assertEquals(expected8, Exponentiation_1_3_new.getExponentiation(base8,power8));
        Assertions.assertEquals(expected9, Exponentiation_1_3_new.getExponentiation(base9,power9));
    }

    @Test
    @DisplayName("Тест метода умножения 1 на число до переполнения.")
    public void getExponentiation2Test() {
        long num1 = 3;
        long num2 = 188;
        long num3 = -19;
        long num4 = 1;
        long num5 = Long.MAX_VALUE;
        long num6 = -1;
        long num7 = -3;
        long num8 = 0;

        String expected1 = "Значение до переполнения: 4 052 555 153 018 976 267\n" +
                "Значение после переполнения: -6 289 078 614 652 622 815\n" +
                "Количество итераций: 40";
        String expected2 = "Значение до переполнения: 1 560 496 482 665 168 896\n" +
                "Значение после переполнения: -1 774 566 438 301 073 408\n" +
                "Количество итераций: 9";
        String expected3 = "Значение до переполнения: 799 006 685 782 884 121\n" +
                "Значение после переполнения: 3 265 617 043 834 753 317\n" +
                "Количество итераций: 15";
        String expected4 = "Бесконечный цикл. невозможно рассчитать.";
        String expected5 = "Значение до переполнения: 9 223 372 036 854 775 807\n" +
                "Значение после переполнения: 1\n" +
                "Количество итераций: 2";
        String expected6 = "Бесконечный цикл. невозможно рассчитать.";
        String expected7 = "Значение до переполнения: -4 052 555 153 018 976 267\n" +
                "Значение после переполнения: -6 289 078 614 652 622 815\n" +
                "Количество итераций: 40";
        String expected8 = "Бесконечный цикл. невозможно рассчитать.";

        Assertions.assertEquals(expected1, Exponentiation_1_4_new.getExponentiation(num1));
        Assertions.assertEquals(expected2, Exponentiation_1_4_new.getExponentiation(num2));
        Assertions.assertEquals(expected3, Exponentiation_1_4_new.getExponentiation(num3));
        Assertions.assertEquals(expected4, Exponentiation_1_4_new.getExponentiation(num4));
        Assertions.assertEquals(expected5, Exponentiation_1_4_new.getExponentiation(num5));
        Assertions.assertEquals(expected6, Exponentiation_1_4_new.getExponentiation(num6));
        Assertions.assertEquals(expected7, Exponentiation_1_4_new.getExponentiation(num7));
        Assertions.assertEquals(expected8, Exponentiation_1_4_new.getExponentiation(num8));
    }

    @Test
    @DisplayName("Тест вывода таблицы умножения.")
    public void getMultTableTest() {
        String expected = "                           ТАБЛИЦА УМНОЖЕНИЯ" +
                "\n" +
                "\n" +
                "2 x  1 =  2\t\t3 x  1 =  3\t\t4 x  1 =  4\t\t5 x  1 =  5\t\t\n" +
                "2 x  2 =  4\t\t3 x  2 =  6\t\t4 x  2 =  8\t\t5 x  2 = 10\t\t\n" +
                "2 x  3 =  6\t\t3 x  3 =  9\t\t4 x  3 = 12\t\t5 x  3 = 15\t\t\n" +
                "2 x  4 =  8\t\t3 x  4 = 12\t\t4 x  4 = 16\t\t5 x  4 = 20\t\t\n" +
                "2 x  5 = 10\t\t3 x  5 = 15\t\t4 x  5 = 20\t\t5 x  5 = 25\t\t\n" +
                "2 x  6 = 12\t\t3 x  6 = 18\t\t4 x  6 = 24\t\t5 x  6 = 30\t\t\n" +
                "2 x  7 = 14\t\t3 x  7 = 21\t\t4 x  7 = 28\t\t5 x  7 = 35\t\t\n" +
                "2 x  8 = 16\t\t3 x  8 = 24\t\t4 x  8 = 32\t\t5 x  8 = 40\t\t\n" +
                "2 x  9 = 18\t\t3 x  9 = 27\t\t4 x  9 = 36\t\t5 x  9 = 45\t\t\n" +
                "2 x 10 = 20\t\t3 x 10 = 30\t\t4 x 10 = 40\t\t5 x 10 = 50\t\t\n" +
                "\n" +
                "\n" +
                "6 x  1 =  6\t\t7 x  1 =  7\t\t8 x  1 =  8\t\t9 x  1 =  9\t\t\n" +
                "6 x  2 = 12\t\t7 x  2 = 14\t\t8 x  2 = 16\t\t9 x  2 = 18\t\t\n" +
                "6 x  3 = 18\t\t7 x  3 = 21\t\t8 x  3 = 24\t\t9 x  3 = 27\t\t\n" +
                "6 x  4 = 24\t\t7 x  4 = 28\t\t8 x  4 = 32\t\t9 x  4 = 36\t\t\n" +
                "6 x  5 = 30\t\t7 x  5 = 35\t\t8 x  5 = 40\t\t9 x  5 = 45\t\t\n" +
                "6 x  6 = 36\t\t7 x  6 = 42\t\t8 x  6 = 48\t\t9 x  6 = 54\t\t\n" +
                "6 x  7 = 42\t\t7 x  7 = 49\t\t8 x  7 = 56\t\t9 x  7 = 63\t\t\n" +
                "6 x  8 = 48\t\t7 x  8 = 56\t\t8 x  8 = 64\t\t9 x  8 = 72\t\t\n" +
                "6 x  9 = 54\t\t7 x  9 = 63\t\t8 x  9 = 72\t\t9 x  9 = 81\t\t\n" +
                "6 x 10 = 60\t\t7 x 10 = 70\t\t8 x 10 = 80\t\t9 x 10 = 90\t\t\n" +
                "\n" +
                "ЭТО\n" +
                "НУЖНО\t\t\t\t\t\t\t\t\t\t\t\t\t*Dinosaur.img*\n" +
                "ЗНАТЬ!";
        Assertions.assertEquals(expected, MultTable_1_5_new.getMultiplyTable());
    }
}
