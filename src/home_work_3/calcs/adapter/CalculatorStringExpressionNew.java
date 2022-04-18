package home_work_3.calcs.adapter;

import home_work_3.calcs.adapter.handlers.*;
import home_work_3.calcs.adapter.handlers.api.IHandler;
import home_work_3.calcs.api.ICalculator;
import home_work_3.calcs.simple.CalculatorWithBigDecimal;
import home_work_3.calcs.simple.CalculatorWithMathExtends;

import java.util.*;

/**
 * Adapter for calculating string expressions
 */
public class CalculatorStringExpressionNew {
    private final ICalculator calculator;

    private final List<IHandler> listHandler = new ArrayList<>();

    //private final PriorityQueue<IHandler> queueHandler = new PriorityQueue<>();

    public CalculatorStringExpressionNew() {
        this.calculator = new CalculatorWithMathExtends();

        //this.queueHandler.add(new AddHandler(this.calculator));
        //this.queueHandler.add(new MultiplyHandler(this.calculator));
        //this.queueHandler.add(new BracketHandler(this.calculator));
        //this.queueHandler.add(new AbsHandler(this.calculator));
        //this.queueHandler.add(new SubtractHandler(this.calculator));
        //this.queueHandler.add(new DivideHandler(this.calculator));
        //this.queueHandler.add(new PowHandler(this.calculator));

        this.listHandler.add(new BracketHandler(this.calculator));
        this.listHandler.add(new AbsHandler(this.calculator));
        this.listHandler.add(new PowHandler(this.calculator));
        this.listHandler.add(new MultiplyHandler(this.calculator));
        this.listHandler.add(new DivideHandler(this.calculator));
        this.listHandler.add(new AddHandler(this.calculator));
        this.listHandler.add(new SubtractHandler(this.calculator));
    }

    public double calculate(String expression) {
        expression = expression.toLowerCase(Locale.ROOT);
        expression = expression.replaceAll("pi", Double.toString(Math.PI));
        expression = expression.replaceAll("e", Double.toString(Math.E));
        do {
            //for (IHandler handler : queueHandler) {
            for (IHandler handler : listHandler) {
                System.out.println(handler.toString());
                expression = handler.handle(expression);
            }
        } while (expression.contains("(") || expression.contains("|"));

        return Double.parseDouble(expression);
    }
}
