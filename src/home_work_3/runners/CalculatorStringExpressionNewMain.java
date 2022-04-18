package home_work_3.runners;

import home_work_3.calcs.adapter.CalculatorStringExpressionNew;

public class CalculatorStringExpressionNewMain {

    public static void main(String[] args) {
        String expression = "(4.1 + 15 * 7) ^ -1 + (28 / 5) ^ 2 * PI - E - |125 - 54 * PI ^ 2|";
        //expression = "(4.1 + 15)^-3 + ((3.1 / 2 + 1) * 7 - 3) * 2";

        CalculatorStringExpressionNew calculator = new CalculatorStringExpressionNew();
        double result = calculator.calculate(expression);
        System.out.println(expression + " = " + result);
    }
}
