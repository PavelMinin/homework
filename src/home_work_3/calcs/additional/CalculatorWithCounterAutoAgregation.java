package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithMathCopy;
import home_work_3.calcs.simple.CalculatorWithMathExtends;
import home_work_3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithCounterAutoAgregation {
    private CalculatorWithOperator calculatorWithOperator;
    private CalculatorWithMathCopy calculatorWithMathCopy;
    private CalculatorWithMathExtends calculatorWithMathExtends;
    private long counter;

    public String getCalculatorInfo() {
        if(calculatorWithOperator != null) {
            return calculatorWithOperator.toString();
        } else if (calculatorWithMathCopy != null) {
            return calculatorWithMathCopy.toString();
        } else {
            return calculatorWithMathExtends.toString();
        }
    }

    public CalculatorWithCounterAutoAgregation(CalculatorWithOperator calculator) {
        this.calculatorWithOperator = calculator;
    }

    public CalculatorWithCounterAutoAgregation(CalculatorWithMathCopy calculator) {
        this.calculatorWithMathCopy = calculator;
    }

    public CalculatorWithCounterAutoAgregation(CalculatorWithMathExtends calculator) {
        this.calculatorWithMathExtends = calculator;
    }



    @Override
    public String toString() {
        return "CalculatorWithCounterAutoAgregation";
    }

    /**
     * Returns the result of division a to b, using the object, that was passed as an argument.
     * @param a divident
     * @param b divider
     * @return the result of division type double
     */
    public double division(double a, double b) {
        this.counter++;
        if(calculatorWithOperator != null) {
            return calculatorWithOperator.divide(a, b);
        } else if (calculatorWithMathCopy != null) {
            return calculatorWithMathCopy.divide(a, b);
        } else {
            return calculatorWithMathExtends.divide(a, b);
        }
    }

    /**
     * Returns the result of multiplication a to b, using the object, that was passed as an argument.
     * @param a the first multiplier
     * @param b the second multiplier
     * @return the result of multiplication type double
     */
    public double multiplication(double a, double b) {
        this.counter++;
        if(calculatorWithOperator != null) {
            return calculatorWithOperator.multiply(a, b);
        } else if (calculatorWithMathCopy != null) {
            return calculatorWithMathCopy.multiply(a, b);
        } else {
            return calculatorWithMathExtends.multiply(a, b);
        }
    }

    /**
     * Returns the result of subtraction a and b, using the object, that was passed as an argument.
     * @param a value
     * @param b subtrahend value
     * @return the result of substruction a and b type double
     */
    public double subtraction(double a, double b) {
        this.counter++;
        if(calculatorWithOperator != null) {
            return calculatorWithOperator.subtract(a, b);
        } else if (calculatorWithMathCopy != null) {
            return calculatorWithMathCopy.subtract(a, b);
        } else {
            return calculatorWithMathExtends.subtract(a, b);
        }
    }

    /**
     * Returns the result of addition a and b, using the object, that was passed as an argument.
     * @param a the first term
     * @param b the second term
     * @return the result of addition type double
     */
    public double addition(double a, double b) {
        this.counter++;
        if(calculatorWithOperator != null) {
            return calculatorWithOperator.add(a, b);
        } else if (calculatorWithMathCopy != null) {
            return calculatorWithMathCopy.add(a, b);
        } else {
            return calculatorWithMathExtends.add(a, b);
        }
    }

    /**
     * Returns the result of raising a to the power of b, using the object, that was passed as an argument.
     * @param a the base
     * @param b the exponent
     * @return the result of raising a to the power of b.
     */
    public double pow(double a, int b) {
        this.counter++;
        if(calculatorWithOperator != null) {
            return calculatorWithOperator.pow(a, b);
        } else if (calculatorWithMathCopy != null) {
            return calculatorWithMathCopy.pow(a, b);
        } else {
            return calculatorWithMathExtends.pow(a, b);
        }
    }

    /**
     * Return the absolut value of the passed argument, using the object, that was passed as an argument.
     * @param a the passed argument.
     * @return the absolut value of the a.
     */
    public double abs(double a) {
        this.counter++;
        if(calculatorWithOperator != null) {
            return calculatorWithOperator.abs(a);
        } else if (calculatorWithMathCopy != null) {
            return calculatorWithMathCopy.abs(a);
        } else {
            return calculatorWithMathExtends.abs(a);
        }
    }

    /**
     * Returns the result of taking the square root of the passed argument, using the object,
     * that was passed as an argument.
     * @param a the passed argument.
     * @return the result of taking the square root of the a.
     */
    public double sqrt(double a) {
        this.counter++;
        if(calculatorWithOperator != null) {
            return calculatorWithOperator.sqrt(a);
        } else if (calculatorWithMathCopy != null) {
            return calculatorWithMathCopy.sqrt(a);
        } else {
            return calculatorWithMathExtends.sqrt(a);
        }
    }

    /**
     * Returns current value of the counter of the object using.
     * @return current value of the counter of the object using
     */
    public long getCounter() {
        return counter;
    }
}
