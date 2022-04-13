package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithBigDecimal;
import home_work_3.calcs.simple.CalculatorWithMathCopy;
import home_work_3.calcs.simple.CalculatorWithMathExtends;
import home_work_3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithCounterAutoAgregationBigDecimal {
    CalculatorWithOperator calculatorWithOperator;
    CalculatorWithMathCopy calculatorWithMathCopy;
    CalculatorWithMathExtends calculatorWithMathExtends;
    CalculatorWithBigDecimal calculatorWithBigDecimal;
    private long counter;

    public CalculatorWithCounterAutoAgregationBigDecimal(CalculatorWithOperator calculator) {
        this.calculatorWithOperator = calculator;
    }

    public CalculatorWithCounterAutoAgregationBigDecimal(CalculatorWithMathCopy calculator) {
        this.calculatorWithMathCopy = calculator;
    }

    public CalculatorWithCounterAutoAgregationBigDecimal(CalculatorWithMathExtends calculator) {
        this.calculatorWithMathExtends = calculator;
    }

    public CalculatorWithCounterAutoAgregationBigDecimal(CalculatorWithBigDecimal calculator) {
        this.calculatorWithBigDecimal = calculator;
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
            return calculatorWithOperator.division(a, b);
        } else if (calculatorWithMathCopy != null) {
            return calculatorWithMathCopy.division(a, b);
        } else if (calculatorWithMathExtends != null) {
            return calculatorWithMathExtends.division(a, b);
        } else {
            return calculatorWithBigDecimal.division(a, b);
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
            return calculatorWithOperator.multiplication(a, b);
        } else if (calculatorWithMathCopy != null) {
            return calculatorWithMathCopy.multiplication(a, b);
        } else if (calculatorWithMathExtends != null) {
            return calculatorWithMathExtends.multiplication(a, b);
        } else {
            return calculatorWithBigDecimal.multiplication(a, b);
        }
    }

    /**
     * Returns the result of subtraction a and b, using the object, that was passed as an argument.
     * @param a value
     * @param b subtrahend value
     * @return the result of subtruction a and b type double
     */
    public double subtraction(double a, double b) {
        this.counter++;
        if(calculatorWithOperator != null) {
            return calculatorWithOperator.subtraction(a, b);
        } else if (calculatorWithMathCopy != null) {
            return calculatorWithMathCopy.subtraction(a, b);
        } else if (calculatorWithMathExtends != null) {
            return calculatorWithMathExtends.subtraction(a, b);
        } else {
            return calculatorWithBigDecimal.subtraction(a, b);
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
            return calculatorWithOperator.addition(a, b);
        } else if (calculatorWithMathCopy != null) {
            return calculatorWithMathCopy.addition(a, b);
        } else if (calculatorWithMathExtends != null) {
            return calculatorWithMathExtends.addition(a, b);
        } else {
            return calculatorWithBigDecimal.addition(a, b);
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
        } else if (calculatorWithMathExtends != null) {
            return calculatorWithMathExtends.pow(a, b);
        } else {
            return calculatorWithBigDecimal.pow(a, b);
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
        } else if (calculatorWithMathExtends != null) {
            return calculatorWithMathExtends.abs(a);
        } else {
            return calculatorWithBigDecimal.abs(a);
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
        } else if (calculatorWithMathExtends != null) {
            return calculatorWithMathExtends.sqrt(a);
        } else {
            return calculatorWithBigDecimal.sqrt(a);
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
