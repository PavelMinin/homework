package home_work_3.runners;

import home_work_3.calcs.simple.CalculatorWithMathExtends;
import home_work_3.calcs.simple.CalculatorWithOperator;

public class CalcsTest {
    public static void main(String[] args) {
        double a = 0, b = 0, c = 0, d = 0;
        int e = 0, f = 0;
        CalculatorWithOperator calculatorWithOperator = new CalculatorWithOperator();
        CalculatorWithMathExtends calculatorWithMathExtends = new CalculatorWithMathExtends();
        for (int i = 0; i < 10; i++) {
            System.out.println("a = " + a + "; b = " + b + "; c = " + c + "; d = " + d + "; e = " + e + "; f = " + f + ";");
            System.out.println("abs a: " + calculatorWithOperator.abs(a) + " " + calculatorWithMathExtends.abs(a) + " " + (calculatorWithOperator.abs(a) == calculatorWithMathExtends.abs(a)));
            System.out.println("add a,b: " + calculatorWithOperator.addition(a,b) + " " + calculatorWithMathExtends.addition(a,b) + " " + (calculatorWithOperator.addition(a,b) == calculatorWithMathExtends.addition(a,b)));
            System.out.println("div a,b: " + calculatorWithOperator.division(a,b) + " " + calculatorWithMathExtends.division(a,b) + " " + (calculatorWithOperator.division(a,b) == calculatorWithMathExtends.division(a,b)));
            System.out.println("mult a,b: " + calculatorWithOperator.multiplication(a,b) + " " + calculatorWithMathExtends.multiplication(a,b) + " " + (calculatorWithOperator.multiplication(a,b) == calculatorWithMathExtends.multiplication(a,b)));
            System.out.println("pow a,e: " + calculatorWithOperator.pow(a,e) + " " + calculatorWithMathExtends.pow(a,e) + " " + (calculatorWithOperator.pow(a,e) == calculatorWithMathExtends.pow(a,e)));
            System.out.println("sqrt a: " + calculatorWithOperator.sqrt(a) + " " + calculatorWithMathExtends.sqrt(a) + " " + (calculatorWithOperator.sqrt(a) == calculatorWithMathExtends.sqrt(a)));
            System.out.println("abs c: " + calculatorWithOperator.abs(c) + " " + calculatorWithMathExtends.abs(c) + " " + (calculatorWithOperator.abs(c) == calculatorWithMathExtends.abs(c)));
            System.out.println("add c,d: " + calculatorWithOperator.addition(c,d) + " " + calculatorWithMathExtends.addition(c,d) + " " + (calculatorWithOperator.addition(c,d) == calculatorWithMathExtends.addition(c,d)));
            System.out.println("div c,d: " + calculatorWithOperator.division(c,d) + " " + calculatorWithMathExtends.division(c,d) + " " + (calculatorWithOperator.division(c,d) == calculatorWithMathExtends.division(c,d)));
            System.out.println("mult c,d: " + calculatorWithOperator.multiplication(c,d) + " " + calculatorWithMathExtends.multiplication(c,d) + " " + (calculatorWithOperator.multiplication(c,d) == calculatorWithMathExtends.multiplication(c,d)));
            System.out.println("pow c,f: " + calculatorWithOperator.pow(c,f) + " " + calculatorWithMathExtends.pow(c,f) + " " + (calculatorWithOperator.pow(c,f) == calculatorWithMathExtends.pow(c,f)));
            System.out.println("sqrt a: " + calculatorWithOperator.sqrt(c) + " " + calculatorWithMathExtends.sqrt(c) + " " + (calculatorWithOperator.sqrt(c) == calculatorWithMathExtends.sqrt(c)));
            a++;
            b++;
            c--;
            d--;
            e++;
            f--;
            System.out.println("-----------------------------------------------------------------------------");
        }
    }
}
