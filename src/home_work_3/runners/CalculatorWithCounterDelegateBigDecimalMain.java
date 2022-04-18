package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterAutoAgregationBigDecimal;
import home_work_3.calcs.additional.CalculatorWithCounterAutoComposite;
import home_work_3.calcs.simple.CalculatorWithBigDecimal;
import home_work_3.calcs.simple.CalculatorWithMathCopy;
import home_work_3.calcs.simple.CalculatorWithMathExtends;
import home_work_3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithCounterDelegateBigDecimalMain {
    public static void main(String[] args) {

        CalculatorWithCounterAutoComposite calcComposite = new CalculatorWithCounterAutoComposite();

        CalculatorWithCounterAutoAgregationBigDecimal calcAgregation1 =
                new CalculatorWithCounterAutoAgregationBigDecimal(new CalculatorWithOperator());
        CalculatorWithCounterAutoAgregationBigDecimal calcAgregation2 =
                new CalculatorWithCounterAutoAgregationBigDecimal(new CalculatorWithMathCopy());
        CalculatorWithCounterAutoAgregationBigDecimal calcAgregation3 =
                new CalculatorWithCounterAutoAgregationBigDecimal(new CalculatorWithMathExtends());
        CalculatorWithCounterAutoAgregationBigDecimal calcAgregation4 =
                new CalculatorWithCounterAutoAgregationBigDecimal(new CalculatorWithBigDecimal());

        double result;

        result = calculateResult(calcComposite);
        showResult(result, calcComposite);

        result = calculateResult(calcAgregation1);
        showResult(result, calcAgregation1);

        result = calculateResult(calcAgregation2);
        showResult(result, calcAgregation2);

        result = calculateResult(calcAgregation3);
        showResult(result, calcAgregation3);

        System.out.println("\nBONUS:");
        result = calculateResult(calcAgregation4);
        showResult(result, calcAgregation4);
    }

    private static double calculateResult(CalculatorWithCounterAutoAgregationBigDecimal calculator) {
        double result;
        result = calculator.division(28d, 5d);
        result = calculator.pow(result, 2);
        result = calculator.addition(calculator.multiplication(15d, 7d), result);
        result = calculator.addition(result, 4.1);
        return result;
    }

    private static void showResult(double result, CalculatorWithCounterAutoAgregationBigDecimal calculator) {
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
