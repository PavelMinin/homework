package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterAutoSuper;

public class CalculatorWithCounterAutoSuperMain {
    public static void main(String[] args) {
        CalculatorWithCounterAutoSuper calc = new CalculatorWithCounterAutoSuper();
        double result;
        result = calc.division(28d, 5d);
        result = calc.pow(result, 2);
        result = calc.addition(calc.multiplication(15d, 7d), result);
        result = calc.addition(result, 4.1);
        System.out.println("Calculation using CalculatorWithCounterAutoSuper:");
        System.out.println("4.1 + 15 * 7 + (28 / 5) ^ 2 = " + result);
        System.out.println("Current value of the counter of the calculator using: " + calc.getCountOperation());
    }
}
