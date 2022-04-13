package home_work_3.calcs.api;

public interface ICalculator {
    /**
     * Returns the result of division a to b.
     * @param a divident
     * @param b divider
     * @return the result of division type double
     */
    double division(double a, double b);

    /**
     * Returns the result of multiplication a to b.
     * @param a the first multiplier
     * @param b the second multiplier
     * @return the result of multiplication type double
     */
    double multiplication(double a, double b);

    /**
     * Returns the result of subtraction a and b.
     * @param a value
     * @param b subtrahend value
     * @return the result of subtruction a and b type double
     */
    double subtraction(double a, double b);

    /**
     * Returns the result of addition a and b.
     * @param a the first term
     * @param b the second term
     * @return the result of addition type double
     */
    double addition(double a, double b);

    /**
     * Returns the result of raising a to the power of b.
     * @param a the base
     * @param b the exponent
     * @return the result of raising a to the power of b.
     */
    double pow(double a, int b);

    /**
     * Return the absolut value of the passed argument.
     * @param a the passed argument.
     * @return the absolut value of the a.
     */
    double abs(double a);

    /**
     * Returns the result of taking the square root of the passed argument.
     * @param a the passed argument.
     * @return the result of taking the square root of the a.
     */
    double sqrt(double a);
}
