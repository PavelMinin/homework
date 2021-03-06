package home_work_3.calcs.adapter.handlers;

import home_work_3.calcs.adapter.handlers.api.IHandler;
import home_work_3.calcs.api.ICalculator;

import java.util.regex.Matcher;

public class MultiplyHandler extends PatternHandler implements IHandler, Comparable<IHandler> {
    private final ICalculator calculator;
    private final int priority = 3;

    @Override
    public String toString() {
        return "MultiplyHandler{" +
                "calculator=" + calculator +
                ", priority=" + priority +
                '}';
    }

    public MultiplyHandler(ICalculator calculator) {
        super(DOUBLE_NUMBER_PATTERN + "\\*" + DOUBLE_NUMBER_PATTERN);
        this.calculator = calculator;
    }

    @Override
    protected double calculate(Matcher matcher) {
        String operand1 = matcher.group(1);
        String operand2 = matcher.group(3);
        return this.calculator.multiply(Double.parseDouble(operand1), Double.parseDouble(operand2));
    }

    @Override
    public int getPriority() {
        return this.priority;
    }

    @Override
    public int compareTo(IHandler other) {
        return this.getPriority() - other.getPriority();
    }
}
