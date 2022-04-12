package home_work_3.calcs.simple;

public class CalculatorWithMathExtends extends CalculatorWithOperator {

    /**
     * Returns the result of raising a to the power of b.
     * @param a raised to a power
     * @param b the power
     * @return the result of raising a to the power of b.
     */
    @Override
    public double pow(double a, int b) {
        return Math.pow(a, b);
    }


    /**
     * Return the absolut value of the passed argument.
     * @param a the passed argument.
     * @return the absolut value of the a.
     */
    @Override
    public double abs(double a) {
        return Math.abs(a);
    }


    /**
     * Returns the result of taking the square root of the passed argument.
     * @param a the passed argument.
     * @return the result of taking the square root of the a.
     */
    @Override
    public double sqrt(double a) {
        return Math.sqrt(a);
    }
}
