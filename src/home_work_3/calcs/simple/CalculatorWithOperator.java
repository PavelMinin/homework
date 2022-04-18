package home_work_3.calcs.simple;

import home_work_3.calcs.api.ICalculator;

public class CalculatorWithOperator implements ICalculator {

    @Override
    public String toString() {
        return "CalculatorWithOperator";
    }

    /**
     * Returns the result of division a to b.
     * @param a divident
     * @param b divider
     * @return the result of division type double
     */
    public double divide(double a, double b) {
        return a / b;
    }

    /**
     * Returns the result of multiplication a to b.
     * @param a the first multiplier
     * @param b the second multiplier
     * @return the result of multiplication type double
     */
    public double multiply(double a, double b) {
        return a * b;
    }

    /**
     * Returns the result of subtraction a and b.
     * @param a value
     * @param b subtrahend value
     * @return the result of substruction a and b type double
     */
    public double subtract(double a, double b) {
        return a - b;
    }

    /**
     * Returns the result of addition a and b.
     * @param a the first term
     * @param b the second term
     * @return the result of addition type double
     */
    public double add(double a, double b) {
        return a + b;
    }

    /**
     * Returns the result of raising a to the power of b.
     * @param a the base
     * @param b the exponent
     * @return the result of raising a to the power of b.
     */
    public double pow(double a, int b) {
        double result = 1;
        if(b == 0) {
            return 1;
        } else if (b < 0) {
            for (int i = b; i < 0 ; i++) {
                result /= a;
            }
        } else {
            for (int i = 1; i <= b; i++) {
                result *= a;
            }
        }

        return result;
    }

    /**
     * Return the absolut value of the passed argument.
     * @param a the passed argument.
     * @return the absolut value of the a.
     */
    public double abs(double a) {
        return a < 0 ? -a : a;
    }

    /**
     * Returns the result of taking the square root of the passed argument.
     * @param a the passed argument.
     * @return the result of taking the square root of the a.
     */
    public double sqrt(double a) {
        if(a == 0) {

            return 0;

        } else if(a == 1) {

            return 1;

        } else if(a < 0) {
            System.out.println("Введено значение меньше 0.\nРезультат не может быть расчитан.\nБыло возвращено значение 0.");

            return 0;

        } else {
            double num;
            double half = a / 2;
            do {
                num = half;
                half =  (num + (a / num)) / 2;
            } while ((num - half) != 0);

            return half;
        }
    }
}
