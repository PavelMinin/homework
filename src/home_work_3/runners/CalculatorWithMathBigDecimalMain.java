package home_work_3.runners;

import home_work_3.calcs.simple.CalculatorWithBigDecimal;

public class CalculatorWithMathBigDecimalMain {
    public static void main(String[] args) {
        CalculatorWithBigDecimal calc = new CalculatorWithBigDecimal();
        double result;
        result = calc.divide(28d, 5d);
        result = calc.pow(result, 2);
        result = calc.add(calc.multiply(15d, 7d), result);
        result = calc.add(result, 4.1);
        System.out.println("Calculation using CalculatorWithBigDecimalExtends:");
        System.out.println("4.1 + 15 * 7 + (28 / 5) ^ 2 = " + result);
    }
}
