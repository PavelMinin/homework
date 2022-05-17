package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithCounterAutoComposite {
    private final CalculatorWithMathExtends calculator = new CalculatorWithMathExtends();
    private long counter = 0;

    @Override
    public String toString() {
        return "CalculatorWithCounterAutoComposite";
    }

    public String getCalculatorInfo() {
        return this.calculator.toString();
    }

    /**
     * Returns the result of division a to b, using object of type CalculatorWithMathExtends.
     * @param a divident
     * @param b divider
     * @return the result of division type double
     */
    public double division(double a, double b) {
        this.counter++;
        return calculator.divide(a, b);
    }

    /**
     * Returns the result of multiplication a to b, using object of type CalculatorWithMathExtends.
     * @param a the first multiplier
     * @param b the second multiplier
     * @return the result of multiplication type double
     */
    public double multiplication(double a, double b) {
        this.counter++;
        return calculator.multiply(a, b);
    }

    /**
     * Returns the result of subtraction a and b, using object of type CalculatorWithMathExtends.
     * @param a value
     * @param b subtrahend value
     * @return the result of substruction a and b type double
     */
    public double subtraction(double a, double b) {
        this.counter++;
        return calculator.subtract(a, b);
    }

    /**
     * Returns the result of addition a and b, using object of type CalculatorWithMathExtends.
     * @param a the first term
     * @param b the second term
     * @return the result of addition type double
     */
    public double addition(double a, double b) {
        this.counter++;
        return calculator.add(a, b);
    }

    /**
     * Returns the result of raising a to the power of b, using object of type CalculatorWithMathExtends.
     * @param a the base
     * @param b the exponent
     * @return the result of raising a to the power of b.
     */
    public double pow(double a, int b) {
        this.counter++;
        return calculator.pow(a, b);
    }

    /**
     * Return the absolut value of the passed argument, using object of type CalculatorWithMathExtends.
     * @param a the passed argument.
     * @return the absolut value of the a.
     */
    public double abs(double a) {
        this.counter++;
        return calculator.abs(a);
    }

    /**
     * Returns the result of taking the square root of the passed argument,
     * using object of type CalculatorWithMathExtends.
     * @param a the passed argument.
     * @return the result of taking the square root of the a.
     */
    public double sqrt(double a) {
        this.counter++;
        return calculator.sqrt(a);
    }

    /**
     * Returns current value of the counter of the object using.
     * @return current value of the counter of the object using
     */
    public long getCounter() {
        return counter;
    }
}
