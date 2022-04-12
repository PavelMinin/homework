package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithCounterAutoSuper extends CalculatorWithMathExtends {
    private long count = 0;

    /**
     * Returns the result of raising a to the power of b.
     * Added automatic counter of using, that increments counter;
     * @param a raised to a power
     * @param b the power
     * @return the result of raising a to the power of b.
     */
    @Override
    public double pow(double a, int b) {
        incrementCountOperation();
        return super.pow(a, b);
    }

    /**
     * Return the absolut value of the passed argument.
     * Added automatic counter of using, that increments counter;
     * @param a the passed argument.
     * @return the absolut value of the a.
     */
    @Override
    public double abs(double a) {
        incrementCountOperation();
        return super.abs(a);
    }

    /**
     * Returns the result of taking the square root of the passed argument.
     * Added automatic counter of using, that increments counter;
     * @param a the passed argument.
     * @return the result of taking the square root of the a.
     */
    @Override
    public double sqrt(double a) {
        incrementCountOperation();
        return super.sqrt(a);
    }

    /**
     * Returns the result of division a to b.
     * Added automatic counter of using, that increments counter;
     * @param a divident
     * @param b divider
     * @return the result of division type double
     */
    @Override
    public double division(double a, double b) {
        incrementCountOperation();
        return super.division(a, b);
    }

    /**
     * Returns the result of multiplication a to b.
     * Added automatic counter of using, that increments counter;
     * @param a the first multiplier
     * @param b the second multiplier
     * @return the result of multiplication type double
     */
    @Override
    public double multiplication(double a, double b) {
        incrementCountOperation();
        return super.multiplication(a, b);
    }

    /**
     * Returns the result of subtraction a and b.
     * Added automatic counter of using, that increments counter;
     * @param a value
     * @param b subtrahend value
     * @return the result of substruction a and b type double
     */
    @Override
    public double subtraction(double a, double b) {
        incrementCountOperation();
        return super.subtraction(a, b);
    }

    /**
     * Returns the result of addition a and b.
     * Added automatic counter of using, that increments counter;
     * @param a the first term
     * @param b the second term
     * @return the result of addition type double
     */
    @Override
    public double addition(double a, double b) {
        incrementCountOperation();
        return super.addition(a, b);
    }

    /**
     * The counter of the object using classic. Increments counter, when call the method.
     */
    public void incrementCountOperation() {
         count ++;
    }

    /**
     * Returns current value of the counter of the object using.
     * @return current value of the counter of the object using
     */
    public long getCountOperation() {
        return count;
    }
}
