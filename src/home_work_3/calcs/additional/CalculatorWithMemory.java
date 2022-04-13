package home_work_3.calcs.additional;

import home_work_3.calcs.api.ICalculator;

public class CalculatorWithMemory {
    ICalculator calculator;
    private double buffer;
    private double memory;

    public CalculatorWithMemory(ICalculator calculator){
        this.calculator = calculator;
    }

    /**
     * Returns value of the memory and records to the memory 0.
     * @return value of the last operation.
     */
    public double getMemory() {
        this.buffer = this.memory;
        this.memory = 0;
        return buffer;
    }

    /**
     * Records value from the buffer to the memory.
     */
    public void memorize() {
        this.memory = this.buffer;
    }

    /**
     * Returns the result of division a to b.
     * @param a divident
     * @param b divider
     * @return the result of division type double
     */
    public double division(double a, double b) {
        this.buffer = calculator.division(a, b);
        return this.buffer;
    }

    /**
     * Returns the result of multiplication a to b.
     * @param a the first multiplier
     * @param b the second multiplier
     * @return the result of multiplication type double
     */
    public double multiplication(double a, double b) {
        this.buffer = calculator.multiplication(a, b);
        return this.buffer;
    }

    /**
     * Returns the result of subtraction a and b.
     * @param a value
     * @param b subtrahend value
     * @return the result of subtruction a and b type double
     */
    public double subtraction(double a, double b) {
        this.buffer = calculator.subtraction(a, b);
        return this.buffer;
    }

    /**
     * Returns the result of addition a and b.
     * @param a the first term
     * @param b the second term
     * @return the result of addition type double
     */
    public double addition(double a, double b) {
        this.buffer = calculator.addition(a, b);
        return this.buffer;
    }

    /**
     * Returns the result of raising a to the power of b.
     * @param a the base
     * @param b the exponent
     * @return the result of raising a to the power of b.
     */
    public double pow(double a, int b) {
        this.buffer = calculator.pow(a, b);
        return this.buffer;
    }

    /**
     * Return the absolut value of the passed argument.
     * @param a the passed argument.
     * @return the absolut value of the a.
     */
    public double abs(double a) {
        this.buffer = calculator.abs(a);
        return this.buffer;
    }

    /**
     * Returns the result of taking the square root of the passed argument.
     * @param a the passed argument.
     * @return the result of taking the square root of the a.
     */
    public double sqrt(double a) {
        this.buffer = calculator.sqrt(a);
        return this.buffer;
    }
}
