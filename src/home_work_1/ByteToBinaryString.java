package home_work_1;

import java.util.Scanner;

public class ByteToBinaryString {
    public static void main(String[] args) {
        Scanner terminalIn = new Scanner(System.in);
        byte byteNum;
        String binNum;

        System.out.println("Введите число от -128 до 127");
        byteNum = terminalIn.nextByte();

        binNum = toBinaryString(byteNum);

        System.out.println("Двоичное представление числа: " + binNum);
    }

    public static String toBinaryString(int number){
        String binNum = ""; // Инициализация переменной строкового типа, куда будет записан ответ
        int[] dig = {0,0,0,0,0,0,0,0}; // Массив целочисленных элементов, который используется для промежуточного расчета
        if (number > 0){
            for (int i = dig.length - 1; i >= 0; i--){
                dig[i] = number % 2; // Записываем в массив в обратном порядке остаток от деления числа на
                number /= 2; //делим целое число на 2. Остаток от деления уже записан в массив.
            }
        } else if (number == 0){
            return "00000000"; // Если число равно 0, то возвращаем 8 нулей
        } else if (number == -128){
            return "11111111"; // Если числа -128, возвращаем 8 единиц
            // Мой метод расчета для числа -128 выдаст неверный результат
        } else {
            /**
             * Если введенное число отрицательное, то необходимо записать в старший разряд 1, а двоичный код
             * будет вычисляться от "инвертированного" числа.
             * -55 (128 - 55 = 73) -> BIN 1000 0000 (sign) + BIN 0100 1001 (73) -> BIN 1100 1001
             */
            number = 128 - Math.abs(number);
            for (int i = dig.length - 1; i >= 0; i--){
                dig[i] = number % 2;
                number /= 2;
            }
            dig[0] = 1;
        }
        for (int i = 0; i < dig.length; i++){
            binNum += dig[i];
        }
        return binNum;
    }
}
