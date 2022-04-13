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

        result = calculator1.division(28d, 5d);
        result = calculator1.pow(result, 2);
        result = calculator1.addition(calculator1.multiplication(15d, 7d), result);
        result = calculator1.addition(result, 4.1);
        System.out.println("Calculation using CalculatorWithCounterAutoAgregationInterface (CalculatorWithOperator):");
        System.out.println("4.1 + 15 * 7 + (28 / 5) ^ 2 = " + result);
        System.out.println("Current value of the counter of the calculator using: " + calculator1.getCounter());

        result = calculator2.division(28d, 5d);
        result = calculator2.pow(result, 2);
        result = calculator2.addition(calculator2.multiplication(15d, 7d), result);
        result = calculator2.addition(result, 4.1);
        System.out.println("\nCalculation using CalculatorWithCounterAutoAgregationInterface (CalculatorWithMathCopy):");
        System.out.println("4.1 + 15 * 7 + (28 / 5) ^ 2 = " + result);
        System.out.println("Current value of the counter of the calculator using: " + calculator2.getCounter());

        result = calculator3.division(28d, 5d);
        result = calculator3.pow(result, 2);
        result = calculator3.addition(calculator3.multiplication(15d, 7d), result);
        result = calculator3.addition(result, 4.1);
        System.out.println("\nCalculation using CalculatorWithCounterAutoAgregationInterface (CalculatorWithMathExtends):");
        System.out.println("4.1 + 15 * 7 + (28 / 5) ^ 2 = " + result);
        System.out.println("Current value of the counter of the calculator using: " + calculator3.getCounter());

        result = calculator4.division(28d, 5d);
        result = calculator4.pow(result, 2);
        result = calculator4.addition(calculator4.multiplication(15d, 7d), result);
        result = calculator4.addition(result, 4.1);
        System.out.println("\nBONUS: Calculation using CalculatorWithCounterAutoAgregationInterface (CalculatorWithBigDecimalExtends):");
        System.out.println("4.1 + 15 * 7 + (28 / 5) ^ 2 = " + result);
        System.out.println("Current value of the counter of the calculator using: " + calculator4.getCounter());
    }
}
