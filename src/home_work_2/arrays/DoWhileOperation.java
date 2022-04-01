package home_work_2.arrays;

// Наследуем класс от интерфейса IArraysOperation и реализуем все его методы используя do...while
public class DoWhileOperation implements IArraysOperation {
    @Override
    public void showArrayElements(int[] array) {
        System.out.println("Вывод каждого элемента массива в строку.");
        int i = 0;
        StringBuilder arrayStr = new StringBuilder();
        do {
            arrayStr.append(array[i]).append("\t");
            i++;
        } while (i < array.length);
        System.out.println(arrayStr);
    }

    @Override
    public void showEachSecondArrayElement(int[] array) {
        System.out.println("Вывод каждого второго элемента массива в строку.");
        int i = 0;
        StringBuilder arrayStr = new StringBuilder();
        do {
            if ((i+1) % 2 == 0){
                arrayStr.append(array[i]).append("\t");
            }
            i++;
        } while (i < array.length);
        System.out.println(arrayStr);
    }

    @Override
    public void showInvertedArrayElements(int[] array) {
        System.out.println("Вывод элементов массива в строку в обратном порядке.");
        int i = array.length - 1;
        StringBuilder arrayStr = new StringBuilder();
        do {
            arrayStr.append(array[i]).append("\t");
            i--;
        } while (i >= 0);
        System.out.println(arrayStr);
    }
}
