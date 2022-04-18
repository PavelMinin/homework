package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterAutoAgregationBigDecimal;
import home_work_3.calcs.additional.CalculatorWithCounterAutoAgregationInterface;
import home_work_3.calcs.additional.CalculatorWithCounterAutoComposite;
import home_work_3.calcs.api.ICalculator;
import home_work_3.calcs.simple.CalculatorWithBigDecimal;
import home_work_3.calcs.simple.CalculatorWithMathCopy;
import home_work_3.calcs.simple.CalculatorWithMathExtends;
import home_work_3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithCounterAutoCompositeInterfaceMain {
    public static void main(String[] args) {
        CalculatorWithCounterAutoAgregationInterface calculator1 =
                new CalculatorWithCounterAutoAgregationInterface(new CalculatorWithOperator());
        CalculatorWithCounterAutoAgregationInterface calculator2 =
                new CalculatorWithCounterAutoAgregationInterface(new CalculatorWithMathCopy());
        CalculatorWithCounterAutoAgregationInterface calculator3 =
                new CalculatorWithCounterAutoAgregationInterface(new CalculatorWithMathExtends());
        CalculatorWithCounterAutoAgregationInterface calculator4 =
                new CalculatorWithCounterAutoAgregationInterface(new CalculatorWithBigDecimal());

        double result;

        result = calculateResult(calculator1);
        showResult(result, calculator1);

        result = calculateResult(calculator2);
        showResult(result, calculator2);

        result = calculateResult(calculator3);
        showResult(result, calculator3);

        result = calculateResult(calculator4);
        System.out.println("\nBONUS:");
        showResult(result, calculator4);
    }

    private static double calculateResult(CalculatorWithCounterAutoAgregationInterface calculator) {
        double result;
        result = calculator.division(28d, 5d);
        result = calculator.pow(result, 2);
        result = calculator.addition(calculator.multiplication(15d, 7d), result);
        result = calculator.addition(result, 4.1);
        return result;
    }

    private static void showResult(double result, CalculatorWithCounterAutoAgregationInterface calculator) {
        System.out.println("\nCalculation using " + calculator.toString() + " (" + calculator.getCalculatorInfo() + "):");
        System.out.println("4.1 + 15 * 7 + (28 / 5) ^ 2 = " + result);
        System.out.println("Current value of the counter of the calculator using: " + calculator.getCounter());
    }
}
