package home_work_1;

public class OperatorsPriority {
    public static void main(String[] args) {
        int intValue = 0; // переменная для записи значения целочисленного результата
        boolean logicValue; // переменная для записи логического результата истина или ложь

        /*
        5 + 2 / 8 = 5 + 0 = 5
        Согласно таблице приоритетов сначала выполняется деление, затем сложение.
        При делении целых чисел дробная часть теряется.
        */
        intValue = 5 + 2 / 8;
        System.out.println("5 + 2 / 8 = " + intValue);

        /*
        (5 + 2) / 8 = 7 / 8 = 0
        Сначала выполняется операция в скобках, затем проиходит деление.
        При делении целых чисел дробная часть теряется.
        */
        intValue = (5 + 2) / 8; // 0
        System.out.println("(5 + 2) / 8 = " + intValue);

        /*
        (5 + 2++) / 8 = 7 / 8 = 0
        Сначала выполняется операция в скобках, затем проиходит деление.
        Постфиксная форма инкремента означает, что переменная будет инкрементирована после того, как с ней выполнят операцию.
        При делении целых чисел дробная часть теряется.
        */
        int i = 2, j = 0; // объявление дополнительных переменных для использования инкремента и декремента и инициализации
        intValue = (5 + i++) / 8;
        System.out.println("(5 + 2++) / 8 = " + intValue);

        /*
        (5 + 2++) / --8 = 7 / 7 = 1
        Сначала выполняется операция в скобках, затем проиходит деление.
        Постфиксная форма инкремента означает, что переменная будет инкрементирована после того, как с ней выполнят операцию.
        Префиксная форма декремента означает, что переменная будет декрементирована до того, как с ней выполнят операцию.
        */
        i = 2;
        j = 8;
        intValue = (5 + i++) / --j; // 1
        System.out.println("(5 + 2++) / --8 = " + intValue);

        /*
        (5 * 2 >> 2++) / 8-- = (10 >> 2) / 8 = (0b1010 >> 2) / 8 = 0b10 / 8 = 2 / 8 = 0
        Сначала выполняется операция в скобках, затем проиходит деление.
        В скобках сначала выполняется операция умножения, затем операция сдвига вправа с дополнением знака.
        Постфиксная форма инкремента означает, что переменная будет инкрементирована после того, как с ней выполнят операцию.
        Префиксная форма декремента означает, что переменная будет декрементирована до того, как с ней выполнят операцию.
        При делении целых чисел дробная часть теряется.
        */
        i = 2;
        j = 8;
        intValue = (5 * 2 >> i++) / --j; //0
        System.out.println("(5 * 2 >> 2++) / --8 = " + intValue);

        /*
        (5 + 7 > 20 ? 68 : 22 * 2 >> 2++) / --8
        (12 > 20 ? 68 : 44 >> 2) / 7
        (false ? 68 : 0b101100 >> 2) / 7
        (false ? 68 : 0b1011) / 7
        0b1011 / 7
        11 / 7 = 1
        Общий вид тренарной операции:
        var (>,<, >=, <=, ==, !=) (выражение) ? значение if true : значение if false
        Вначале выполняется тренарная операция в скобках.
        Каждая из операций во всех частях тренарной операции выполняется согласно таблице приорететов.
        Значение, ставшее результатом выполнения тренарной операции, затем делится на значение за скобками.
        */
        i = 2;
        j = 8;
        intValue = (5 + 7 > 20 ? 68 : 22 *2 >> i++) / --j; //
        System.out.println("(5 + 7 > 20 ? 68 : 22 * 2 >> 2++) / --8 = " + "В качестве ");

        /*
        Общий вид тренарной операции:
        var (>,<, >=, <=, ==, !=) (выражение) ? значение if true : значение if false
        (5 + 7 > 20 ? 68 >= 68 : 22 * 2 >> 2++) / --8
        (12 > 20 ? true : 44 >> 2) / 7
        (false ? true : 11) / 7
        11 / 7 = 1
        ВНИМАНИЕ!
        Значения, из которых выбирает тренарный оператор, двух разных типов: boolean и int.
        Для работы с такой конструкцие можно попытаться использовать переменную с неявной типизацией (var).
        Однако такая запись приведет к ошибке компиляции. В нашем примере примере после выполнения тренарной операции
        будет проиходить деление значений типа int. Но если бы условие было другим, происходило бы деление значения
        типа boolean на значение типа int. Это недопустимый вариант.
        */
        //i = 2;
        //j = 8;
        //var tempValue = (5 + 7 > 20 ? 68 >= 68 : 22 * 2 >> i++); // / --j;
        //System.out.println("(5 + 7 > 20 ? 68 >= 68 : 22 * 2 >> 2++) / --8 = " + tempValue);

        /*
        6 - 2 > 3 && 12 * 12 <= 119 - логическое выражение
        4 > 3 && 144 <= 119
        true && false
        false
        Сначала выполняются математические операции, затем операторы сравнения.
        В последнюю очередь будет выполняется условное умножение.
        */
        logicValue = 6 - 2 > 3 && 12 * 12 <= 119;
        System.out.println("6 - 2 > 3 &&  12 * 12 <= 119 = " + logicValue);

        logicValue = true && false; // операция условного умножения true AND false = false
        System.out.println("true && false = " + logicValue);
    }
}
