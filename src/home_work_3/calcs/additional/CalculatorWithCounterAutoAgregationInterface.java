package home_work_3.calcs.additional;

import home_work_3.calcs.api.ICalculator;

public class CalculatorWithCounterAutoAgregationInterface {
    ICalculator calculator;
    private long counter = 0;

    public CalculatorWithCounterAutoAgregationInterface(ICalculator calculator) {
        this.calculator = calculator;
    }

    public String getCalculatorInfo() {
        return this.calculator.toString();
    }

    @Override
    public String toString() {
        return "CalculatorWithCounterAutoAgregationInterface";
    }

    /**
     * Returns the result of division a to b.
     * @param a divident
     * @param b divider
     * @return the result of division type double
     */
    public double division(double a, double b) {
        counter++;
        return calculator.divide(a, b);
    }

    /**
     * Returns the result of multiplication a to b.
     * @param a the first multiplier
     * @param b the second multiplier
     * @return the result of multiplication type double
     */
    public double multiplication(double a, double b) {
        counter++;
        return calculator.multiply(a, b);
    }

    /**
     * Returns the result of subtraction a and b.
     * @param a value
     * @param b subtrahend value
     * @return the result of subtruction a and b type double
     */
    public double subtraction(double a, double b) {
        counter++;
        return calculator.subtract(a, b);
    }

    /**
     * Returns the result of addition a and b.
     * @param a the first term
     * @param b the second term
     * @return the result of addition type double
     */
    public double addition(double a, double b) {
        counter++;
        return calculator.add(a, b);
    }

    /**
     * Returns the result of raising a to the power of b.
     * @param a the base
     * @param b the exponent
     * @return the result of raising a to the power of b.
     */
    public double pow(double a, int b) {
        counter++;
        return calculator.pow(a, b);
    }

    /**
     * Return the absolut value of the passed argument.
     * @param a the passed argument.
     * @return the absolut value of the a.
     */
    public double abs(double a) {
        counter++;
        return calculator.abs(a);
    }

    /**
     * Returns the result of taking the square root of the passed argument.
     * @param a the passed argument.
     * @return the result of taking the square root of the a.
     */
    public double sqrt(double a) {
        counter++;
        return calculator.sqrt(a);
    }

    /**
     * Returns the number of times an object's methods have been used.
     * @return counter.
     */
    public long getCounter() {
        return counter;
    }
}
