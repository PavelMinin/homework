package home_work_3.calcs.additional;

import java.util.ArrayList;
import java.util.List;

public class LexemeAnalyzer {
    boolean isDigit = false;
    boolean isOperator = false;
    boolean isConstant = false;
    boolean isOpenBracket = false;
    boolean isCloseBracket = false;
    int bracketCounter;

    /**
     * Не до конца понял зачем добавил. Решил поэкспериментировать.
     * источник https://www.youtube.com/watch?v=iLnNqqom5KY
     */
    public enum LexemeType {
        LEFT_BRACKET, RIGHT_BRACKET, OP_PLUS, OP_MINUS,
        OP_MULT, OP_DIV, OP_EXP, OP_OR, PI, E, NUMBER,
        EOF;
    }

    /**
     * Тип лексемы и ее значение (строка)
     */
    public static class Lexeme {
        LexemeType type;
        String value;

        public Lexeme (LexemeType type, String value) {
            this.type = type;
            this.value = value;
        }
    }

    /**
     * Установка флага режима обработки числа с проверками.
     */
    private void setDigit() {
        if(!isConstant && !isDigit) {
            this.isDigit = true;
            this.isOperator = false;
            this.isConstant = false;
            this.isOpenBracket = false;
            this.isCloseBracket = false;
        } else {
            throw new RuntimeException("Error: digit after constant or digit.");
        }
    }

    /**
     * Установка флага режима обработки константы (PI, E) с проверками.
     */
    private void setConstant() {
        if(!isDigit && !isConstant) {
            this.isConstant = true;
            this.isOperator = false;
            this.isDigit = false;
            this.isOpenBracket = false;
            this.isCloseBracket = false;
        } else {
            throw new RuntimeException("Error: constant after digit.");
        }
    }

    /**
     * Установка флага режима обработки оператора с проверками.
     */
    private void setOperator() {
        if(!isOperator) {
            this.isConstant = false;
            this.isOperator = true;
            this.isDigit = false;
            this.isOpenBracket = false;
            this.isCloseBracket = false;
        } else {
            throw new RuntimeException("Error: multiples operators one by one.");
        }
    }

    /**
     * Установка флага открытой скобки.
     */
    private void setOpenBracket() {
            this.isConstant = false;
            this.isOperator = false;
            this.isDigit = false;
            this.isOpenBracket = true;
            this.isCloseBracket = false;
            this.bracketCounter++;
    }

    /**
     * Установка флага закрытой скобки с проверками.
     */
    private void setCloseBracket() {
        if(!isOpenBracket && !isOperator) {
            this.isConstant = false;
            this.isOperator = false;
            this.isDigit = false;
            this.isOpenBracket = false;
            this.isCloseBracket = true;
            this.bracketCounter--;
        } else {
            throw new RuntimeException("Error: closes bracket after operator, or after opens bracket.");
        }
    }

    /**
     * Лексический анализ введенного выражения с деление на отдельные лексемы.
     * @param expression строка выражения.
     * @return массив объектов типа лексема.
     */
    public List<Lexeme> lexAnalyze (String expression) {
        ArrayList<Lexeme> lexemes = new ArrayList<>();
        int pos = 0;

        while (pos < expression.length()) {
            Character c = expression.charAt(pos);
            switch(c) {
                case '(':
                    if(isDigit || isConstant || isCloseBracket) {
                        lexemes.add(new Lexeme(LexemeType.OP_MULT, "*"));
                        setOperator();
                    }
                    setOpenBracket();
                    lexemes.add(new Lexeme(LexemeType.LEFT_BRACKET, "("));
                    pos++;
                    continue;
                case ')':
                    setCloseBracket();
                    lexemes.add(new Lexeme(LexemeType.RIGHT_BRACKET, ")"));
                    pos++;
                    continue;
                case '+':
                    setOperator();
                    lexemes.add(new Lexeme(LexemeType.OP_PLUS, "+"));
                    pos++;
                    continue;
                case '-':
                    setOperator();
                    isOperator = true;
                    lexemes.add(new Lexeme(LexemeType.OP_MINUS, "-"));
                    pos++;
                    continue;
                case '/':
                    setOperator();
                    lexemes.add(new Lexeme(LexemeType.OP_DIV, "/"));
                    pos++;
                    continue;
                case '*':
                    setOperator();
                    isOperator = true;
                    lexemes.add(new Lexeme(LexemeType.OP_MULT, "*"));
                    pos++;
                    continue;
                case '^':
                    setOperator();
                    isOperator = true;
                    lexemes.add(new Lexeme(LexemeType.OP_EXP, "^"));
                    pos++;
                    continue;
                case 'E':
                    if(isCloseBracket) {
                        lexemes.add(new Lexeme(LexemeType.OP_MULT, "*"));
                        setOperator();
                    }
                    setConstant();
                    lexemes.add(new Lexeme(LexemeType.E, "E"));
                    pos++;
                    continue;
                case '|':
                    if (expression.charAt(++pos) == '|') {
                        setOperator();
                        lexemes.add(new Lexeme(LexemeType.OP_OR, "||"));
                        pos++;
                        continue;
                    } else {
                        throw new RuntimeException("Error: would you like to write \"||\"?");
                    }
                case 'P':
                    if (expression.charAt(++pos) == 'I') {
                        if(isCloseBracket) {
                            lexemes.add(new Lexeme(LexemeType.OP_MULT, "*"));
                            setOperator();
                        }
                        setConstant();
                        lexemes.add(new Lexeme(LexemeType.PI, "PI"));
                        pos++;
                        continue;
                    } else {
                        throw new RuntimeException("Error: would you like to write \"PI\"?");
                    }
                default:
                    if ((c <= '9' && c >= '0') || c == '.') {
                        if(isCloseBracket) {
                            lexemes.add(new Lexeme(LexemeType.OP_MULT, "*"));
                            setOperator();
                        }
                        setDigit();
                        StringBuilder sb = new StringBuilder();
                        boolean hasPoint = false;
                        do {
                            if (c == '.') {
                                if (!hasPoint) {
                                    hasPoint = true;
                                }  else {
                                    throw new RuntimeException("Error: multiple point at number.");
                                }
                            }
                            sb.append(c);
                            pos++;
                            if (pos >= expression.length()) {
                                break;
                            }
                            c = expression.charAt(pos);
                        } while ((c <= '9' && c >= '0') || c == '.');
                        lexemes.add(new Lexeme(LexemeType.NUMBER, sb.toString()));
                    } else {
                        if (c != ' ') {
                            throw new RuntimeException("Unexpected character: " + c);
                        }
                        pos++;
                    }
            }
        }
        lexemes.add(new Lexeme(LexemeType.EOF,""));
        if(bracketCounter < 0) {
            throw new RuntimeException("Error: you have an extra \")\".");
        } else if(bracketCounter > 0) {
            throw new RuntimeException("Error: you have an extra \"(\".");
        }
        return lexemes;
    }
}
