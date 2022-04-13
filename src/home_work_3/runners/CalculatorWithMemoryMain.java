package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithMemory;
import home_work_3.calcs.simple.CalculatorWithBigDecimal;

public class CalculatorWithMemoryMain {
    public static void main(String[] args) {
        CalculatorWithMemory calculator = new CalculatorWithMemory(new CalculatorWithBigDecimal());

        System.out.println("Calculation using CalculatorWithMemory (CalculatorWithBigDecimal)");

        calculator.division(28, 5);
        calculator.memorize();
        calculator.pow(calculator.getMemory(), 2);
        calculator.memorize();
        calculator.addition(calculator.multiplication(15, 7), calculator.getMemory());
        calculator.memorize();
        calculator.addition(4.1, calculator.getMemory());
        calculator.memorize();

        System.out.println("4.1 + 15 * 7 + (28 / 5) ^ 2 = " + calculator.getMemory());

        /* Вариант кода без использования памяти. Используется только поочередный вызов методов.
        System.out.println("4.1 + 15 * 7 + (28 / 5) ^ 2 = " + calculator.addition(calculator.addition(calculator.pow(calculator.division(28,5), 2), calculator.multiplication(15, 7)), 4.1));
        */
    }
}
