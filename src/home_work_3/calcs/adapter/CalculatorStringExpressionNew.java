package home_work_3.calcs.adapter;

import home_work_3.calcs.adapter.handlers.*;
import home_work_3.calcs.adapter.handlers.api.IHandler;
import home_work_3.calcs.api.ICalculator;
import home_work_3.calcs.simple.CalculatorWithMathExtends;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.lang.Double.NaN;

/**
 * Adapter for calculating string expressions. Only one method to calculate
 * string expression and one collection of handlers that contain the rules
 * of a calculating process. The collection has been filled manually depending
 * on priority (from smallest to largest).
 */
public class CalculatorStringExpressionNew {
    private final ICalculator calculator;

    private final List<IHandler> listHandler = new ArrayList<>();

    //private final PriorityQueue<IHandler> queueHandler = new PriorityQueue<>();

    public CalculatorStringExpressionNew() {
        this.calculator = new CalculatorWithMathExtends();

        // I can't get PriorityQueue<> to work.
        // I used List and filled in manually.
        // Old code is commented.

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

    /**
     * Returns a result of calculating of the passed expression.
     * Before calculating expression are checked for correctness with method
     * home_work_3.ExpressionAnalyze.checkExpression().
     * If expression incorrect result is NaN and show problem in console.
     * Expressions in a brackets are calculated first.
     * After that, the call of handlers will continue until the last sing of abs "|".
     * @param expression string with expression.
     * @return double value of the result
     */
    public double calculate(String expression) {
        expression = expression.toLowerCase(Locale.ROOT);
        expression = expression.replaceAll("\\s+","");
        expression = expression.replaceAll("pi", Double.toString(Math.PI));
        expression = expression.replaceAll("e", Double.toString(Math.E));

        ExpressionAnalyzer expressionAnalyzer = new ExpressionAnalyzer();
        if(expressionAnalyzer.checkExpression(expression)) {
            Pattern inBrackets = Pattern.compile("\\(([^()]*)\\)");
            Matcher inBracketsMatcher = inBrackets.matcher(expression);
            do {
                if(inBracketsMatcher.find()) {
                    String inBracketsExp = inBracketsMatcher.group(1);
                    for (IHandler handler : listHandler) {
                        //System.out.println(handler.toString());
                        inBracketsExp = handler.handle(inBracketsExp);
                    }
                    expression = expression.replace(inBracketsMatcher.group(), inBracketsExp);
                }
                inBracketsMatcher = inBrackets.matcher(expression);
            } while(expression.contains("(") && expression.contains(")"));

            do{
                for (IHandler handler : listHandler) {
                    //System.out.println(handler.toString());
                    expression = handler.handle(expression);
                }
            } while(expression.contains("|"));

            return Double.parseDouble(expression);
        } else {
            return NaN;
        }
    }
}
