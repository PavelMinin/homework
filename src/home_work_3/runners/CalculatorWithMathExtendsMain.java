package home_work_3.runners;

import home_work_3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithMathExtendsMain {
    public static void main(String[] args) {
        CalculatorWithMathExtends calc = new CalculatorWithMathExtends();
        double result;
        result = calc.divide(28d, 5d);
        result = calc.pow(result, 2);
        result = calc.add(calc.multiply(15d, 7d), result);
        result = calc.add(result, 4.1);
        System.out.println("Calculation using CalculatorWithMathExtends:");
        System.out.println("4.1 + 15 * 7 + (28 / 5) ^ 2 = " + result);
    }
}
