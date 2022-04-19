package home_work_3.runners;

import home_work_3.calcs.adapter.CalculatorStringExpressionNew;

public class CalculatorStringExpressionNewMain {

    public static void main(String[] args) {
        String[] expression = {"1 + 2 + 3 - 1", "1 + 2 * 3", "(1 + 2) * 3", "(-1 - 2 ) * 3", "|-1 - 2| * 3",
                "4.1 + 15 * 7 + (28 / 5) ^ 2", "PI", "pi", "E", "e",
                "((4.1 + 1.095 * 7 / 9) ^ 2 + (28 / |-5|)) * PI ^ -2 - E - |44.075 - 3.04 * PI ^ 2|",
                "(4.1 + 1.095 * 7 / 9) ^ 2 + (28 / |-5|)) * PI ^ -2 - E - |44.075 - 3.04 * PI ^ 2|",
                "((4.1 + 1.095 * as7 / 9) ^ 2 + (28 / |-5|)) * PI ^ -2 - E - |44.075 - 3.04 * PI ^ 2|",
                "((4.1 + 1.09.5 * 7 / 9) ^ 2 + (28 / |-5|)) * PI ^ -2 - E - |44.075 - 3.04 * PI ^ 2|",
                "((4.1 + |1.095 * 7 / 9) ^ 2| + (28 / |-5|)) * PI ^ -2 - E - |44.075 - 3.04 * PI ^ 2|"
        };

        CalculatorStringExpressionNew calculator = new CalculatorStringExpressionNew();

        for (String s : expression) {
            System.out.println("Expression: " + s + ":");
            double result = calculator.calculate(s);
            System.out.println(s + " = " + result + "\n");
        }
    }
}
