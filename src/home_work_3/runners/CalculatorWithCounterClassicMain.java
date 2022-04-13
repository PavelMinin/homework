package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterClassic;

public class CalculatorWithCounterClassicMain {
    public static void main(String[] args) {
        CalculatorWithCounterClassic calc = new CalculatorWithCounterClassic();
        double result;
        double temp;

        result = calc.division(28d, 5d);
        calc.incrementCountOperation();
        result = calc.pow(result, 2);
        calc.incrementCountOperation();
        temp = calc.multiplication(15d, 7d);
        calc.incrementCountOperation();
        result = calc.addition(temp, result);
        calc.incrementCountOperation();
        result = calc.addition(result, 4.1);
        calc.incrementCountOperation();
        System.out.println("Calculation using CalculatorWithCounterClassic:");
        System.out.println("4.1 + 15 * 7 + (28 / 5) ^ 2 = " + result);
        System.out.println("Current value of the counter of the calculator using: " + calc.getCountOperation());
    }
}
