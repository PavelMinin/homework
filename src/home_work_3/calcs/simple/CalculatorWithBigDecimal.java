package home_work_3.calcs.simple;

import home_work_3.calcs.api.ICalculator;

import java.math.BigDecimal;
import java.math.MathContext;

public class CalculatorWithBigDecimal implements ICalculator {
    private BigDecimal a;
    private BigDecimal b;

    @Override
    public String toString() {
        return "CalculatorWithBigDecimal";
    }

    /**
     * Returns the result of division a to b. Uses BigDecimal.
     * @param a divident
     * @param b divider
     * @return the result of division type double
     */
    public double divide(double a, double b) {
        this.a = new BigDecimal(Double.toString(a));
        this.b = new BigDecimal(Double.toString(b));
        return this.a.divide(this.b).doubleValue();
    }

    /**
     * Returns the result of multiplication a to b. Uses BigDecimal.
     * @param a the first multiplier
     * @param b the second multiplier
     * @return the result of multiplication type double
     */
    public double multiply(double a, double b) {
        this.a = new BigDecimal(Double.toString(a));
        this.b = new BigDecimal(Double.toString(b));
        return this.a.multiply(this.b).doubleValue();
    }

    /**
     * Returns the result of subtraction a and b. Uses BigDecimal.
     * @param a value
     * @param b subtrahend value
     * @return the result of substruction a and b type double
     */
    public double subtract(double a, double b) {
        this.a = new BigDecimal(Double.toString(a));
        this.b = new BigDecimal(Double.toString(b));
        return this.a.subtract(this.b).doubleValue();
    }

    /**
     * Returns the result of addition a and b. Uses BigDecimal.
     * @param a the first term
     * @param b the second term
     * @return the result of addition type double
     */
    public double add(double a, double b) {
        this.a = new BigDecimal(Double.toString(a));
        this.b = new BigDecimal(Double.toString(b));
        return this.a.add(this.b).doubleValue();
    }

    /**
     * Returns the result of raising a to the power of b. Uses BigDecimal.
     * @param a the base
     * @param b the exponent
     * @return the result of raising a to the power of b.
     */
    public double pow(double a, int b) {
        this.a = new BigDecimal(Double.toString(a));
        return this.a.pow(b).doubleValue();
    }

    /**
     * Return the absolut value of the passed argument.
     * @param a the passed argument.
     * @return the absolut value of the a.
     */
    public double abs(double a) {
        this.a = new BigDecimal(Double.toString(a));
        return this.a.abs().doubleValue();
    }

    /**
     * Returns the result of taking the square root of the passed argument.
     * @param a the passed argument.
     * @return the result of taking the square root of the a.
     */
    public double sqrt(double a) {
        this.a = new BigDecimal(Double.toString(a));
        MathContext mc = new MathContext(16);
        return this.a.sqrt(mc).doubleValue();
    }
}
