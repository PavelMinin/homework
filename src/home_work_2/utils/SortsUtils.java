package home_work_2.utils;

public class SortsUtils {

    /**
     * Выполняет сортировку передаваемого массива методом пузырька.
     * @param array массив целочисленных элементов типа int[]
     */
    public static void bubble(int[] array) {
        if(array == null) return;
        if(array.length == 0) return;

        for(int i = 0; i < array.length; i++) { // Перебор все элементов массива
            for(int j = array.length - 1; j > i; j--) { // Перебор всех элементов массива после i-го
                if(array[j-1] > array[j]) { // Если левый элемент больше правого - меняем местами
                    int temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    /**
     * Выполняет сортировку передаваемого массива шейкерным методом.
     * @param array массив целочисленных элементов типа int[]
     */
    public static void shake(int[] array) {
        if(array == null) return;
        if(array.length == 0) return;

        int left = 0; // Левая граница сортируемой области массива
        int right = array.length - 1; // Правая граница сортируемой области массива
        int flag = 1; // Флаг наличия перемещений

        while((left < right) && flag > 0) {

            flag = 0; // Обнуляем флаг перед выполнением перебора массива

            for(int i = left; i < right; i++) { // Перебор слева направо
                if(array[i] > array[i + 1]) { // Если левый больше правого - меняем местами
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    flag = 1; // Перемещения были
                }
            }
            right--; // Сдвишаем влево правую границу

            for(int i = right; i > left; i--) { // Перебор справа налево
                if(array[i - 1] > array[i]) { // Если левый элемент больше правого - меняем местами
                    int temp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = temp;
                    flag = 1; // перемещения были
                }
            }
            left++;
        }
    }
}
