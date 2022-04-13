package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterAutoAgregationBigDecimal;
import home_work_3.calcs.additional.CalculatorWithCounterAutoComposite;
import home_work_3.calcs.simple.CalculatorWithBigDecimal;
import home_work_3.calcs.simple.CalculatorWithMathCopy;
import home_work_3.calcs.simple.CalculatorWithMathExtends;
import home_work_3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithCounterDelegateBigDecimalMain {
    public static void main(String[] args) {
        CalculatorWithOperator calculatorWithOperator = new CalculatorWithOperator();
        CalculatorWithMathCopy calculatorWithMathCopy = new CalculatorWithMathCopy();
        CalculatorWithMathExtends calculatorWithMathExtends = new CalculatorWithMathExtends();
        CalculatorWithBigDecimal calculatorWithBigDecimal = new CalculatorWithBigDecimal();

        CalculatorWithCounterAutoComposite calcComposite = new CalculatorWithCounterAutoComposite();

        CalculatorWithCounterAutoAgregationBigDecimal calcAgregation1 =
                new CalculatorWithCounterAutoAgregationBigDecimal(calculatorWithOperator);
        CalculatorWithCounterAutoAgregationBigDecimal calcAgregation2 =
                new CalculatorWithCounterAutoAgregationBigDecimal(calculatorWithMathCopy);
        CalculatorWithCounterAutoAgregationBigDecimal calcAgregation3 =
                new CalculatorWithCounterAutoAgregationBigDecimal(calculatorWithMathExtends);
        CalculatorWithCounterAutoAgregationBigDecimal calcAgregation4 =
                new CalculatorWithCounterAutoAgregationBigDecimal(calculatorWithBigDecimal);



        double result;
        result = calcComposite.division(28d, 5d);
        result = calcComposite.pow(result, 2);
        result = calcComposite.addition(calcComposite.multiplication(15d, 7d), result);
        result = calcComposite.addition(result, 4.1);
        System.out.println("Calculation using CalculatorWithCounterAutoComposite:");
        System.out.println("4.1 + 15 * 7 + (28 / 5) ^ 2 = " + result);
        System.out.println("Current value of the counter of the calculator using: " + calcComposite.getCounter());

        result = calcAgregation1.division(28d, 5d);
        result = calcAgregation1.pow(result, 2);
        result = calcAgregation1.addition(calcAgregation1.multiplication(15d, 7d), result);
        result = calcAgregation1.addition(result, 4.1);
        System.out.println("\nCalculation using CalculatorWithCounterAutoAgregation (CalculatorWithOperator):");
        System.out.println("4.1 + 15 * 7 + (28 / 5) ^ 2 = " + result);
        System.out.println("Current value of the counter of the calculator using: " + calcAgregation1.getCounter());

        result = calcAgregation2.division(28d, 5d);
        result = calcAgregation2.pow(result, 2);
        result = calcAgregation2.addition(calcAgregation2.multiplication(15d, 7d), result);
        result = calcAgregation2.addition(result, 4.1);
        System.out.println("\nCalculation using CalculatorWithCounterAutoAgregation (CalculatorWithMathCopy):");
        System.out.println("4.1 + 15 * 7 + (28 / 5) ^ 2 = " + result);
        System.out.println("Current value of the counter of the calculator using: " + calcAgregation2.getCounter());

        result = calcAgregation3.division(28d, 5d);
        result = calcAgregation3.pow(result, 2);
        result = calcAgregation3.addition(calcAgregation3.multiplication(15d, 7d), result);
        result = calcAgregation3.addition(result, 4.1);
        System.out.println("\nCalculation using CalculatorWithCounterAutoAgregation (CalculatorWithMathExtends):");
        System.out.println("4.1 + 15 * 7 + (28 / 5) ^ 2 = " + result);
        System.out.println("Current value of the counter of the calculator using: " + calcAgregation3.getCounter());

        result = calcAgregation4.division(28d, 5d);
        result = calcAgregation4.pow(result, 2);
        result = calcAgregation4.addition(calcAgregation4.multiplication(15d, 7d), result);
        result = calcAgregation4.addition(result, 4.1);
        System.out.println("\nCalculation using CalculatorWithCounterAutoAgregation (CalculatorWithBigDecimalExtends):");
        System.out.println("4.1 + 15 * 7 + (28 / 5) ^ 2 = " + result);
        System.out.println("Current value of the counter of the calculator using: " + calcAgregation4.getCounter());
    }
}
