package home_work_1;

public class MathExperiments {
    public static void main(String[] args) {
        int intValue = Integer.MAX_VALUE;
        float floatValue = -1.576F;
        double doubleValue = 13456.0000000001;

        System.out.println(intValue + "\n" + floatValue + "\n" + doubleValue); // Вывод исходных данных

        int a;
        float b;
        double c;

        b = Math.abs(floatValue); // возврат модуля значения
        System.out.println("abs(float): " + b);

        c = Math.ceil(doubleValue); // округляет в большую сторону
        System.out.println("ceil(double): " + c);

        c = 5485.94578;
        c = Math.copySign(c, -0.176); // присваивает одному операнду знак другого операнда
        System.out.println("copySign(double): " + c);

        for (int i = 0; i < 5; i++){
            c = Math.random() * 1000; // создает произвольное число в диапазоне 0 ... 1.0 типа double
            System.out.println("5 operations random() * 1000: " + c);
        }

        c = Math.pow (c, 1); // возведение первого операнда в степень значения второго операнда
        System.out.println("pow(c, 1):" + c);

        c = Math.pow (c, 0);
        System.out.println("pow(c, 0):" + c);

        System.out.println("b = " + b);
        b = Math.round (b); // математическое округление
        System.out.println("round(b) = " +b);
        b = b / 1.337F;
        System.out.println("b = " + b);
        b = Math.round (b);
        System.out.println("round(b) = " +b);
        b = 1.5F;
        System.out.println("b = " + b);
        b = Math.round (b);
        System.out.println("round(b) = " +b);

        c = Math.PI;
        c = Math.toDegrees(c); // перевод радианов в градусы
        System.out.println("PI -> deg: " + c);

        //a = Math.addExact(intValue, intValue);
        //System.out.println("addExact(MAX_VALUE + MAX_VALUE): " + a);
    }
}
