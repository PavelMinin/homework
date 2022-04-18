package home_work_3.calcs.adapter.handlers;

import home_work_3.calcs.adapter.handlers.api.IHandler;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class PatternHandler implements IHandler {

    public static final String DOUBLE_NUMBER_PATTERN = "(\\-?\\d+(\\.\\d+){0,1})";
    public static final String INT_NUMBER_PATTERN = "(\\-?\\d+)";


    private final Pattern pattern;

    public PatternHandler(String regex) {
        this.pattern = Pattern.compile(regex);
    }

    @Override
    public final String handle(String expression) {
        boolean isMatched = false;

        do {
            Matcher matcher = this.pattern.matcher(expression);
            isMatched = matcher.find();
            if(isMatched){
                double result = calculate(matcher);
                do {
                    expression = expression.replace(matcher.group(), String.valueOf(result));
                } while(expression.contains(matcher.group()));
            }
        } while(isMatched);

        return expression;
    }

    protected abstract double calculate(Matcher matcher);
}
