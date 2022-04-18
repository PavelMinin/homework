package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithCounterClassic extends CalculatorWithMathExtends {
    private long count = 0;

    @Override
    public String toString() {
        return "CalculatorWithCounterClassic";
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
