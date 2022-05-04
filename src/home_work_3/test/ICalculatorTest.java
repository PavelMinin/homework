package home_work_3.test;

import home_work_3.calcs.additional.CalculatorWithCounterAutoDecorator;
import home_work_3.calcs.additional.CalculatorWithCounterAutoSuper;
import home_work_3.calcs.additional.CalculatorWithCounterClassic;
import home_work_3.calcs.api.ICalculator;
import home_work_3.calcs.simple.CalculatorWithBigDecimal;
import home_work_3.calcs.simple.CalculatorWithMathCopy;
import home_work_3.calcs.simple.CalculatorWithMathExtends;
import home_work_3.calcs.simple.CalculatorWithOperator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ICalculatorTest {
    public final double resultExp = 4.1 + 15 * 7 + Math.pow((28. / 5), 2);

    private static double testExp(ICalculator calc) {
        double result;
        result = calc.divide(28d, 5d);
        result = calc.pow(result, 2);
        result = calc.add(calc.multiply(15d, 7d), result);
        result = calc.add(result, 4.1);
        return result;
    }

    @Test
    @DisplayName("Тест CalculatorWithOperator")
    public void calculatorWithOperator() {
        ICalculator calc = new CalculatorWithOperator();
        double result = testExp(calc);
        Assertions.assertEquals(resultExp, result);
    }

    @Test
    @DisplayName("Тест CalculatorWithMathCopy")
    public void calculatorWithMathCopy() {
        ICalculator calc = new CalculatorWithMathCopy();
        double result = testExp(calc);
        Assertions.assertEquals(resultExp, result);
    }

    @Test
    @DisplayName("Тест CalculatorWithMathExtends")
    public void calculatorWithMathExtends() {
        ICalculator calc = new CalculatorWithMathExtends();
        double result = testExp(calc);
        Assertions.assertEquals(resultExp, result);
    }

    @Test
    @DisplayName("Тест CalculatorWithBigDecimal")
    public void calculatorWithBigDecimal() {
        ICalculator calc = new CalculatorWithBigDecimal();
        double result = testExp(calc);
        // Точность выше, чем у тестового расчета. Ожидаемое значение было рассчитано внешним калькулятором.
        Assertions.assertEquals(140.46, result);
    }

    @Test
    @DisplayName("Тест CalculatorWithCounterClassic")
    public void calculatorWithCounterClassic() {
        ICalculator calc = new CalculatorWithCounterClassic();
        double result = testExp(calc);
        Assertions.assertEquals(resultExp, result);
    }

    @Test
    @DisplayName("Тест CalculatorWithCounterAutoDecorator")
    public void calculatorWithCounterAutoDecorator() {
        ICalculator calc = new CalculatorWithMathCopy();
        ICalculator calcDecor = new CalculatorWithCounterAutoDecorator(calc);
        double result = testExp(calcDecor);
        Assertions.assertEquals(resultExp, result);
    }

    @Test
    @DisplayName("Тест CalculatorWithCounterAutoSuper")
    public void calculatorWithCounterAutoSuper() {
        ICalculator calc = new CalculatorWithCounterAutoSuper();
        double result = testExp(calc);
        Assertions.assertEquals(resultExp, result);
    }
}
