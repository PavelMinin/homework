package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithBigDecimal;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Stack;

/**
 * Новый калькулятор для расчета выражения из строки.
 * Применен метод отбратной польской записи (Reverse Polish notation, RPN).
 */
public class CalculatorStringExpression {
    private String infixExpression;
    private double result;
    private List<LexemeAnalyzer.Lexeme> postfixExpression = new ArrayList<>();

    public void setInfixExpression(String infixExpression) {
        this.infixExpression = infixExpression;
    }

    public CalculatorStringExpression(String expression) {
        this.infixExpression = expression.toUpperCase(Locale.ROOT);
    }

    public CalculatorStringExpression() {
    }

    public String getInfixExpression() {
        return infixExpression;
    }

    public void showPostfixExpression() {
        for (LexemeAnalyzer.Lexeme lexeme : postfixExpression) {
            System.out.print(lexeme.value + " ");
        }
    }

    public double getResult() {
        return result;
    }

    /**
     * Установка приоритета выполнения операций для RPN.
     * @param token значение лексемы.
     * @return значение приоритета.
     */
    private int getOpPriority(String token) {
        if(token.equals("*")  || token.equals("/") || token.equals("^")) {
            return 3;
        } else if(token.equals("+") || token.equals("-") || token.equals("||")) {
            return 2;
        } else if(token.equals("(")) {
            return 1;
        } else if(token.equals(")")) {
            return -1;
        } else {
            return 0;
        }
    }

    /**
     * Преобразуем массив лексем, полученный в результате анализа
     * выражения в формат обратной полской записи RPN.
     */
    private void convertToRPN() {
        LexemeAnalyzer lexemes = new LexemeAnalyzer();
        List<LexemeAnalyzer.Lexeme> infixExpressionList = lexemes.lexAnalyze(infixExpression);
        int priority;
        Stack<LexemeAnalyzer.Lexeme> stackOp = new Stack<>();
        for (LexemeAnalyzer.Lexeme lexeme : infixExpressionList) {
            priority = getOpPriority(lexeme.value);
            if (priority == 0) {
                postfixExpression.add(lexeme);
            } else if(priority == 1) {
                stackOp.push(lexeme);
            } else if (priority > 1) {
                while (!stackOp.empty()) {
                    if (getOpPriority(stackOp.peek().value) >= priority) {
                        postfixExpression.add(stackOp.pop());
                    } else {
                        break;
                    }
                }
                stackOp.push(lexeme);
            }
            if (priority == -1) {
                while (getOpPriority(stackOp.peek().value) != 1) {
                    postfixExpression.add(stackOp.pop());
                }
                stackOp.pop();
            }
        }
        while(!stackOp.empty()) {
            postfixExpression.add(stackOp.pop());
        }
    }

    /**
     * Расчет выражения в формате RPN.
     * @param infixExpression
     * @return
     */
    public double calculateRPN(String infixExpression) {
        setInfixExpression(infixExpression);
        convertToRPN();
        Stack<Double> stackNum = new Stack<>();
        CalculatorWithBigDecimal calculator = new CalculatorWithBigDecimal();
        for (LexemeAnalyzer.Lexeme lexeme : postfixExpression) {
            if(getOpPriority(lexeme.value) == 0) {
                if(lexeme.type == LexemeAnalyzer.LexemeType.PI) {
                    stackNum.push(Math.PI);
                } else if(lexeme.type == LexemeAnalyzer.LexemeType.E) {
                    stackNum.push(Math.E);
                } else if(lexeme.type != LexemeAnalyzer.LexemeType.EOF) {
                    stackNum.push(Double.parseDouble(lexeme.value));
                }
            } else if(getOpPriority(lexeme.value) > 1) {
                double a = stackNum.pop();
                double b = stackNum.pop();
                if(lexeme.value.equals("+")) {
                    stackNum.push(calculator.add(b, a));
                } else if(lexeme.value.equals("-")) {
                    stackNum.push(calculator.subtract(b,a));
                } else if(lexeme.value.equals("*")) {
                    stackNum.push(calculator.multiply(b,a));
                } else if(lexeme.value.equals("/")) {
                    stackNum.push(calculator.divide(b,a));
                } else if(lexeme.value.equals("^")) {
                    stackNum.push(Math.pow(b, a));
                } else if(lexeme.value.equals("||")) {
                    if((b > 0) || (a > 0)) {
                        stackNum.push(1d);
                    } else {
                        stackNum.push(0d);
                    }
                }
            }

        }
        return stackNum.pop();
    }
}
