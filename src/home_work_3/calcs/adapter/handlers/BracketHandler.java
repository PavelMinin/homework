package home_work_3.calcs.adapter.handlers;

import home_work_3.calcs.adapter.handlers.api.IHandler;
import home_work_3.calcs.api.ICalculator;

import java.util.regex.Matcher;

public class BracketHandler extends PatternHandler implements IHandler, Comparable<IHandler>  {
    private final int priority = 0;

    public BracketHandler(ICalculator calculator) {
        super("\\(" + DOUBLE_NUMBER_PATTERN + "\\)");
    }

    @Override
    public String toString() {
        return "BracketHandler{" +
                "priority=" + priority +
                '}';
    }

    @Override
    protected double calculate(Matcher matcher) {
        String operand1 = matcher.group(1);
        return Double.parseDouble(operand1);
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
