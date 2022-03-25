package home_work_1;

import java.util.Scanner;

public class CreatePhoneNumber { // Задача 6*. Выделение цифр из числа и предоставление строки в форматированном виде
    public static void main(String[] args) {
        Scanner terminalIn = new Scanner(System.in);
        /**
         * при использовании типа int и использовании приведения long -> int при разделении номера на цифры теряется
         * точность при вычислении последней цифры (пример 999_999_9999 -> (999) 999-9997)
         * вопреки исходных данных был применен тип long
         */
        long[] digits = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        long numberLong;
        String numberString;

        System.out.println("Введите ваш номер телефона (10 цифр без пробела)");
        numberLong = terminalIn.nextLong();
        if (numberLong <= 0 || numberLong > 9999999999L){
            System.out.println("Введено некорректное значение");
            return;
        }
        for (int i = 9; i >= 0; i--){
            digits[i] = numberLong % 10;
            numberLong /= 10;
        }

        numberString = createPhoneNumber(digits);
        System.out.println("Номер в отформатированном виде:\n\n" + numberString);
    }

    public static String createPhoneNumber (long[] digits){
        String phoneNumber = null;

        for (int i = 0; i < digits.length; i++){
            switch(i){
                case 0:
                    phoneNumber = "(";
                    break;
                case 3:
                    phoneNumber += ") ";
                    break;
                case 6:
                    phoneNumber += "-";
                    break;
                default:
                    break;
            }
            phoneNumber += digits[i];
        }
        return phoneNumber;
    }
}
