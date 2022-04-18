package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterAutoAgregation;
import home_work_3.calcs.additional.CalculatorWithCounterAutoComposite;
import home_work_3.calcs.simple.CalculatorWithMathCopy;
import home_work_3.calcs.simple.CalculatorWithMathExtends;
import home_work_3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithCounterDelegateMain {
    public static void main(String[] args) {

        CalculatorWithCounterAutoComposite calcComposite = new CalculatorWithCounterAutoComposite();

        CalculatorWithCounterAutoAgregation calcAgregation1 =
                new CalculatorWithCounterAutoAgregation(new CalculatorWithOperator());
        CalculatorWithCounterAutoAgregation calcAgregation2 =
                new CalculatorWithCounterAutoAgregation(new CalculatorWithMathCopy());
        CalculatorWithCounterAutoAgregation calcAgregation3 =
                new CalculatorWithCounterAutoAgregation(new CalculatorWithMathExtends());

        double result;

        result = calculateResult(calcComposite);
        showResult(result, calcComposite);

        result = calculateResult(calcAgregation1);
        showResult(result, calcAgregation1);

        result = calculateResult(calcAgregation2);
        showResult(result, calcAgregation2);

        result = calculateResult(calcAgregation3);
        showResult(result, calcAgregation3);
    }

    private static double calculateResult(CalculatorWithCounterAutoAgregation calculator) {
        double result;
        result = calculator.division(28d, 5d);
        result = calculator.pow(result, 2);
        result = calculator.addition(calculator.multiplication(15d, 7d), result);
        result = calculator.addition(result, 4.1);
        return result;
    }

    private static void showResult(double result, CalculatorWithCounterAutoAgregation calculator) {
        System.out.println("\nCalculation using " + calculator.toString() + " (" + calculator.getCalculatorInfo() + "):");
        System.out.println("4.1 + 15 * 7 + (28 / 5) ^ 2 = " + result);
        System.out.println("Current value of the counter of the calculator using: " + calculator.getCounter());
    }

    private static double calculateResult(CalculatorWithCounterAutoComposite calculator) {
        double result;
        result = calculator.division(28d, 5d);
        result = calculator.pow(result, 2);
        result = calculator.addition(calculator.multiplication(15d, 7d), result);
        result = calculator.addition(result, 4.1);
        return result;
    }

    private static void showResult(double result, CalculatorWithCounterAutoComposite calculator) {
        System.out.println("\nCalculation using " + calculator.toString() + " (" + calculator.getCalculatorInfo() + "):");
        System.out.println("4.1 + 15 * 7 + (28 / 5) ^ 2 = " + result);
        System.out.println("Current value of the counter of the calculator using: " + calculator.getCounter());
    }
}
