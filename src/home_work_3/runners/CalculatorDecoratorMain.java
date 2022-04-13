package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterAutoDecorator;
import home_work_3.calcs.additional.CalculatorWithMemoryDecorator;
import home_work_3.calcs.api.ICalculator;
import home_work_3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorDecoratorMain {
    public static void main(String[] args){
        ICalculator calculator = 
                new CalculatorWithCounterAutoDecorator(new CalculatorWithMemoryDecorator(new CalculatorWithMathExtends()));

        System.out.println("Calculation using decorators (simple calculator is CalculatorWithMathExtends):");

        System.out.println("4.1 + 15 * 7 + (28 / 5) ^ 2 = " +
                calculator.addition(calculator.addition(calculator.pow(calculator.division(28,5), 2),
                        calculator.multiplication(15, 7)), 4.1));

        // (calculator instanceof CalculatorWithCounterAutoDecorator) is always true because we initialized
        // the ICalculator calculator as the CalculatorWithCounterAutoDecorator object.
        CalculatorWithCounterAutoDecorator calcWithCounter = (CalculatorWithCounterAutoDecorator) calculator;
        System.out.println("Current value of the counter of the calculator using: " +
        calcWithCounter.getCounter());
        if(calcWithCounter.getCalculator() instanceof CalculatorWithMemoryDecorator) {
            CalculatorWithMemoryDecorator calcWithMemory = (CalculatorWithMemoryDecorator) calcWithCounter.getCalculator();
            calcWithMemory.memorize();
            System.out.println("Value of the last operation performed  = " +
                    calcWithMemory.getMemory());
        }
    }
}
