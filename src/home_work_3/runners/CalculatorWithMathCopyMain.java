package home_work_3.runners;

import home_work_3.calcs.simple.CalculatorWithMathCopy;
import home_work_3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithMathCopyMain {
    public static void main(String[] args) {
        CalculatorWithMathCopy calc = new CalculatorWithMathCopy();
        double result;
        result = calc.division(28d, 5d);
        result = calc.pow(result, 2);
        result = calc.addition(calc.multiplication(15d, 7d), result);
        result = calc.addition(result, 4.1);
        System.out.println("Calculate using CalculatorWithMathCopy:");
        System.out.println("4.1 + 15 * 7 + (28 / 5) ^ 2 = " + result);
    }
}
