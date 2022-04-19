package home_work_3.calcs.adapter;

public class ExpressionAnalyzer {
    private boolean isCorrect = true;
    private boolean isDigit;
    private boolean isOperator;
    private boolean isConstant;
    private boolean isOpenBracket;
    private boolean isCloseBracket;
    private int bracketCounter;
    private int absCounter;
    private int absInBracketLevel;

    private void resetFlags(){
        this.isDigit = false;
        this.isOperator = false;
        this.isConstant = false;
        this.isOpenBracket = false;
        this.isCloseBracket = false;
    }

    private void setDigit() {
        if(!isConstant && !isDigit && !isCloseBracket) {
            resetFlags();
            this.isDigit = true;
        } else {
            System.out.println("Error: digit after constant, digit or \")\".");
            isCorrect = false;
        }
    }

    private void setConstant() {
        if(!isDigit && !isConstant && !isCloseBracket) {
            resetFlags();
            this.isConstant = true;
        } else {
            System.out.println("Error: constant after digit, constant or \")\".");
            isCorrect = false;
        }
    }

    private void setOperator() {
        if(!isOperator) {
            resetFlags();
            this.isOperator = true;
        } else {
            System.out.println("Error: multiples operators one by one.");
            isCorrect = false;
        }
    }
    private void setNegative() {
        resetFlags();
    }

    private void setOpenBracket() {
        if (!isDigit && !isConstant && !isCloseBracket) {
            resetFlags();
            this.bracketCounter++;
        } else {
            System.out.println("Error: missed operator before the \"(\".");
            isCorrect = false;
        }
    }

    private void setCloseBracket() {
        if(!isOpenBracket && !isOperator) {
            resetFlags();
            this.isCloseBracket = true;
            this.bracketCounter--;
        } else {
            System.out.println("Error: closes bracket after operator, or after opens bracket.");
            isCorrect = false;
        }
    }

    private void setAbsBracket() {
        resetFlags();
        this.absCounter++;
        if(this.absCounter % 2 != 0) {
            this.absInBracketLevel = this.bracketCounter;
        } else if(this.absInBracketLevel != this.bracketCounter) {
            System.out.println("Error: you missed \")\" or \"(\".");
            isCorrect = false;
        }
    }

    /**
     * Expression analyze for correct content. Uses flag of last operation and counters for checking.
     * @param expression input expression string
     * @return true - correct, false - incorrect.
     */
    public boolean checkExpression (String expression) {
        int pos = 0;
        while (pos < expression.length()) {
            char c = expression.charAt(pos);
            switch(c) {
                case '(':
                    setOpenBracket();
                    pos++;
                    continue;
                case ')':
                    setCloseBracket();
                    pos++;
                    continue;
                case '+':
                case '/':
                case '*':
                case '^':
                    setOperator();
                    pos++;
                    continue;
                case '-':
                    setNegative();
                    pos++;
                    continue;
                case 'e':
                    setConstant();
                    pos++;
                    continue;
                case '|':
                    setAbsBracket();
                    pos++;
                    continue;
                case 'p':
                    if (expression.charAt(++pos) == 'i') {
                        setConstant();
                        pos++;
                        continue;
                    } else {
                        System.out.println("Error: would you like to write \"PI\"?");
                        isCorrect = false;
                    }
                default:
                    if ((c <= '9' && c >= '0') || c == '.') {
                        setDigit();
                        boolean hasPoint = false;
                        do {
                            if (c == '.') {
                                if (!hasPoint) {
                                    hasPoint = true;
                                }  else {
                                    System.out.println("Error: multiple point at number.");
                                    isCorrect = false;
                                }
                            }
                            pos++;
                            if (pos >= expression.length()) {
                                break;
                            }
                            c = expression.charAt(pos);
                        } while ((c <= '9' && c >= '0') || c == '.');
                    } else {
                        if (c != ' ') {
                            System.out.println("Unexpected character: " + c);
                            isCorrect = false;
                        }
                        pos++;
                    }
            }
        }
        if(bracketCounter < 0) {
            System.out.println("Error: you have an extra \")\".");
            isCorrect = false;
        } else if(bracketCounter > 0) {
            System.out.println("Error: you missed an \")\".");
            isCorrect = false;
        }
        return isCorrect;
    }
}
