package home_work_3.runners;

import home_work_3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithOperatorMain {
    public static void main(String[] args) {
        CalculatorWithOperator calc = new CalculatorWithOperator();
        double result;
        result = calc.division(28d, 5d);
        result = calc.pow(result, 2);
        result = calc.addition(calc.multiplication(15d, 7d), result);
        result = calc.addition(result, 4.1);
        System.out.println("Calculation using CalculatorWithOperator:");
        System.out.println("4.1 + 15 * 7 + (28 / 5) ^ 2 = " + result);

        //System.out.println(calc.sqrt(2)); // Testing of the square root taking method (expected 1,414213562373095)
    }
}
