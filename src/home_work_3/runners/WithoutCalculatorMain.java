package home_work_3.runners;

public class WithoutCalculatorMain {
    public static void main(String[] args) {
        double result;
        System.out.println("Calculate with direct using operators and method Math.pow:");
        result = 4.1 + 15 * 7 + Math.pow((28d / 5d), 2);
        System.out.println("4.1 + 15 * 7 + (28 / 5) ^ 2 = " + result);
    }
}
