package home_work_3.calcs.simple;

public class CalculatorWithMathCopy {

    /**
     * Returns the result of division a to b.
     * @param a divident
     * @param b divider
     * @return the result of division type double
     */
    public double division(double a, double b) {
        return a / b;
    }

    /**
     * Returns the result of multiplication a to b.
     * @param a the first multiplier
     * @param b the second multiplier
     * @return the result of multiplication type double
     */
    public double multiplication(double a, double b) {
        return a * b;
    }

    /**
     * Returns the result of subtraction a and b.
     * @param a value
     * @param b subtrahend value
     * @return the result of substruction a and b type double
     */
    public double subtraction(double a, double b) {
        return a - b;
    }

    /**
     * Returns the result of addition a and b.
     * @param a the first term
     * @param b the second term
     * @return the result of addition type double
     */
    public double addition(double a, double b) {
        return a + b;
    }

    /**
     * Returns the result of raising a to the power of b.
     * @param a raised to a power
     * @param b the power
     * @return the result of raising a to the power of b.
     */
    public double pow(double a, int b) {
        return Math.pow(a, b);
    }

    /**
     * Return the absolut value of the passed argument.
     * @param a the passed argument.
     * @return the absolut value of the a.
     */
    public double abs(double a) {
        return Math.abs(a);
    }

    /**
     * Returns the result of taking the square root of the passed argument.
     * @param a the passed argument.
     * @return the result of taking the square root of the a.
     */
    public double sqrt(double a) {
        return Math.sqrt(a);
    }
}
