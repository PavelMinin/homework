package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorStringExpression;

public class CalculatorStringExpressionMain {

    public static void main(String[] args) {
        String expression = "(4.1 + 15 * 7) ^ 2 + (28 / 5) ^ 2 * PI - E";
        //expression = = "(4.1 + 15 * 7) || 2 + (28 / 5) ^ 2 * PI - E";
        //expression = "( 4.1 + 15 *  ) || 2 + (28 / 5) ^ 2 * PI - E";
        //expression = "(4.1 + 15 * 7) | 2 + (28 / 5) ^ 2 * PI - E";
        //expression = "(4.1 + 15 * 7) || 2 + (28 / 5 ^ 2 * PI - E";
        //expression = "(4.1 + 15 * 7) || 2 + (28 / 5)) ^ 2 * PI - E";
        //expression = "(4.1 + 15 * 7) || 2 + (28 / 5) ^ 2 * P - E";
        //expression = "(4.1 + 15 * 7) || 2 + (28 / 5) ^ 2 ** PI - E";
        //expression = "(4.1 + 15 * 7)(5) || 2 + (28 / 5) ^ 2 * PI - E";
        //expression = "PI(4.1 + 15 * 7)5 || 2 +5 (15 - 3)+ E (28 / 5) ^ 2 * PI - E";
        //expression = "(4.1 + 15 * 7) || 2 + () ^ 2 * PI - E";
        //expression = "(4.1 + 15 * 7E) || 2 + (28 / 5) ^ 2 * PI - E";
        CalculatorStringExpression calculatorRPN = new CalculatorStringExpression();
        double result = calculatorRPN.calculateRPN(expression);
        System.out.println(expression + " = " + result);
        System.out.println(calculatorRPN.getInfixExpression());
        calculatorRPN.showPostfixExpression();
    }
}
