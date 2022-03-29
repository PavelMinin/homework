package home_work_2.loops;

/**
 * Класс выводит на экран строку с решением и результатом факториала числа,
 * введенного как аргумент args[0], тип String, после чего переводится в
 * целочисленный тип int.
 *
 * Пример ввода:
 * 5
 *
 * Результат:
 * 1 * 2 * 3 *4 * 5 = 120
 *
 */
public class Factorial_1_1_2 {
    public static void main(String[] args) {
        long factRes = 1;
        int n = Integer.parseInt(args[0]);

        // По рекомендации среды разработки конструкция String var = arg1 + arg2 + ...
        // была заменена на var.append(arg1).append(arg2)... (class StringBuilder)
        StringBuilder result = new StringBuilder();

        if (n <= 0) { // Проверка выхода за пределы диапазона допустимых значений
            System.out.printf("Введен неверный аргумент n = %d. Необходимо ввести целое положительное число.", n);
        } else {
                factRes = getMult(n); // Вызов рекурсивного метода
            for (int i = 1; i <= n; i++){
                if (i < n){
                    result.append(i).append(" * "); // Заполнение процесса расчета в строке result
                } else {
                    result.append(i).append(" = ").append(factRes); // Заполнение результата операции в строке result
                }
            }
        }

        System.out.println(result); // Вывод ответа в консоль
    }

    public static long getMult (int n){
        if (n == 1){
            return 1;
        }
        return n * getMult (n-1);
    }
}
